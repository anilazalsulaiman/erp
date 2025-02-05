package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReadUtils {

    /**
     * Reads string data from an Excel cell.
     *
     * @param rowIndex  The row index (0-based).
     * @param colIndex  The column index (0-based).
     * @param sheetName The name of the sheet.
     * @return The cell value as a string.
     * @throws IOException If an I/O error occurs.
     */
    public static String readStringData(int rowIndex, int colIndex, String sheetName) throws IOException {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelReadWrite\\LoginCredentials.xlsx";

        // Use try-with-resources to automatically close the input stream and workbook
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)) {

            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet '" + sheetName + "' not found in the Excel file.");
            }

            Row row = sheet.getRow(rowIndex);
            if (row == null) {
                throw new IllegalArgumentException("Row " + rowIndex + " not found in the sheet.");
            }

            Cell cell = row.getCell(colIndex);
            return getCellValueAsString(cell);
        }
    }

    /**
     * Converts a cell's value to a string.
     *
     * @param cell The cell to read.
     * @return The cell value as a string.
     */
    private static String getCellValueAsString(Cell cell) {
        if (cell == null) {
            return ""; // Return empty string for null cells
        }

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                // Convert numeric value to string without decimal places
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getDateCellValue().toString();
                } else {
                    double numericValue = cell.getNumericCellValue();
                    if (numericValue == (long) numericValue) {
                        return String.valueOf((long) numericValue); // Remove decimal for integer values
                    } else {
                        return String.valueOf(numericValue); // Keep decimal for non-integer values
                    }
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}
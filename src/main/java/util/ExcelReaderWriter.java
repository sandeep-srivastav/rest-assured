package util;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class ExcelReaderWriter implements IExcelReaderWriter {

    File file = null;
    FileInputStream fileInputStream = null;
    //XSSFWorkbook workbook = null;
    //XSSFSheet sheet = null;
    HashMap<String, HashMap<String, String>> dataMap = new HashMap<>();

    @Override
    public HashMap<String, String> getKeyValuePair(String workbookName, String sheetName, String key) {
        return null;
    }

    @Override
    public HashMap<String, HashMap<String, String>> getKeyValuePairMap(String workbookName, String sheetName, String key) {
        return null;
    }

    @Override
    public void writeToExcel() {

    }

    @Override
    public boolean createExcel(String workbookPath, String workbookName, String sheetName) {
        return false;
    }

    @Override
    public ArrayList<HashMap<String, String>> getDataFromExcel(String workbookName,
                                                               String sheetName, String Key) {
        return null;
    }

    /*@Override
    public XSSFWorkbook initializeWorkBook(String filePath, String workbookName) throws IOException {
        file = new File(filePath + workbookName);
        fileInputStream = new FileInputStream(file);
        workbook = new XSSFWorkbook(fileInputStream);
        return workbook;
    }*/

    /*@Override
    public XSSFSheet getSheet(String filePath, String workbookName, String sheetName) throws IOException {
        workbook = initializeWorkBook(filePath, workbookName);
        sheet = workbook.getSheet(sheetName);
        return sheet;
    }*/

    @Override
    public HashMap<String, String> readFromExcel(String filepath, String workbookName, String sheetName,
                                                            String testDataKey) throws IOException {
        /*sheet = getSheet(filepath, workbookName, sheetName);
        int keyRowIndex = 0;
        HashMap<String, String> testDataMap = new HashMap<>();
        Row keyRow ;
        for(int i=0; i<sheet.getLastRowNum(); i++){
            keyRow = sheet.getRow(i);
            String keyCellValue = keyRow.getCell(0).getStringCellValue();
            if(keyCellValue.equalsIgnoreCase(testDataKey)){
                keyRowIndex = keyRow.getRowNum();
            }
        }

        Row valueRow = sheet.getRow(keyRowIndex);
        keyRow = sheet.getRow(0);
        for(int i=0; i<valueRow.getLastCellNum(); i++){

            testDataMap.put(keyRow.getCell(i).toString(), valueRow.getCell(i).toString());
        }
        return testDataMap;*/
        return null;
    }
}

package util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public interface IExcelReaderWriter {

    public HashMap<String, String> getKeyValuePair(String workbookName, String sheetName, String key);

    public HashMap<String, HashMap<String, String>> getKeyValuePairMap(String workbookName, String sheetName, String key);

    public void writeToExcel();

    public boolean createExcel(String workbookPath, String workbookName, String sheetName);

    ArrayList<HashMap<String, String>> getDataFromExcel(String workbookName, String sheetName,
                                                        String Key);
    HashMap<String, String> readFromExcel(String filepath, String workbookName, String sheetName,
                                          String Key) throws IOException;
/*    XSSFWorkbook initializeWorkBook(String filePath, String workbookName) throws IOException;

    //XSSFSheet getSheet(String sheetName) throws IOException;

    XSSFSheet getSheet(String filePath, String workbookName, String sheetName) throws IOException;*/
}

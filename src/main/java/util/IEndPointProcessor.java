package util;

import processor.EndPointEnumFactory;

public interface IEndPointProcessor {

    String getModifiedXMLRequest(EndPointEnumFactory endpoints, String pspName,
                                 String workbookName, String sheetName) throws Throwable;
}

package util;

import io.restassured.response.Response;
import processor.EndPointEnumFactory;

import java.util.HashMap;

public interface IRestUtil {

    String setBaseURL(String baseURL);
    String setPostURL(EndPointEnumFactory endPoint, String baseURL);

    HashMap setContentType(String key, String value);

    HashMap setAuthHeaderMap(String key, String value);

    Response sendPostRequest(String xmlBody, HashMap authHeaderMap,
                             HashMap contentTypeHeaderMap, String postUrl);

    Response sendGetRequest(String xmlBody, HashMap authHeaderMap,
                            HashMap contentTypeHeaderMap, String getUrl);

    String getResponseInString(Response response);

        }

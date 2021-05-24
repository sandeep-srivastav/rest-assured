package processor;

public enum EndPointEnumFactory {


    INITIALIZE_PAYMENT("/mpoint/initialize-payment"),
    PSP_PAY("/mpoint/pay"),
    SAVE_CARD("/mpoint/save-card"),
    SAVE_ACCOUNT("/mpoint/save-account"),
    SSO_LOGIN("/app/token"),
    AUTHORIZE_PAYMENT("/mpoint/authorize-payment");

    private final String endpoint;

    EndPointEnumFactory(String endpoint){
        this.endpoint = endpoint;
    }

    public String getEndPoint(){
        return endpoint;
    }
}

package com.jaxws.jobhaven.api.bind.response;
/**
 * @author NetshiaR2
 */
public class ResponseCreateAccount {
    private String actionType;
    private String massage;
    private int errorCode;
    private String accountRef;

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
    
    
}

package com.jaxws.jobhaven.api.beans;

import com.jaxws.jobhaven.api.bind.response.ResponseCreateAccount;
import javax.ejb.Stateless;

/**
 * @author NetshiaR2
 */
@Stateless
public class ResponseHelper {

    public ResponseCreateAccount createResponse(String msg, int errorCode, String actionType) {
        ResponseCreateAccount response = new ResponseCreateAccount();
        response.setMassage(msg);
        response.setErrorCode(errorCode);
        response.setActionType(actionType);
        return response;
    }
}

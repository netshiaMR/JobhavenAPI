package com.jaxws.jobhaven.api.services;

import com.jaxws.jobhaven.api.exception.UpdateException;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author NetshiaR2
 */
@WebService(serviceName = "UpdateServices")
public class UpdateServices {

    @WebMethod(operationName = "updateProfile")
    public String updateProfile(long profileId, String username) throws UpdateException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @WebMethod(operationName = "isDeactivateAccount")
    public boolean isDeactivateAccount(@WebParam(name = "username") String usermname, 
            @WebParam(name = "password") String password) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); 

    }

    @WebMethod(operationName = "updatePassword")
    public String updatePassword(@WebParam(name = "username") String username, 
            @WebParam(name = "securityAnswers") List<String> securityAnswer) throws UpdateException{
            throw new UnsupportedOperationException("Not supported yet.");

    }

    @WebMethod(operationName = "updateUsername")
    public String updateUsername(@WebParam(name = "username") String password,
            @WebParam(name = "securityAnswers") List<String> securityAnswer) throws UpdateException {
            throw new UnsupportedOperationException("Not supported yet.");
    }

}

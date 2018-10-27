package com.jaxws.jobhaven.api.services;

import com.jaxws.jobhaven.api.exception.UpdateException;
import com.jaxws.jobhaven.api.views.Account;
import com.jaxws.jobhaven.api.views.Profile;
import com.jaxws.jobhaven.api.views.UserSession;
import javax.ejb.CreateException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author NetshiaR2
 */
@WebService
public interface JobhavenService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt);

    @WebMethod(operationName = "createAccountService")
    public String createAccountService(Account request) throws CreateException;

    @WebMethod(operationName = "createProfile")
    public String createProfile(UserSession usersession, Profile profile) throws CreateException;

    @WebMethod(operationName = "updateProfile")
    public String updateProfile(UserSession usersession, long profileId, String username) throws UpdateException;

    @WebMethod(operationName = "isDeactivateAccount")
    public boolean isDeactivateAccount(String usermname, String password, boolean isActive) throws Exception;

    @WebMethod(operationName = "updatePassword")
    public String updatePassword(String username, String SecurityQuestion) throws UpdateException;

    @WebMethod(operationName = "updateUsername")
    public String updateUsername(String username, String SecurityQuestion) throws UpdateException;

}

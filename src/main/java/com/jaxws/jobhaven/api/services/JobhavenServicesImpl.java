package com.jaxws.jobhaven.api.services;

import com.jaxws.jobhaven.api.exception.UpdateException;
import com.jaxws.jobhaven.api.views.Account;
import com.jaxws.jobhaven.api.views.Profile;
import com.jaxws.jobhaven.api.views.UserSession;
import javax.ejb.CreateException;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * @author NetshiaR2
 */
@WebService(portName = "JobhavenPort", serviceName = "JobhavenServices",
        targetNamespace = "http://Jobhaven.com/webservices",
        endpointInterface = "com.jaxws.jobhaven.api.services.JobhavenService")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class JobhavenServicesImpl  implements JobhavenService{
    @Override    
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @Override
    public String createAccountService(Account request) throws CreateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createProfile(UserSession usersession, Profile profile) throws CreateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String updateProfile(UserSession usersession, long profileId, String username) throws UpdateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isDeactivateAccount(String accountId, String usermname, boolean isActive) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String updatePassword(String username, String SecurityQuestion) throws UpdateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String updateUsername(String username, String SecurityQuestion) throws UpdateException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

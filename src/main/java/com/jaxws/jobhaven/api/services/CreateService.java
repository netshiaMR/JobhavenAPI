package com.jaxws.jobhaven.api.services;


import com.jaxws.jobhaven.api.beans.ResponseHelper;
import com.jaxws.jobhaven.api.bind.request.CreateAccountRequest;
import com.jaxws.jobhaven.api.bind.request.CreateProfileRequest;
import com.jaxws.jobhaven.api.bind.response.ResponseCreateAccount;
import javax.ejb.CreateException;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 *
 * @author NetshiaR2
 */
@WebService(serviceName = "CreateService",
        targetNamespace = "http://Jobhaven.com/webservices")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
@HandlerChain(file = "handler-chain.xml")
public class CreateService {
    @EJB
    ResponseHelper responseHelper;
            
    @WebMethod(operationName = "createAccountService")
    public ResponseCreateAccount createAccountService(@WebParam(name = "createAccountRequest")CreateAccountRequest request) throws CreateException{
        String username = request.getUsername();
        // pass through the request parem to the ejb create account processor 
        return responseHelper.createResponse("", 500, "");
    }
    
     public  ResponseCreateAccount createProfile(CreateProfileRequest request) throws CreateException {
          return responseHelper.createResponse("", 500, "");
     }
}

package com.jaxws.jobhaven.api.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author NetshiaR2
 */
@WebService(serviceName = "JobhavenServices")
@Stateless()
public class JobhavenServices {
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}

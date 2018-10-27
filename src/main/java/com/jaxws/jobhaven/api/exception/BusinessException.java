package com.jaxws.jobhaven.api.exception;

/**
 * @author NetshiaR2
 */
public class BusinessException  extends Exception{
    private String message;

    public BusinessException(String message) {
        super(message);
    }
    public BusinessException(String message, Throwable cause){
        super(message, cause);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
            
           
            
    
        
}

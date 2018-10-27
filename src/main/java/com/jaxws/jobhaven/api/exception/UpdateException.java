package com.jaxws.jobhaven.api.exception;

import java.sql.SQLException;

/**
 * @author NetshiaR2
 */
public class UpdateException extends SQLException {

    private String message;
    private String errorCode;

    public UpdateException(String msg) {
        super(msg);

    }

    public UpdateException(String msg, String sqlState) {
        super(msg, sqlState);
        this.message = msg;
        this.errorCode = sqlState;
    }

    public UpdateException(String msg, Throwable cause) {
        super(msg, cause);
        this.message = msg;
    }

    public UpdateException(String msg, String sqlState, Throwable cause) {
        super(msg, sqlState, cause);
        this.message = msg;
        this.errorCode = sqlState;
    }
}

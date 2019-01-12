package com.jaxws.jobhaven.api.connections;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * @author NetshiaR2
 */
@Stateless
public class JobhavenConnector {

    private DataSource jobhavenDBSource;

    @PostConstruct
    public void init() {
        try {
            InitialContext ctx = new InitialContext();
            jobhavenDBSource = (DataSource) ctx.lookup("jdbc/jobhavendb");
        } catch (Exception ex) {
           System.out.println("Unable to get DataSource connection");
        }
    }

    public void releaseResources(PreparedStatement pstmt, ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        try (Connection conn = pstmt.getConnection()) {
            pstmt.close();
        }
    }

    public void releaseResources(CallableStatement cstmt, ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        try (Connection conn = cstmt.getConnection()) {
            cstmt.close();
        }
    }

    public Connection getJobhavenDbConnection() throws SQLException {
        if (jobhavenDBSource == null) {
            init();
        }
        return jobhavenDBSource.getConnection();
    }

}

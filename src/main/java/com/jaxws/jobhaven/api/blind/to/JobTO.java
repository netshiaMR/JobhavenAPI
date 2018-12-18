/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaxws.jobhaven.api.views;

import java.io.Serializable;
import javax.ejb.Stateless;

/**
 *
 * @author NetshiaR2
 */
public class Job implements Serializable{
   private  String jobId;
   private String jobTilte;
   private String skills;
   private String companies;
   private String fieldOfStudy;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobTilte() {
        return jobTilte;
    }

    public void setJobTilte(String jobTilte) {
        this.jobTilte = jobTilte;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCompanies() {
        return companies;
    }

    public void setCompanies(String companies) {
        this.companies = companies;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
   
      
}

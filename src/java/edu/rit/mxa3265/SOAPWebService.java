/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rit.mxa3265;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import companydata.*;

/**
 *
 * @author mandros
 */
import java.util.logging.Level;
import java.util.logging.Logger;
@WebService(serviceName = "SOAPWebService")
public class SOAPWebService {

    private DataLayer dl = null;
    private static final String ENVIRONMENT = "production";
    
    public SOAPWebService() {
        try {
            dl = new DataLayer(ENVIRONMENT);
        } catch (Exception ex) {
            System.err.println("Something went wrong while trying to connect to the ");
        }
    }

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteAll")
    public String deleteAll(@WebParam(name = "companyName") String companyName) {
        //TODO write your implementation code here:
        return "json string of success or error";
    }

    @WebMethod(operationName = "getDepartment")
    public String getDepartment(@WebParam(name = "inJson") String inJson) {
        //TODO write your implementation code here:
        return "JSON FORMAT of the returned department or error json";
    }
    
    @WebMethod(operationName = "getAllDepartments")
    public String getAllDepartments(@WebParam(name = "company") String company) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "insertDepartment")
    public String insertDepartment(@WebParam(name = "inJson") String inJson) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "updateDepartment")
    public String updateDepartment(@WebParam(name = "inJson") String inJson) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "deleteDepartment")
    public String deleteDepartment(@WebParam(name = "inJson") String inJson) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "getEmployee")
    public String getEmployee(@WebParam(name = "emp_id") int emp_id) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "getAllEmployees")
    public String getAllEmployees(@WebParam(name = "company") String company) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "insertEmployee")
    public String insertEmployee(@WebParam(name = "inJson") String inJson) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "updateEmployee")
    public String updateEmployee(@WebParam(name = "inJson") String inJson) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "deleteEmployee")
    public String deleteEmployee(@WebParam(name = "emp_id") int emp_id) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "getTimecard")
    public String getTimecard(@WebParam(name = "timecard_id") int timecard_id) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "getAllTimecards")
    public String getAllTimecards(@WebParam(name = "emp_id") int emp_id) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
    @WebMethod(operationName = "insertTimecard")
    public String insertTimecard(@WebParam(name = "emp_id") int emp_id) {
        //TODO write your implementation code here:
        return "JSON FORMAT all departments or error json";
    }
    
}

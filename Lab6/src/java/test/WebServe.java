/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Thomas
 */
@WebService(serviceName = "WebServe")
public class WebServe {
    private List<People> people;

    public WebServe() {
        this.people = new ArrayList<People>();
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
    @WebMethod(operationName = "sayBlah")
    public String sayBlah(@WebParam(name = "parameter") int parameter) {
        //TODO write your implementation code here:
        String s ="";
        for(int i=0;i<parameter;i++){
            s+="blah ";
        }
        return s;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "makePeople")
    public People makePeople(@WebParam(name = "name") String name, @WebParam(name = "email") String email, @WebParam(name = "age") int age) {
        //TODO write your implementation code here:
        People p =new People(name, email, age);
        this.people.add(p);
        return p;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getUsers")
    public People[] getUsers() {
        //TODO write your implementation code here:
        return (People[])this.people.toArray();
    }
    
}

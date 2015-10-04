/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webclient;

import test.People;

/**
 *
 * @author Thomas
 */
public class Webclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sayBlah(20));
        System.out.println(makePeople("athony", "anthony.stupid@mail.com", 20));
    }

    private static String sayBlah(int parameter) {
        test.WebServe_Service service = new test.WebServe_Service();
        test.WebServe port = service.getWebServePort();
        return port.sayBlah(parameter);
    }

    private static People makePeople(String name, String email, int age) {
        test.WebServe_Service service = new test.WebServe_Service();
        test.WebServe port = service.getWebServePort();
        return port.makePeople(name, email, age);
    }

    
    
}

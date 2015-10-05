/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serve;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateful;

/**
 *
 * @author Thomas
 */
@Stateful
@DeclareRoles({"Lab7","thom"})
@RolesAllowed({"Lab7","thom"})
public class STBean implements STBeanLocal {

    private String message ="Hello world!";
    
    @PermitAll
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}

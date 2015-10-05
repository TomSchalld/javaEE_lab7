/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serve;

import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface STBeanLocal {
    public String getMessage();
    public void setMessage(String message);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protected_proxy;

import java.lang.reflect.*;

/**
 *
 * @author mohamed
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;
    
    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }
    
    @Override
    public Object invoke(Object o, Method method, Object[] os) throws IllegalAccessException {
        try {
            if(method.getName().equals("setHotOrNotRating")) {
                method.invoke(personBean, os);
            }
            else if(method.getName().startsWith("set") || method.getName().startsWith("get")) {
                method.invoke(personBean, os);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    

}

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
public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;
    
    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }
    
    @Override
    public Object invoke(Object o, Method method, Object[] os) throws IllegalAccessException {
        try {
            if(method.getName().startsWith("get")) {
                return method.invoke(personBean, os);
            }
            else if(method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            }
            else if(method.getName().contains("set")) {
                return method.invoke(personBean, os);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    
}

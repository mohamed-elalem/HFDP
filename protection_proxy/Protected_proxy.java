/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protected_proxy;

import java.lang.reflect.Proxy;

/**
 *
 * @author mohamed
 */
public class Protected_proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonBean person1 = new PersonBeanImpl("Anonymous", "Male", "None", 45);
        PersonBean person2 = new PersonBeanImpl("Anonymous", "Female", "None", 55);
        PersonBean ownerProxy1 = getOwnerProxy(person1);
        PersonBean nonOwnerProxy1 = getNonOwnerProxy(person2);
        ownerProxy1.setGender("Female");
        ownerProxy1.setHotOrNotRating(488);
    }
    
    
    public static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }
    
    public static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }
}

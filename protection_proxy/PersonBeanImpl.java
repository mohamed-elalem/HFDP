/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protected_proxy;

/**
 *
 * @author mohamed
 */
public class PersonBeanImpl implements PersonBean {
    
    private String name;
    private String gender;
    private String interests;
    private double rating;
    private int ratingCount;

    public PersonBeanImpl(String name, String gender, String interests, double rating) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.rating = rating;
        this.ratingCount = 0;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public double getHotOrNotRating() {
        if(ratingCount == 0)
            return 0;
        return rating / ratingCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public void setHotOrNotRating(double rating) {
        this.rating += rating;
        this.ratingCount++;
    }
    
}

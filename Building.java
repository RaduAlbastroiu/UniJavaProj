/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ood_lab;

/**
 *
 * @author ducu
 */
public class Building implements IobjectWithAge {

    private IobjectWithAge objectWithAge;
    
    private String street;
    
    public Building(String street, IobjectWithAge objectWithAge) {
        this.street = street;
        this.objectWithAge = objectWithAge;
    }
    public boolean olderThanAge(IageEntity ageControl) {
        return objectWithAge.olderThanAge(ageControl);
    }

    public boolean olderThan(IobjectWithAge someObj) {
        return objectWithAge.olderThan(someObj);
    }
    
    public void print() {
        System.out.println(" This is a Building on street: " + street);
        objectWithAge.print();
    }
    
}

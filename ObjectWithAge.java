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
public abstract class ObjectWithAge implements IobjectWithAge {
    
    protected IageEntity age;
    
    public ObjectWithAge(IageEntity age) {
        this.age = age;
    }

    public boolean olderThanAge(IageEntity ageControl) {
        if (age.greaterThan(ageControl)) {
            return true;
        }
        return false;
    }

    public boolean olderThan(IobjectWithAge someObj) {
        if (someObj.olderThanAge(age)) {
            return false;
        }
        return true;
    }
    
    public void print() {
        System.out.println(" Age: " + age.print());
    }
    
}

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
public abstract class AgeingEntity implements IAgeingEntity {
    
    protected IAge age;
    
    public AgeingEntity(IAge age) {
        this.age = age;
    }

    public boolean olderThanAge(IAge ageControl) {
        if (age.greaterThan(ageControl)) {
            return false;
        }
        return true;
    }

    public boolean olderThan(IAgeingEntity someObj) {
        if (someObj.olderThanAge(age)) {
            return false;
        }
        return true;
    }
    
    public void print() {
        System.out.println(" Age: " + age.print());
    }
    
}

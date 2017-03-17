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
public class Age implements IAge {

    private int age;
    
    public Age(int years) {
        this.age = years;
    }
    
    public boolean greaterThan(IAge ageObj) {
        return ageObj.greaterThanAge(age);
    }

    @Override
    public boolean greaterThanAge(int ageControl) {
        if(age > ageControl)
            return true;
        return false;
    }

    @Override
    public String print() {
        return Integer.toString(age);
    }
    
}

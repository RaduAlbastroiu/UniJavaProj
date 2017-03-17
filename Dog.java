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
public class Dog implements IAgeingEntity {

    private IAgeingEntity ageEntity;
    
    private String name;
    
    public Dog(String name, IAgeingEntity objectWithAge) {
        this.name = name;
        this.ageEntity = objectWithAge;
    }
    
    public boolean olderThanAge(IAge ageControl) {
        return ageEntity.olderThanAge(ageControl);
    }

    public boolean olderThan(IAgeingEntity someObj) {
        return ageEntity.olderThan(someObj);
    }
    
    public void print() {
        System.out.println(" This is a Dog named: " + name);
        ageEntity.print();
    }
}

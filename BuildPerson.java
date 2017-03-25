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
public class BuildPerson implements IBuilder {
    
    public IAgeingEntity create(int someAge, String someString) {
        IAgeingEntityBuilder ageEntityBuilder = new AgeingEntityBuilder();
        IAgeingEntity ageingEntity = ageEntityBuilder.create(someAge);
        
        Person aPerson = new Person(someString, ageingEntity);
        
        return aPerson;
    }
    
}

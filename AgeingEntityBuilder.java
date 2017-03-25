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
public class AgeingEntityBuilder implements IAgeingEntityBuilder {
    
    public IAgeingEntity create(int someAge) {
        
        IAgeBuilder ageBuilder = new AgeBuilder();
        IAge age = ageBuilder.create(someAge);
        
        IAgeingEntity ageEntity = new AgeingEntity(age) {};
        return ageEntity;
    }
    
}

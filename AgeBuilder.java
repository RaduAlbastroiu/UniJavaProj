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
public class AgeBuilder implements IAgeBuilder {
    
    public IAge create(int someAge) {
        IAge age = new Age(someAge);
        return age;
    }
    
}

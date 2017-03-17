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
public class OOD_LAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO:
        // builder for IAgeingEntity and Iage
        
        GroupOfAgeingEntities base = new GroupOfAgeingEntities();
        
        IAge helperAgePerson = new Age(25);
        IAgeingEntity helperPerson = new AgeingEntity(helperAgePerson) {};
        IAgeingEntity person = new Person("Gicu", helperPerson);
        
        IAge helperAgeBuilding = new Age(37);
        IAgeingEntity helperBuilding = new AgeingEntity(helperAgeBuilding) {};
        IAgeingEntity building = new Building("bvd Oltenia", helperBuilding);
        
        IAge helperAgeDog = new Age(7);
        IAgeingEntity helperDog = new AgeingEntity(helperAgeDog) {};
        IAgeingEntity dog = new Dog("Bruno", helperDog);
        
        base.add(person);
        base.add(building);
        base.add(dog);
        
        Dialog dialog = new Dialog(base);
        dialog.start();
    }
    
}

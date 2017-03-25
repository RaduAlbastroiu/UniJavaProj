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
        // relatif age comparison
        
        GroupOfAgeingEntities base = new GroupOfAgeingEntities();
        
        IBuilder buildPerson = new BuildPerson();
        IAgeingEntity person = buildPerson.create(25, "Gicu");
        
        /**
         * IAge helperAgePerson = new Age(25);
         * IAgeingEntity helperPerson = new AgeingEntity(helperAgePerson) {};
         * IAgeingEntity person = new Person("Gicu", helperPerson);
         */
        
        IBuilder buildBuilding = new BuildBuilding();
        IAgeingEntity building = buildBuilding.create(37, "bvd Oltenia");
        
        /**
         * IAge helperAgeBuilding = new Age(37);
         * IAgeingEntity helperBuilding = new AgeingEntity(helperAgeBuilding) {};
         * IAgeingEntity building = new Building("bvd Oltenia", helperBuilding);
         */
        
        IBuilder buildDog = new BuildDog();
        IAgeingEntity dog = buildDog.create(7, "Bruno");
        
        /**
         * IAge helperAgeDog = new Age(7);
         * IAgeingEntity helperDog = new AgeingEntity(helperAgeDog) {};
         * IAgeingEntity dog = new Dog("Bruno", helperDog);
         */
        
        base.add(person);
        base.add(building);
        base.add(dog);
        
        Dialog dialog = new Dialog(base);
        dialog.start();
    }
    
}

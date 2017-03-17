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
        // TODO code application logic here
        
        AgingEntitiesGroup base = new AgingEntitiesGroup();
        
        IageEntity helperAgePerson = new ageEntity(25);
        IobjectWithAge helperPerson = new ObjectWithAge(helperAgePerson) {};
        IobjectWithAge person = new Person("Gicu", helperPerson);
        
        IageEntity helperAgeBuilding = new ageEntity(37);
        IobjectWithAge helperBuilding = new ObjectWithAge(helperAgeBuilding) {};
        IobjectWithAge building = new Building("bvd Oltenia", helperBuilding);
        
        IageEntity helperAgeDog = new ageEntity(7);
        IobjectWithAge helperDog = new ObjectWithAge(helperAgeDog) {};
        IobjectWithAge dog = new Dog("Bruno", helperDog);
        
        base.add(person);
        base.add(building);
        base.add(dog);
        
        Dialog dialog = new Dialog(base);
        dialog.start();
    }
    
}

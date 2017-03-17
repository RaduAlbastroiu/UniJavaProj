/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ood_lab;

import static java.lang.System.in;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ducu
 */
public class Dialog {
    
    private GroupOfAgeingEntities base;
    
    private Scanner reader = new Scanner(System.in);
    
    public Dialog(GroupOfAgeingEntities base) {
        this.base = base;
    }
    
    public void start() {
        while(true)
        {
            System.out.println(" Chose your option:");
            System.out.println("  1. Give oldest");
            System.out.println("  2. Give older than some age");
            System.out.println("  3. Stop");
            System.out.print(" Your option: ");
            
            int choice = reader.nextInt();
            
            if(choice == 3)
                break;
            
            if(choice == 1) {
                IAgeingEntity oldest = base.oldest();
                
                System.out.println();
                oldest.print();
            }
            
            if(choice == 2) {
                System.out.print(" Age: ");
                int a = reader.nextInt();
                IAge age = new Age(a);
                
                List<IAgeingEntity> olderThan = base.olderThanAge(age);
                
                System.out.println();
                for(IAgeingEntity obj:olderThan) {
                    obj.print();
                }
            }
            
            System.out.println();
            System.out.println();
        }
    }
}

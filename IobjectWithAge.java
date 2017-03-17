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
public interface IobjectWithAge {
    
    public boolean olderThan(IobjectWithAge someObj);
    
    public boolean olderThanAge(IageEntity ageControl);
    
    public void print();
    
}

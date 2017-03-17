/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ood_lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ducu
 */
public class AgingEntitiesGroup {
    
    private List<IobjectWithAge> objectsWithAge = new ArrayList<IobjectWithAge>();

    public void add(IobjectWithAge objectAge) {
        objectsWithAge.add(objectAge);
    }
    
    public IobjectWithAge oldest() {
        IobjectWithAge oldest = objectsWithAge.get(0);
        
        for(IobjectWithAge someObj: objectsWithAge) {
            if(someObj.olderThan(oldest))
                oldest = someObj;
        }
        
        return oldest;
    }
    
    public List<IobjectWithAge> olderThanAge(IageEntity ageControl) {
        List<IobjectWithAge> olderThan = new ArrayList<IobjectWithAge>();
        
        for(IobjectWithAge someObj: objectsWithAge) {
            if(someObj.olderThanAge(ageControl))
                olderThan.add(someObj);
        }
        
        return olderThan;
    }
}

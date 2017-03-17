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
public class GroupOfAgeingEntities {
    
    private List<IAgeingEntity> ageingEntities = new ArrayList<IAgeingEntity>();

    public void add(IAgeingEntity objectAge) {
        ageingEntities.add(objectAge);
    }
    
    public IAgeingEntity oldest() {
        IAgeingEntity oldest = ageingEntities.get(0);
        
        for(IAgeingEntity ageingEntity: ageingEntities) {
            if(ageingEntity.olderThan(oldest))
                oldest = ageingEntity;
        }
        
        return oldest;
    }
    
    public List<IAgeingEntity> olderThanAge(IAge ageControl) {
        List<IAgeingEntity> olderThan = new ArrayList<IAgeingEntity>();
        
        for(IAgeingEntity someObj: ageingEntities) {
            if(someObj.olderThanAge(ageControl))
                olderThan.add(someObj);
        }
        
        return olderThan;
    }
}

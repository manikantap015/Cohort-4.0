package com.example.spring_boot_cohort;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, @Qualifier("chocolate")Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

   public void bakeCake(){
         System.out.println("Baking a delicious cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType());
   }
}

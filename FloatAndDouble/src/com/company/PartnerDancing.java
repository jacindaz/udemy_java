package com.company;

/**
 * Created by jacindazhong on 12/14/15.
 */
public class PartnerDancing extends Dance {
    private String partnerName;
    private String favoriteCouple;
    private Integer numTypesOfPartnerDancing;

    public PartnerDancing(String partnerName, String favoriteCouple, Integer numTypesOfPartnerDancing) {
        super();
        this.partnerName = partnerName;
        this.favoriteCouple = favoriteCouple;
        this.numTypesOfPartnerDancing = numTypesOfPartnerDancing;
    }

    public PartnerDancing() {}
}


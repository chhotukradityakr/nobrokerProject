package com.nobroker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name ="owner_plans")
public class OwnerPlan {

    @Id
    private long pland;

    @Column(name = "plan_name",unique = true)
    private String planName;

    @Column(name = "price")
    private double price;

    @Column(name = "plan_Validity")
    private int planValidity;

    @Column(name = "relationship_Manager")
    private boolean relationshipManager;

    @Column(name = "rental_Agreement")
   private boolean rentalAgreement;

    @Column(name = "property_Promotion")
    private boolean propertyPromotion;

    @Column(name = "guaranteed_Tenants")
    private boolean guaranteedTenants;

    @Column(name = "showing_Property")
    private boolean showingProperty;

    @Column(name = "facebook_Marketing_of_Property")
    private boolean facebookMarketingofProperty;
}

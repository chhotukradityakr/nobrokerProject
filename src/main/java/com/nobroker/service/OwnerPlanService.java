package com.nobroker.service;


import com.nobroker.payload.OwnerPlanDto;
import org.apache.catalina.LifecycleState;

import java.util.List;


import java.util.List;

public interface OwnerPlanService {
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);

    List<OwnerPlanDto>getAllOwnerPlans();
}
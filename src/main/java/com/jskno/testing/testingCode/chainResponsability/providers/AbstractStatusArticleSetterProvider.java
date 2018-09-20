package com.jskno.testing.testingCode.chainResponsability.providers;

import java.util.List;

import com.jskno.testing.testingCode.chainResponsability.model.Feature;
import com.jskno.testing.testingCode.chainResponsability.statusSetterServices.SetStatusService;

public abstract class AbstractStatusArticleSetterProvider implements StatusArticleSetterProvider{
    
    protected List<SetStatusService> setStatusServices;
    protected Feature feature;
    
    @Override
    public List<SetStatusService> getStatusSetterServices() {
        return this.setStatusServices;
    }
    
    @Override
    public Feature getFeature() {
        return this.feature;
    }

}

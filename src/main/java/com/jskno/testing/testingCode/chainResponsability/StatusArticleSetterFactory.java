package com.jskno.testing.testingCode.chainResponsability;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jskno.testing.testingCode.chainResponsability.model.Feature;
import com.jskno.testing.testingCode.chainResponsability.providers.StatusArticleSetterProvider;
import com.jskno.testing.testingCode.chainResponsability.statusSetterServices.SetStatusService;

@Component
public class StatusArticleSetterFactory {

    @Autowired
    private List<StatusArticleSetterProvider> statusArticleSetterProviders;

    private Map<Feature, List<SetStatusService>> statusArticleSetters;

    @PostConstruct
    public void init() {

        this.statusArticleSetters = new HashMap<>();

        for (final StatusArticleSetterProvider provider : this.statusArticleSetterProviders) {
            this.statusArticleSetters.put(provider.getFeature(), provider.getStatusSetterServices());
        }

    }
    
    public List<SetStatusService> getStatusArticleSetterServices(Feature feature) {
        return this.statusArticleSetters.get(feature);
        
    }
    
    
}

package com.jskno.testing.testingCode.chainResponsability.providers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jskno.testing.testingCode.chainResponsability.model.Feature;
import com.jskno.testing.testingCode.chainResponsability.statusSetterServices.SetStatusService;

@Component
public class ShippingStatusArticleSetterProvider extends AbstractStatusArticleSetterProvider {
    
    public ShippingStatusArticleSetterProvider() {
        this.feature = Feature.SHIPPING;
    }
    
    @Autowired
    @Qualifier("setStatusFromTable1ServiceImpl")
    private SetStatusService setStatusFromTable1ServiceImpl;
       
    @PostConstruct
    public void init() {

        final List<SetStatusService> servicesList = new ArrayList<>();
        servicesList.add(this.setStatusFromTable1ServiceImpl);

        this.setStatusServices = Collections
                .unmodifiableList(new ArrayList<>(servicesList));
    }
    
    
}

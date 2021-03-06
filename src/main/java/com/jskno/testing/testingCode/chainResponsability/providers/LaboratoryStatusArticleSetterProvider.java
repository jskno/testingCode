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
public class LaboratoryStatusArticleSetterProvider extends AbstractStatusArticleSetterProvider {
    
    public LaboratoryStatusArticleSetterProvider() {
        this.feature = Feature.LABORATORY;
    }
    
    @Autowired
    @Qualifier("setStatusFromTable2ServiceImpl")
    private SetStatusService setStatusFromTable2ServiceImpl;
    
    @Autowired
    @Qualifier("setStatusFromExternalAppServiceImpl")
    private SetStatusService setStatusFromExternalAppServiceImpl;
    
    @PostConstruct
    public void init() {

        final List<SetStatusService> servicesList = new ArrayList<>();
        servicesList.add(this.setStatusFromTable2ServiceImpl);
        servicesList.add(this.setStatusFromExternalAppServiceImpl);

        this.setStatusServices = Collections
                .unmodifiableList(new ArrayList<>(servicesList));
    }
    
    
}

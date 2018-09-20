package com.jskno.testing.testingCode.chainResponsability.providers;

import java.util.List;

import com.jskno.testing.testingCode.chainResponsability.model.Feature;
import com.jskno.testing.testingCode.chainResponsability.statusSetterServices.SetStatusService;

public interface StatusArticleSetterProvider {

    Feature getFeature();

    List<SetStatusService> getStatusSetterServices();

}

package com.jskno.testing.testingCode.chainResponsability.statusSetterServices;

import java.util.List;

import com.jskno.testing.testingCode.chainResponsability.model.Article;
import com.jskno.testing.testingCode.chainResponsability.model.Feature;

public interface SetStatusService {

    List<Article> setStatus(List<Article> articles, Feature feature);

}

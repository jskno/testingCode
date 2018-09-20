package com.jskno.testing.testingCode.chainResponsability.statusSetterServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jskno.testing.testingCode.chainResponsability.model.Article;
import com.jskno.testing.testingCode.chainResponsability.model.Feature;
import com.jskno.testing.testingCode.chainResponsability.model.Status;
import com.jskno.testing.testingCode.chainResponsability.utils.RandomValueGenerator;

@Component
public class SetStatusInTable1ServiceImpl implements SetStatusService {
    
    @Autowired
    private RandomValueGenerator randomValueGenerator;

    @Override
    public List<Article> setStatus(List<Article> articles, Feature feature) {
        
        List<Article> nonStatusArticle = new ArrayList<>();
        
        for(final Article article : articles) {
            if(isArticleFeatureInTable1(article, feature)) {
                article.addStatus(feature, Status.OK);
            } else {
                nonStatusArticle.add(article);
            }
        }
        return nonStatusArticle;
    }
    
    private boolean isArticleFeatureInTable1(Article article, Feature feature) {
        return randomValueGenerator.getRandomBoolean();
    }

}

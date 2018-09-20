package com.jskno.testing.testingCode.chainResponsability;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.jskno.testing.testingCode.chainResponsability.model.Article;
import com.jskno.testing.testingCode.chainResponsability.model.Feature;
import com.jskno.testing.testingCode.chainResponsability.model.Type;

public class ChainTest {

    @Test
    public void testingChain() {

        final List<Article> articulos = getArticles();
        
        for(Feature feature : Feature.values()) {
            
        }

    }

    private List<Article> getArticles() {
        return Arrays.asList(
                new Article("article1", Type.CLOTHES),
                new Article("article2", Type.FOOD),
                new Article("article3", Type.CLOTHES));
    }

}

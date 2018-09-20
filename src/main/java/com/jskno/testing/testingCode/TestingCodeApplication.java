package com.jskno.testing.testingCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jskno.testing.testingCode.chainResponsability.StatusArticleSetterFactory;
import com.jskno.testing.testingCode.chainResponsability.model.Article;
import com.jskno.testing.testingCode.chainResponsability.model.Feature;
import com.jskno.testing.testingCode.chainResponsability.model.Type;
import com.jskno.testing.testingCode.chainResponsability.statusSetterServices.SetStatusService;

@SpringBootApplication
public class TestingCodeApplication {
    
    @Autowired
    private static StatusArticleSetterFactory setterFactory;

	public static void main(String[] args) {
	    
		SpringApplication.run(TestingCodeApplication.class, args);
		
        final List<Article> articles = getArticles();
        
        List<Article> elementToSet = new ArrayList<>(articles);
        for(Feature feature : Feature.values()) {
            for(SetStatusService service : setterFactory.getStatusArticleSetterServices(feature)) {
                elementToSet = service.setStatus(elementToSet, feature);
            }
            
        }
	}
	
    private static List<Article> getArticles() {
        return Arrays.asList(
                new Article("article1", Type.CLOTHES),
                new Article("article2", Type.FOOD),
                new Article("article3", Type.CLOTHES));
    }
}

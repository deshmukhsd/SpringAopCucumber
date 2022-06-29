package org.example.businessLayer;


import org.example.screen.AmazonHomeScreen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchBL {
    @Autowired
    public SearchBL() {
    }
    public SearchBL searchFor(String product) {
        AmazonHomeScreen.get().searchFor(product);
        return this;
    }

    public SearchBL fetchProductSearchSuggestions() {
        System.out.println("fetchProductSearchSuggestions");
        return this;
    }
}

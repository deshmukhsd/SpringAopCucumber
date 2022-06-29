package org.example.businessLayer;


import org.example.screen.AmazonHomeScreen;
import org.example.screen.web.AmazonHomeScreenWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeBL {
    public static AmazonHomeScreen amazonHomeScreen;

    @Autowired
    public HomeBL(AmazonHomeScreen amazonHomeScreen ) {
        this.amazonHomeScreen=amazonHomeScreen;
    }
    public SearchBL navigateTo(){
        amazonHomeScreen.get().navigateUserToHomePage();
        return new SearchBL();
    }


}

package org.example.screen;


import org.example.screen.web.AmazonHomeScreenWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public abstract class AmazonHomeScreen {

    public static AmazonHomeScreen get(){
                return new AmazonHomeScreenWeb();
    }

    public abstract AmazonHomeScreen navigateUserToHomePage();

    public abstract AmazonHomeScreen searchFor(String productNm);
}

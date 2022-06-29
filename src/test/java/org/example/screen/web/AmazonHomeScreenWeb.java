package org.example.screen.web;

import org.example.screen.AmazonHomeScreen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmazonHomeScreenWeb extends AmazonHomeScreen {

    @Autowired
    public AmazonHomeScreenWeb() {
    }


    @Override
    public AmazonHomeScreen navigateUserToHomePage() {
        System.out.println("navigateUserToHomePage");
        return this;
    }

    @Override
    public AmazonHomeScreen searchFor(String productNm) {
        System.out.println("searchFor "+productNm);
        return this;
    }

}

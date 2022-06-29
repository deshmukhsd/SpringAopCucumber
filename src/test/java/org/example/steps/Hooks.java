package org.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


public class Hooks {

    private static long ScenarioExeStartTime;
    private static long StepExeStartTime;


    @Before
    public void beforeScenario(){
        System.out.println("\n$$$$$ Before Scenario Hook is executing $$$$$");
        ScenarioExeStartTime=System.currentTimeMillis();
    }

    @After
    public void afterScenario(){
        long scenarioExeEndTime = System.currentTimeMillis();
        System.out.println("\n$$$$$ After Scenario Hook is executing $$$$$");
        System.out.println("#### TOTAL SCENARIO EXECUTION TIME: "+(scenarioExeEndTime -ScenarioExeStartTime)+" milliSeconds ####");
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("\n$$$$$ Before Step Hook is executing $$$$$");
        StepExeStartTime=System.currentTimeMillis();
    }

    @AfterStep
    public void afterStep(){
        long stepExeEndTime = System.currentTimeMillis();
        System.out.println("$$$$$ After Step Hook is executing $$$$$");
        System.out.println("#### TOTAL STEP EXECUTION TIME FOR STEP: "+(stepExeEndTime -StepExeStartTime)+" milliSeconds ####");
    }

}

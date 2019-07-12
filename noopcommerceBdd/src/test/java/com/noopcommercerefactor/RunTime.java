package com.noopcommercerefactor;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features=".",tags ="@email",format = {"pretty","html:target/cucumber-reports"})
public class RunTime {
}

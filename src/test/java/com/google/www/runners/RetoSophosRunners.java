package com.google.www.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(
        features = "src//test//resources//com//google//www//features//RetoSophosMetro.feature",
        tags = {"@Metro"},
        glue = {"com.google.www.stepdefinitions"},
        snippets = CAMELCASE

)
@RunWith(CucumberWithSerenity.class)
public class RetoSophosRunners {

}

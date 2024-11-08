package com.aliexpress.demo.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber/fast-report/cucumber-pretty.html",
        "json:target/cucumber/cucumber.json"},
        features = "src/test/java/resources/addToCart.feature",
tags = "@ADD_TO_CART_DEMO",
glue = "com.aliexpress.demo.stepdefinitions",
snippets = SnippetType.CAMELCASE )
public class AddToCartRunner {

}

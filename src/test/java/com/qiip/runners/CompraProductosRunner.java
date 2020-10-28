package com.qiip.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compra_productos.feature", glue = "com.qiip.stepdefinitions", snippets = SnippetType.CAMELCASE)

public class CompraProductosRunner {

}

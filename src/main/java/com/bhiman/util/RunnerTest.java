package com.bhiman.util;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/main/resources/Features/AddBank.feature", glue = "com.bhiman.stepsdefinitions.AddBankScript")
public class RunnerTest extends AbstractTestNGCucumberTests {

}

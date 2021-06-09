package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags="@test1,@test2,@test3,@test4, @login",format = {"pretty","html:target/Destination"})

public class RunTest {

}

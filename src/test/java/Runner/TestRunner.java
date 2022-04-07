package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//from here i want to excute the cucumber file
//i want to run the login
//Runwith is used to run the particular file//run a class
@RunWith(Cucumber.class)
//even if we dont give { it will work but good to give so it make sure that it go and look into inside that bracket
//we have to give the path were cucumber file is there
//glue tell us where the implementation are under which package
//dryrun will not execute the code/definition/ I want to check all the methods are implemented
//if the methods are not created dryrun will give the methods that need to put in Step definition
@CucumberOptions (features = {"src\\test\\resources\\Login\\Login.feature"},glue= {"Definition"},
dryRun = false,
plugin = {"html:testoutput/balisha.html","json:testoutput/balisha.json","junit:testoutput/balisha.xml"})
public class TestRunner {

}

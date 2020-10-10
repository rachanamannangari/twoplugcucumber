package testRunner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions (
	features= "C:\\Users\\BIJOY\\Desktop\\busyqa course work\\eclipse\\twoplugcucumber\\Feature\\Addservicepage.feature",
	glue="stepdefinitions",
	//dryRun=true,
	monochrome=true,
	plugin= {"pretty","html:test-output"},
	tags= {"@sanity,@regression"}
			)

public class Testrun {

}

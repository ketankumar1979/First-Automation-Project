package BDDProjectBright;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resource/Homepage.feature", tags = {"@smoke"},
plugin = {"html:target/cucumber-html-report",
              "json:target/cucumber-json-report.json",
              "junit:target/cucumber-xml-report.xml",
              "pretty:target/cucumber-pretty-report.txt"

}//plugin culrly bracket end

)//feature bracket end


public class RunCukeTest {

}

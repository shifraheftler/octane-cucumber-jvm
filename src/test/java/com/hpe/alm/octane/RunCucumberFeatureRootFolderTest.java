package com.hpe.alm.octane;

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin = {"junit:cuc_report.xml"}, features = "src\\test\\resources")
public class RunCucumberFeatureRootFolderTest {

}
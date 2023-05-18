package cv.library;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cv.library.propertyreader.PropertyReader;
import cv.library.utility.Utility;

import java.io.IOException;

public class Hooks extends Utility {
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            String screeShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screeShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }



}

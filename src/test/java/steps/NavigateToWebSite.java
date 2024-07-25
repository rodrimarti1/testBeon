package steps;

import com.thoughtworks.gauge.Step;
import driver.Driver;

public class NavigateToWebSite {


    @Step("When I navigate to <inputWebSiteValue>")
    public void implementation1(String inputWebSite) {
        Driver.webDriver.get(inputWebSite);
    }
}

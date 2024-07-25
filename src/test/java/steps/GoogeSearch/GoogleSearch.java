package steps.GoogeSearch;

import com.thoughtworks.gauge.Step;
import objects.GoogleObjectPage;


public class GoogleSearch {

    GoogleObjectPage googleObject = new GoogleObjectPage();


    @Step("When I input <inputSearchValue> in the Search text box")
    public void implementation1(String inputValue) {
        googleObject.googleTextBox().sendKeys(inputValue);

        googleObject.googleTextBox().pressEscape();
    }
}

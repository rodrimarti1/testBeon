package objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleObjectPage {

    public static SelenideElement googleTextBox(){
        Condition visible = Condition.and("There was a problem trying to find google search text box", Condition.visible);
        return $(By.cssSelector("textarea#APjFqb")).waitUntil(visible, 25000);
    }
}

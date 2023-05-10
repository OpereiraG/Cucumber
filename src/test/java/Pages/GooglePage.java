package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
    @FindBy(xpath="//textarea[@class='gLFyf']")

    public WebElement sendTextGoogle;
}

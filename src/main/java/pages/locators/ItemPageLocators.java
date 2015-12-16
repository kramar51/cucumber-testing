package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ItemPageLocators {

    @FindBy(how = How.NAME, using = "itemType")
    public WebElement itemTypeInput;

    @FindBy(how =How.NAME, using = "amount")
    public WebElement amountInput;

    @FindBy(how = How.XPATH, using = "html/body/form/table/tbody/tr[3]/td/button']")
    public WebElement add;



}

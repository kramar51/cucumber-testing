package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ItemPageLocators;
import utils.SeleniumDriver;

public class ItemPageActions {

    private ItemPageLocators locators;

    public ItemPageActions() {
        locators = new ItemPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), locators);
    }


    public void add(){
        locators.itemTypeInput.sendKeys("asd");
        locators.amountInput.sendKeys("2");
        locators.add.click();
    }
}

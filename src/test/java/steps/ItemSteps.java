package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.HomePageActions;
import pages.actions.ItemPageActions;
import pages.actions.LoginPageActions;

/**
 * Created by student10 on 16.12.15.
 */
public class ItemSteps {

    private HomePageActions homePageActions;
    private LoginPageActions loginPageActions;
    private ItemPageActions itemPageActions;

    public ItemSteps() {
        this.homePageActions = new HomePageActions();
        this.loginPageActions = new LoginPageActions();
        this.itemPageActions = new ItemPageActions();
    }

    @When("^I go to add item page$")
    public void iGoToAddItemPage()  throws Throwable{
        homePageActions.additem();

    }

    @And("^I add any item$")
    public void iAddAnyItem()throws Throwable{
        itemPageActions.add();


    }

    @Then("^Item should be added$")
    public void itemShouldBeAdded()  {
        homePageActions.openItemsPage();

    }



}

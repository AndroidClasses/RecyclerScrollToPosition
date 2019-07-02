package com.jennifer.andy.recyclerscrolltoposition.steps;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.RecyclerViewActions;

import com.jennifer.andy.recyclerscrolltoposition.verifications.ItemCountAssertion;
import com.jennifer.andy.recyclerscrolltoposition.verifications.MinItemCountAssertion;
import com.jennifer.andy.recyclerscrolltoposition.verifications.TopItemAssertion;
import com.jennifer.andy.simple.R;
import com.mauriciotogneri.greencoffee.GreenCoffeeSteps;
import com.mauriciotogneri.greencoffee.annotations.Given;
import com.mauriciotogneri.greencoffee.annotations.Then;
import com.mauriciotogneri.greencoffee.annotations.When;

import static android.support.test.espresso.action.ViewActions.click;

public class ContentListSteps extends GreenCoffeeSteps
{
    @Given("^I see the content list$")
    public void iSeeAContentList()
    {
        onViewWithId(R.id.recycler).isDisplayed();
        onViewWithId(R.id.et_number).isDisplayed();
        onViewWithId(R.id.btn_start).isDisplayed();
    }

    @Then("^I see more than '([\\w| ]+)' items$")
    public void iSeeContentsInTheList$(int expectedCount)
    {
        onViewWithId(R.id.recycler).check(new MinItemCountAssertion(expectedCount));
    }

    @When("^I introduce as position '([\\w| ]+)'$")
    public void iSelectTheContentCalled$(String position)
    {
        onViewWithId(R.id.et_number).type(String.valueOf(position));
        //onViewWithId(R.id.recycler).perform(RecyclerViewActions.actionOnItemAtPosition(position, click()));
        //InstrumentationRegistry.getInstrumentation().waitForIdleSync();
    }

    @Then("^I press the go button$")
    public void iSeeTheContactsScreen()
    {
        onViewWithId(R.id.btn_start).click();
    }

    @Then("^I see the item '([\\w| ]+)' is in the top$")
    public void iSeeTheContactsScreen(int result)
    {
        onViewWithId(R.id.recycler).check(new TopItemAssertion(result));
    }
}
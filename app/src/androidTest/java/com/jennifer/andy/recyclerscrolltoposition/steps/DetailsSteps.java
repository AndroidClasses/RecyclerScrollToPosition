package com.jennifer.andy.recyclerscrolltoposition.steps;

import com.jennifer.andy.recyclerscrolltoposition.verifications.CollapsingToolbarLayoutAssertion;
import com.jennifer.andy.simple.R;
import com.mauriciotogneri.greencoffee.GreenCoffeeSteps;
import com.mauriciotogneri.greencoffee.annotations.Then;

public class DetailsSteps extends GreenCoffeeSteps
{
    @Then("^I see the detail screen for '([\\w| ]+)'$")
    public void iSeeTheDetailScreenFor$(String content)
    {
//        onViewWithId(R.id.toolbar_layout).check(new CollapsingToolbarLayoutAssertion(content));
        //onViewWithId(R.id.toolbar_layout).contains(content);
//        onViewWithText(content).isDisplayed();
    }

    @Then("^I see its content begins with '([\\w| ]+)'$")
    public void iSeeItsContentBeginsWithIs(String detail)
    {
//        onViewWithId(R.id.item_detail).contains(detail);
    }

//    @Then("^I see his age is (\\d+)$")
//    public void iSeeHisHerAgeIs(int age)
//    {
//        onViewWithId(R.id.contact_detail_age).contains(age);
//    }
//
//    @Then("^I see his weight is (\\d+\\.?\\d+ kg.)$")
//    public void iSeeHisHerWeightIs(String weight)
//    {
//        onViewWithId(R.id.contact_detail_weight).contains(weight);
//    }
//
//    @Then("^I see he is (single|married)$")
//    public void iSeeHeIsSingleMarried(String status)
//    {
//        switch (status)
//        {
//            case "single":
//                onViewWithId(R.id.contact_detail_married).contains(string(R.string.contacts_married_no));
//                break;
//
//            case "married":
//                onViewWithId(R.id.contact_detail_married).contains(string(R.string.contacts_married_yes));
//                break;
//
//            default:
//                throw new RuntimeException();
//        }
//    }
}
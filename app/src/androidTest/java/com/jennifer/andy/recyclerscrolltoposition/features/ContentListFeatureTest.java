package com.jennifer.andy.recyclerscrolltoposition.features;

import android.support.test.rule.ActivityTestRule;

import com.jennifer.andy.recyclerscrolltoposition.steps.ContentListSteps;
import com.jennifer.andy.recyclerscrolltoposition.steps.DetailsSteps;
import com.jennifer.andy.recyclerscrolltoposition.steps.ScreenshotSteps;
import com.jennifer.andy.simple.MainActivity;
import com.mauriciotogneri.greencoffee.GreenCoffeeConfig;
import com.mauriciotogneri.greencoffee.GreenCoffeeTest;
import com.mauriciotogneri.greencoffee.ScenarioConfig;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.IOException;

import static com.jennifer.andy.recyclerscrolltoposition.TestSuite.ENGLISH;
import static com.jennifer.andy.recyclerscrolltoposition.TestSuite.SPANISH;


@RunWith(Parameterized.class)
public class ContentListFeatureTest extends GreenCoffeeTest
{
    @Rule
    public ActivityTestRule<MainActivity> activity = new ActivityTestRule<>(MainActivity.class);

    public ContentListFeatureTest(ScenarioConfig scenarioConfig)
    {
        super(scenarioConfig);
    }

    @Parameters(name = "{0}")
    public static Iterable<ScenarioConfig> scenarios() throws IOException
    {
        return new GreenCoffeeConfig()
                .withFeatureFromAssets("assets/features/contents.feature")
                .takeScreenshotOnFail()
                .scenarios(ENGLISH, SPANISH);
    }

    @Test
    public void test()
    {
        start(//new LoginSteps(),
              new ContentListSteps(),
              new DetailsSteps(),
              new ScreenshotSteps());
    }
}
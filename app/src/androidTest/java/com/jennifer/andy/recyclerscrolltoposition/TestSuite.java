package com.jennifer.andy.recyclerscrolltoposition;

import com.jennifer.andy.recyclerscrolltoposition.features.ContentListFeatureTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Locale;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        LoginFeatureTest.class,
        ContentListFeatureTest.class,
//        DetailsFeatureTest.class
})
public class TestSuite
{
    public static final Locale ENGLISH = new Locale("en", "GB");
    public static final Locale SPANISH = new Locale("es", "ES");
}
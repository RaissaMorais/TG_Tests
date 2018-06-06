package com.example.leopoldomt.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by Raissa on 2016-08-23.
 */
@RunWith(AndroidJUnit4.class)
public class BaseTest {

    @Rule
    public ActivityTestRule<MainActivity> myActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void messageDisplayedTest(){

        onView(withText("My Application")).check(matches(isDisplayed()));

        onView(withId(R.id.lado1)).perform(typeText("3"));

        onView(withId(R.id.lado2)).perform(typeText("3"));

        onView(withId(R.id.lado3)).perform(typeText("3"));

        onView(withId(R.id.botao)).perform(click());

        onView(withId(R.id.resultado)).check(matches(withText("Tudo ok!")));


    }

}

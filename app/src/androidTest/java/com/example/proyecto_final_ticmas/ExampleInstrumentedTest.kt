package com.example.proyecto_final_ticmas

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testUIComparison() {
        onView(withId(R.id.editText1)).perform(typeText("10"))
        onView(withId(R.id.editText2)).perform(typeText("5"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("10 es mayor que 5")))
    }
}

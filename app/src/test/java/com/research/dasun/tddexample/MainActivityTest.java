package com.research.dasun.tddexample;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;
import static org.robolectric.Robolectric.setupActivity;

/**
 * Created by dasun on 8/18/16.
 */


@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {

    private MainActivity mainActivity;
    private TextView myTxt;
    private Button myButtonButton;
    private EditText myEditText;

    @Before
    public void setUp() throws Exception {
        mainActivity = setupActivity(MainActivity.class);
        myTxt = (TextView) mainActivity.findViewById(R.id.myText);
        myButtonButton = (Button) mainActivity.findViewById(R.id.myBtn);
        myEditText=(EditText)mainActivity.findViewById(R.id.myEditText);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testShouldHaveALabelWithTddInAction() throws Exception {

        String text = "TDD in Action !!!";
        assertEquals(myTxt.getText().toString(), text);

    }


    @Test
    public void testShouldHaveAButtonWithTextThisIsAButton() throws Exception {

        String text = "ThisIsAButton";
        assertEquals(myButtonButton.getText().toString(), text);

    }




    @Test
    public void shouldChangeValueOfMyTxtToValueInMyTextBox_WhenMyButtonButtonClicked() throws Exception {
     myEditText.setText("hi dasun sam");
     myButtonButton.performClick();
     assertEquals(myEditText.getText().toString(),myTxt.getText().toString());

    }
}
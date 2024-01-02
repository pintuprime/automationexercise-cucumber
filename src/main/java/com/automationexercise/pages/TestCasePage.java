package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TestCasePage extends Utility {

    private static final Logger log = LogManager.getLogger(TestCasePage.class.getName());

public String getTitle(){
    return driver.getTitle();
}
}

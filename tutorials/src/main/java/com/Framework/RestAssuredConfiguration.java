package com.Framework;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class RestAssuredConfiguration {

    @BeforeSuite (alwaysRun = true)
    public void configure(){
            RestAssured.baseURI = "https://httpbin.org";
          //  RestAssured.port = 80;
         //   RestAssured.basePath = "";

    }
}

package com.test;

import com.test.common.EndPoint;
import org.testng.annotations.Test;

import javax.xml.ws.Response;

import static io.restassured.RestAssured.given;

public class Employee {
    @Test
        public void validateEmployee (){
            given().get("https://httpbin.org/get").then().statusCode(200).log().all();
        Response response = given().spec()

    }

    @Test (groups = "demo")
    public void validateEmployee2(){
        given().get(EndPoint.GET_EMPLOYEE).then().statusCode(200).log().all();
    }
}

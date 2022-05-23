package com.example.info;

import com.example.constants.EndPoints;
import com.example.constants.Path;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

/**
 * By Nidhi Patel
 */
public class ParabankSteps {


    @Step("Login with valid credential :{0},name:{1}")
    public ValidatableResponse loginAccount(){
        return SerenityRest.given()
                .when()
                .basePath(Path.LOGIN)
                .get(EndPoints.LOGIN)
                .then();
    }

    @Step("Get accounts details :{0},name:{1}")
    public ValidatableResponse getAccounts(){
        return SerenityRest.given()
                .when()
                .basePath(Path.ACCOUNTS)
                .get(EndPoints.ACCOUNTS)
                .then();
    }
}

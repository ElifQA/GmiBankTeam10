package gmibank.stepdefinitions;

import gmibank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CustomersApiSteps {

    Response response;

    @Given("user provides the api end point to set the response using {string}")
    public void user_provides_the_api_end_point_to_set_the_response_using(String api_url) {
        Response response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_url"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        //System.out.println(response.prettyPrint());
        response.prettyPrint();
    }

    @Given("manuplate all customer`s data")
    public void manuplate_all_customer_s_data() {

    }

    @Given("user sets the data in correspondent files")
    public void user_sets_the_data_in_correspondent_files() {

    }

    @Then("user validate all data")
    public void user_validate_all_data() {

    }

}

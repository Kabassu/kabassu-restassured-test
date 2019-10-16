package io.kabassu.restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.jupiter.api.Test;

public class RestAssuredAnotherTest {

  @Test
  void testService() {
    String key = "kabassu";
    String value = "kabassu";
    given().
      when().get("http://echo.jsontest.com/" + key + "/" + value)
      .then().assertThat().statusCode(200).body(key, equalTo(value));
  }


}

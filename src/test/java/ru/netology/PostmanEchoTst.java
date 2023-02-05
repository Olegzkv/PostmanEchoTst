package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTst {
    @Test
    void shouldSentRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("тестовый текст")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("тестовый текст"))
        ;
    }
}
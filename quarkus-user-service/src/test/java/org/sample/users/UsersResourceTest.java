package org.sample.users;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class UsersResourceTest {

    @Test
    public void testGetAllEndpoint() {
        given()
            .when().get("/users")
            .then()
            .statusCode(200)
            .body("$.size()", not(0), 
            "[0].id", is(1)); 
    }

    @Test
    public void testGetByIdEndpoint(){
        given()
            .when().get("/users/1")
            .then()
            .statusCode(200)
            .body("id", is(1));

        // Response response = given()
        //      .when().get("/users/1");     
        // System.out.println(response.asString());
    }

}
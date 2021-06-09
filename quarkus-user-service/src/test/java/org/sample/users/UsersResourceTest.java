package org.sample.users;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

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

}
package br.gov.caixa.sigsj;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;


@QuarkusTest
public class ProductResourceTest {

    @Test
    public void testGetAll() {
        given()
          .when().get("/products")
          .then()
             .statusCode(200)
             .body("$.size()", not(0));
    }

    @Test
    public void testFindById() {
        given()
          .when().get("/products/1")
          .then()
          .statusCode(200)
          .body("id", is(1));
        // Response response = given()
        //   .when().get("/products/1");

        // System.out.println(response.asString());
    }

}
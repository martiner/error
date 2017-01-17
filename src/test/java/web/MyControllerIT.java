package web;

import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.when;

public class MyControllerIT {

    private static final String JETTY_PORT_PROPERTY = "jettyPort";

    @BeforeClass
    public static void setUp() throws Exception {
        RestAssured.port = Integer.getInteger(JETTY_PORT_PROPERTY, 8080);
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void shouldReturn404() throws Exception {
        when()
                .get("/my")
            .then()
                .statusCode(HttpStatus.SC_NOT_FOUND)
        ;
    }

}

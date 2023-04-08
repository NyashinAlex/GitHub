package specs;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.http.ContentType.JSON;

public class Spec {

    public static RequestSpecification requestGetSpec = with()
            .filter(new AllureRestAssured())
            .header("Authorization", "Bearer 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")
            .baseUri("https://api.github.com")
            .log().all();

    public static ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .log(BODY)
            .expectStatusCode(200)
            .expectContentType(JSON)
            .build();
}

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

package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static specs.Spec.requestGetSpec;
import static specs.Spec.responseSpec;

public class EmojisTests {

    @Test
    @DisplayName("Get emojis")
    void getEmojis() {
        step("Get emojis", () -> {
            given()
                    .spec(requestGetSpec)
                    .get("/emojis")
                    .then()
                    .spec(responseSpec)
                    .body("-1", equalTo("https://github.githubassets.com/images/icons/emoji/unicode/1f44e.png?v8"))
                    .and()
                    .body("100", equalTo("https://github.githubassets.com/images/icons/emoji/unicode/1f4af.png?v8"));
        });
    }
}

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Api_Day1 {



    @Before
    public void setUp(){

    }


    @Test
    public void getRandomActivityAndPrint(){
        Response response = RestAssured.given().contentType(ContentType.ANY).get("https://www.boredapi.com/api/activity");
        response.prettyPrint();
    }

    @Test
    public void number9008639BringsMemorizeActivity(){
        Response response = RestAssured.given().contentType(ContentType.ANY).get("https://www.boredapi.com/api/activity?key=9008639");

        String expectedResponse = "{\"activity\":\"Memorize a favorite quote or poem\",\"type\":\"education\",\"participants\":1,\"price\":0,\"link\":\"\",\"key\":\"9008639\",\"accessibility\":0.8}";
        Assert.assertEquals(expectedResponse, response.body().print());
    }

    @Test
    public void number9008639BringsMemorizeActivity1(){
        Response response = RestAssured.given().contentType(ContentType.ANY).queryParam("key", 9008639).get("https://www.boredapi.com/api/activity");

        String expectedResponse = "{\"activity\":\"Memorize a favorite quote or poem\",\"type\":\"education\",\"participants\":1,\"price\":0,\"link\":\"\",\"key\":\"9008639\",\"accessibility\":0.8}";
        Assert.assertEquals(expectedResponse, response.body().print());
    }

    @Test
    public void number3BringsAstonCox(){
        Response response = RestAssured.given().contentType(ContentType.ANY).pathParam("my_id", 3).get("https://dummy.restapiexample.com/api/v1/employe/{my_id}");
        String expected = "{\"status\":\"success\",\"data\":{\"id\":3,\"employee_name\":\"Ashton Cox\",\"employee_salary\":86000,\"employee_age\":66,\"profile_image\":\"\"},\"message\":\"Successfully! Record has been fetched.\"}";

        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(expected, response.body().print());
    }

}

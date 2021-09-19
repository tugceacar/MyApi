package get_http_request_method;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get01 {

        /*
            We will use Gherkin Language.
            In Gherkin Language we use some keywords: Given, When, Then, And
            Given : It declares pre-requisites - begin statement
            When : It is used to declare actions- action
            Then : It is for outputs - validation
            And : It is used for multiple Given, When, Then - more action
        */

    /*  ---> Test case:

        Given
            https://restful-booker.herokuapp.com/booking/3
        When
            User send a GET Request to the url
        Then
            HTTP Status Code should be 200
        And
            Content Type should be JSON
        And
            Status Line should be HTTP/1.1 200 OK
     */

    //Note: You have to import @test in Junit. Junit is a framework

   @Test
    public void get01(){

        //1)Set the url
        String url = "https://restful-booker.herokuapp.com/booking/3";

        //2)Set the expected data

        //3)Type automation script to send "GET Request" and to get response
        Response response =  given().when().get(url); //"given().when().get(url)" that code send to request.
        response.prettyPrint();//print response body. see response on the console

        /*
        Note: "Given -> * " The mouse cursor put on the Given() and wait than pop up screen you can see "More Action" and click it.
        then choose "import static method" , then imported this "import static io.restassured.RestAssured.given;"
        but should change given to * "import static io.restassured.RestAssured.*;"
        */

       //Note:  to API and get response

       //4)Do assertion . (Assert is confirm,verify,check "ispat,teyit". It means you got response and, you need to check all. like status code, type of context etc.)

         /*
         If you have multiple errors on Assertion, execution will be stopped in the first error.
         Next codes will not be executed.
         You will not get any error messages about the second, third, etc. errors.
         That kind of assertions are called "HARD ASSERTION"
         Do we have Soft Assertion? Yes.
         In SOFT ASSERTION(Verification), all codes will be executed and, you will get report for all assertions
         */

       response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");

       //How to print status code, status line, content type, etc. on the console

       System.out.println("Status Code is " + response.getStatusCode());
       System.out.println("Status Line is " + response.getStatusLine());
       System.out.println("Content Type is " + response.getContentType());
       System.out.println("Time is " + response.getTime());
       System.out.println("Headers are \n" + response.getHeaders());
       System.out.println("Via is " + response.getHeader("Via"));

    }
}
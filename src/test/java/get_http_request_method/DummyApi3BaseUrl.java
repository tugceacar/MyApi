package get_http_request_method;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class DummyApi3BaseUrl  {



     protected RequestSpecification spec;

     @Before
    public void setup(){

         spec =  new RequestSpecBuilder().setBaseUri("http://dummy.restapiexample.com").build();
     }














    }


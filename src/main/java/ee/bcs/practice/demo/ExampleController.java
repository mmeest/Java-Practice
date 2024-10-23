package ee.bcs.practice.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class ExampleController {

    @GetMapping("/greet")
    public String getGreeting() {
        return "Hello, this is the server's response!";
    }


    @GetMapping("/some-url")
    public String someMethodName() {
        return "some response content";
    }

}


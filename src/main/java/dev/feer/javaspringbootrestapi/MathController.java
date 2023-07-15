package dev.feer.javaspringbootrestapi;

import dev.feer.javaspringbootrestapi.validators.NumberValidator;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @GetMapping("/sum/{a}/{b}")
    public Double sum(@PathVariable("a") String a, @PathVariable("b") String b) {
        NumberValidator.validate(a, b);

        return Double.parseDouble(a) + Double.parseDouble(b);
    }

    @GetMapping( "/sub/{a}/{b}")
    public Double sub(@PathVariable("a") String a, @PathVariable("b") String b) {
        NumberValidator.validate(a, b);

        return Double.parseDouble(a) - Double.parseDouble(b);
    }

    @GetMapping( "/mul/{a}/{b}")
    public Double mul(@PathVariable("a") String a, @PathVariable("b") String b) {
        NumberValidator.validate(a, b);

        return Double.parseDouble(a) * Double.parseDouble(b);
    }

    @GetMapping( "/div/{a}/{b}")
    public Double div(@PathVariable("a") String a, @PathVariable("b") String b) {
        NumberValidator.validate(a, b);

        return Double.parseDouble(a) / Double.parseDouble(b);
    }

    @GetMapping( "/avg/{a}/{b}")
    public Double avg(@PathVariable("a") String a, @PathVariable("b") String b) {
        NumberValidator.validate(a, b);

        return (Double.parseDouble(a) + Double.parseDouble(b)) / 2;
    }

    @GetMapping( "/sqrt/{a}")
    public Double sqrt(@PathVariable("a") String a) {
        NumberValidator.validate(a);

        return Math.sqrt(Double.parseDouble(a));
    }
}

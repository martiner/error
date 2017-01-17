package web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MyController {

    @RequestMapping("/my")
    public String handle() {
        throw new MyException();
    }

    @ExceptionHandler(MyException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND/*, reason = "Simply Not Found"*/)
    public String exception() {
        return "404";
    }
}

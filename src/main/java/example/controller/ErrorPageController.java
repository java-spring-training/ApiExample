package example.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPageController implements ErrorController {

    private Logger log = Logger.getLogger(ErrorPageController.class);

    @RequestMapping("/error")
    public Error HandlerErrorNotFoundUrl() {

        log.error("Invalid Url");

        return new Error(HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                "Entry Api with wrong Url");
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}

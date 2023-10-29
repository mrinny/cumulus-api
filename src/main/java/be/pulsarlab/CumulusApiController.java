package be.pulsarlab;

import io.micronaut.http.annotation.*;

@Controller("/cumulus-api")
public class CumulusApiController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}
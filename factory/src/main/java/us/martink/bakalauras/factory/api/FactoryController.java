package us.martink.bakalauras.factory.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.martink.bakalauras.factory.api.dto.OrderDetails;

/**
 * Created by tadas.
 */
@RestController
@RequestMapping(value = "/v1")
@Log4j2
public class FactoryController {

    @PostMapping("/internal")
    public void internal(@RequestBody OrderDetails payload) {
       log.info("Starting production of {}", payload.getItem().toString());
    }
}

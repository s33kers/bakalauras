package us.martink.bakalauras.inform.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.martink.bakalauras.inform.api.dto.OrderDetails;

/**
 * Created by tadas.
 */
@RestController
@RequestMapping(value = "/v1")
@Log4j2
public class InformController {

    @PostMapping("/sms")
    public void sms(@RequestBody OrderDetails payload) {
        log.info("Sending SMS to {}", payload.getCustomer().getPhone());
    }

    @PostMapping("/email")
    public void email(@RequestBody OrderDetails payload) {
        log.info("Sending email to {}", payload.getCustomer().getEmail());
    }
}

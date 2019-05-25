package us.martink.bakalauras.delivery.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.martink.bakalauras.delivery.api.dto.OrderDetails;

/**
 * Created by tadas.
 */
@RestController
@RequestMapping(value = "/v1")
@Log4j2
public class DeliveryController {

    @PostMapping("/abroad")
    public void internal(@RequestBody OrderDetails payload) {
       log.info("Sending request to delivery company {}", payload.getDelivery().toString());
    }
}

package us.martink.bakalauras.order.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.martink.bakalauras.order.api.dto.OrderDetails;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

/**
 * Created by tadas.
 */
@RestController
@RequestMapping(value = "/v1")
@Log4j2
public class OrderController {

    @PostMapping()
    public Map<String, String> internal(@RequestBody OrderDetails payload) {
        log.info("Order accepted. Storing data locally {}", payload);
        return Collections.singletonMap("orderId", UUID.randomUUID().toString());
    }
}

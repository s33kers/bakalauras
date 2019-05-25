package us.martink.bakalauras.payment.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import us.martink.bakalauras.payment.api.dto.OrderDetails;

/**
 * Created by tadas.
 */
@RestController
@RequestMapping(value = "/v1")
@Log4j2
public class PaymentController {

    @PostMapping("/internet")
    public void internet(@RequestBody OrderDetails payload) {
        int price = payload.getItem().getQuantity() * 2;// stub price
        log.info("Calculating price {}, bank info {}", price, "LT-XXXXXXXXXXXXXXXX");
    }
}

package us.martink.bakalauras.payment.api.dto;

import lombok.Data;

@Data
public class Delivery {
    private String address;
    private DeliveryType type;
}

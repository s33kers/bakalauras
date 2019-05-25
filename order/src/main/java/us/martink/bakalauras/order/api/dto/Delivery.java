package us.martink.bakalauras.order.api.dto;

import lombok.Data;

@Data
public class Delivery {
    private String address;
    private DeliveryType type;
}

package us.martink.bakalauras.inform.api.dto;

import lombok.Data;

@Data
public class Delivery {
    private String address;
    private DeliveryType type;
}

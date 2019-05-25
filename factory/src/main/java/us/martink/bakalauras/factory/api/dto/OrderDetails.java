package us.martink.bakalauras.factory.api.dto;

import lombok.Data;

@Data
public class OrderDetails {
    private Customer customer;
    private Item item;
    private Delivery delivery;
}

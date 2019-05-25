package us.martink.bakalauras.invoice.api.dto;

import lombok.Data;

@Data
public class OrderDetails {
    private Customer customer;
    private Item item;
    private Delivery delivery;
}

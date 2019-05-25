package us.martink.bakalauras.factory.api.dto;

import lombok.Data;

@Data
public class Customer {
    private String id;
    private String email;
    private String phone;
    private String pvmNeeded;
}

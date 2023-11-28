package com.digitalhouse.checkoutservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Checkout {

    private String id;
    private String url;
    private String totalAmount;
    private List<String> availableMethods;

}

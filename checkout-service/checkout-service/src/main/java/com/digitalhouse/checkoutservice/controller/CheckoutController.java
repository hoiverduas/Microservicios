package com.digitalhouse.checkoutservice.controller;

import com.digitalhouse.checkoutservice.model.Checkout;
import com.digitalhouse.checkoutservice.service.ICheckoutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/checkout")
public class CheckoutController {

   private final ICheckoutService checkoutService;


    public CheckoutController(ICheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds){
           return checkoutService.buildCheckout(productIds);
    }


}

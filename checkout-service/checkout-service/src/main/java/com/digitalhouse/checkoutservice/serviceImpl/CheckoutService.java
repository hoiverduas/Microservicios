package com.digitalhouse.checkoutservice.serviceImpl;

import com.digitalhouse.checkoutservice.dto.ProductDto;
import com.digitalhouse.checkoutservice.model.Checkout;
import com.digitalhouse.checkoutservice.service.ICheckoutService;
import com.digitalhouse.checkoutservice.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService implements ICheckoutService  {

    private final IProductService productService;

    public CheckoutService(IProductService productService) {
        this.productService = productService;
    }


    @Override
    public Checkout buildCheckout(List<String> productIds) {
        Double total = 0.0;

        for(String id: productIds) {
            ProductDto productDto = productService.getProduct(id);
            System.out.println("productDto.getInstance() = " + productDto.getInstance());
            total += productDto.getPrice();
        }
        Checkout checkout = new Checkout("234","www.digitalhouse.com/checkout?code=234",total.toString(),List.of("credit_card"));

        return checkout;
    }
}

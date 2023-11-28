package com.digitalhouse.checkoutservice.service;

import com.digitalhouse.checkoutservice.dto.ProductDto;

public interface IProductService {

    public ProductDto getProduct(String id);
}

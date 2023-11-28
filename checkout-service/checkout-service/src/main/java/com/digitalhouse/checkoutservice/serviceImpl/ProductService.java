package com.digitalhouse.checkoutservice.serviceImpl;

import com.digitalhouse.checkoutservice.dto.ProductDto;
import com.digitalhouse.checkoutservice.repository.IFeignProductRepository;
import com.digitalhouse.checkoutservice.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private final IFeignProductRepository feignProductRepository;

    public ProductService(IFeignProductRepository feignProductRepository) {
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    public ProductDto getProduct(String id) {
        return feignProductRepository.getProductById(id) ;
    }
}

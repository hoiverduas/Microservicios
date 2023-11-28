package com.digitalhouse.checkoutservice.repository;

import com.digitalhouse.checkoutservice.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="products-service")
public interface IFeignProductRepository {

    @RequestMapping(method = RequestMethod.GET, value = "/products")
    ProductDto getProductById(@RequestParam String id);

}

package com.oasys.ProductService.service;

import com.oasys.ProductService.model.ProductRequest;
import com.oasys.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}

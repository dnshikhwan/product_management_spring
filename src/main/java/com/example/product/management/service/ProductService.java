package com.example.product.management.service;

import com.example.product.management.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

@Service
public class ProductService {

    HashMap<String, Product> products = new HashMap<>();

    public Collection<Product> getAll() {
        return products.values();
    }

    public void create(Product product) {
        product.setId(UUID.randomUUID().toString());
        products.put(product.getId(), product);
    }

    public void delete(String id) {
        Product product = products.get(id);
        if (product == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        products.remove(id, product);
    }

    public Product findById(String id) {
        Product product = products.get(id);
        if (product == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return product;
    }
}

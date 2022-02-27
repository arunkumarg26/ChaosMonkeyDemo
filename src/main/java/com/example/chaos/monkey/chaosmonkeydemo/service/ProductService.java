package com.example.chaos.monkey.chaosmonkeydemo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService
{
    public List<String> getAllProducts() {
        return Arrays.asList("Product A", "Product B", "Product C", "Product D");
    }
}

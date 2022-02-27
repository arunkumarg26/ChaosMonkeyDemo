package com.example.chaos.monkey.chaosmonkeydemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.chaos.monkey.chaosmonkeydemo.service.ProductService;

import lombok.AllArgsConstructor;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/products")
@AllArgsConstructor
public class RestController
{
    ProductService productService;

    @GetMapping
    @SentinelResource(value = "getAllProducts", fallback = "getAllProducts_Fallback")
    public List<String> getAllProducts(){
        return productService.getAllProducts();
    }

    public List<String> getAllProducts_Fallback(){
        String response = "This is response from fallback";
        return List.of(response);
    }

}

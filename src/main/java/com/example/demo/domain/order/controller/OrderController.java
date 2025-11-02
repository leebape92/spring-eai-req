package com.example.demo.domain.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.order.dto.OrderDTO;
import com.example.demo.domain.order.service.OrderService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    
    // 단건 조회
    @GetMapping("/{orderId}")
    public OrderDTO getOrder(@PathVariable String orderId) {
    	System.out.println("@@@@@@@@@@@@@@");
        return orderService.getOrder(orderId);
    }

}

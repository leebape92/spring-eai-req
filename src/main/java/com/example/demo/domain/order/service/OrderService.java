package com.example.demo.domain.order.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.order.dto.OrderDTO;
import com.example.demo.domain.order.mapper.OrderMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderMapper userMapper;
    
    public List<OrderDTO> getAllUsers() {
        return userMapper.getAllUsers();
    }
	
}

package com.example.demo.domain.order.service;
import org.springframework.stereotype.Service;

import com.example.demo.domain.order.dto.OrderDTO;
import com.example.demo.domain.order.mapper.OrderMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderMapper orderMapper;
    
 // 단건 조회
    public OrderDTO getOrder(String orderId) {
        // 1️⃣ Mapper 조회 결과를 변수에 담기
        OrderDTO orderDTO = orderMapper.selectOrderById(orderId);
        System.out.println("orderDTO:::" + orderDTO);
        // 2️⃣ 필요하면 추가 로직 처리 가능
        // 예: null 체크, 데이터 가공 등

        // 3️⃣ 변수 리턴
        return orderDTO;
    }
	
}

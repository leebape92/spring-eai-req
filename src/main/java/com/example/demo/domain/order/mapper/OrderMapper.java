package com.example.demo.domain.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.order.dto.OrderDTO;

@Mapper
public interface OrderMapper {
    // 단건 조회
    OrderDTO selectOrderById(@Param("orderId") String orderId);
}
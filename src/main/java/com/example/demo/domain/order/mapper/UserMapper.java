package com.example.demo.domain.order.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.order.dto.UserDTO;

@Mapper
public interface UserMapper {
    List<UserDTO> getAllUsers();
}
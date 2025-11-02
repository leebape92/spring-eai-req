package com.example.demo.domain.order.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.order.dto.UserDTO;
import com.example.demo.domain.order.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserMapper userMapper;
    
    public List<UserDTO> getAllUsers() {
        return userMapper.getAllUsers();
    }
	
}

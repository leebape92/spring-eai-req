package com.example.demo.eai.dto;

import java.util.List;

import lombok.Data;

@Data
public class Interface0001ReqDTO {
    private Interface0001OrderDTO orderDTO;
    private List<Interface0001ProductDTO> productListDTO;
}

package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.eai.dto.Interface0001OrderDTO;
import com.example.demo.eai.dto.Interface0001ProductDTO;
import com.example.demo.eai.dto.Interface0001ReqDTO;

public class test0001 {
	public static void main(String[] args) {
		
        Interface0001OrderDTO orderDTO = new Interface0001OrderDTO();
        orderDTO.setOrderId("0001");
        orderDTO.setCustomerName("홍길동");
        orderDTO.setOrderDate("2025-11-02");
        System.out.println("orderDTO:::" + orderDTO);
        
        
        // --------------------------
        // 2. 상품 데이터 리스트 (ProductDTO)
        // --------------------------
        List<Interface0001ProductDTO> productList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Interface0001ProductDTO product = new Interface0001ProductDTO();
            product.setProductCode("P00" + i);
            product.setProductName("상품" + i);
            product.setQuantity(i);
            productList.add(product);
        }
        
        System.out.println("productList :::" + productList);
        
        Interface0001ReqDTO reqDTO = new Interface0001ReqDTO();
        reqDTO.setOrderDTO(orderDTO);
        reqDTO.setProductListDTO(productList);
        
		
	}
}

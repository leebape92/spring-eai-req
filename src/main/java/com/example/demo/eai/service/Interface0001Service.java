package com.example.demo.eai.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.eai.dto.Interface0001OrderDTO;
import com.example.demo.eai.dto.Interface0001ProductDTO;
import com.example.demo.eai.dto.Interface0001ReqDTO;

public class Interface0001Service {
	
    public Interface0001ReqDTO interface0001Service(String orderId) {
        // --------------------------
        // 1. 주문 데이터 (OrderDTO)
        // --------------------------
        Interface0001OrderDTO orderDTO = new Interface0001OrderDTO();
        orderDTO.setOrderId(orderId);
        orderDTO.setCustomerName("홍길동");
        
        
        // --------------------------
        // 2. 상품 데이터 리스트 (ProductDTO)
        // --------------------------
        List<Interface0001ProductDTO> productList = new ArrayList<>();

        Interface0001ProductDTO product1 = new Interface0001ProductDTO();
        product1.setProductCode("P001");
        product1.setProductName("노트북");
        product1.setQuantity(1);
        productList.add(product1);

        Interface0001ProductDTO product2 = new Interface0001ProductDTO();
        product2.setProductCode("P002");
        product2.setProductName("무선마우스");
        product2.setQuantity(2);
        productList.add(product2);
        
        System.out.println("productList :::" + productList);
        
        // --------------------------
        // 3. 최종 요청 DTO 조립
        // --------------------------
        Interface0001ReqDTO reqDTO = new Interface0001ReqDTO();
        reqDTO.setOrderDTO(orderDTO);
        reqDTO.setProductListDTO(productList);
        
		return reqDTO;
    }
}

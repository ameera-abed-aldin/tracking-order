package com.Mediator.Mediator.Controller;

import com.Mediator.Mediator.Entity.Orders;
import com.Mediator.Mediator.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class OrderController {
    private OrdersService service;
    @Autowired
    public void  SetOrdersService( OrdersService service){
        this.service = service;
    }


    @GetMapping("/orders")
    public ResponseEntity<List<Orders>> getOrders() {
        List<Orders> orders = service.getOrders();
        return ResponseEntity.ok(orders);
    }
}

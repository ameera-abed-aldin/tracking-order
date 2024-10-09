package com.Mediator.Mediator.Controller;

import com.Mediator.Mediator.Entity.Orders;
import com.Mediator.Mediator.Service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class OrderController {
    public OrdersService service;

    public OrderController(OrdersService service){
        this.service = service;
    }
    @GetMapping("/orders")
    public List<Orders> getOrders() {
        return service.getOrders();
    }
}

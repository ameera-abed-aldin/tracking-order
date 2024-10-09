package com.Mediator.Mediator.Service;

import com.Mediator.Mediator.Entity.Orders;
import com.Mediator.Mediator.Repo.OrdersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {
public OrdersRepository ordersRepository;
public OrdersService(OrdersRepository ordersRepository){
    this.ordersRepository = ordersRepository;
}
    public List<Orders> getOrders() {
    return ordersRepository.findAll();
    }
}

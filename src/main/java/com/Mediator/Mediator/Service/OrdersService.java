package com.Mediator.Mediator.Service;

import com.Mediator.Mediator.Entity.Orders;
import com.Mediator.Mediator.Repo.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

public OrdersRepository ordersRepository;
@Autowired
public void SetOrdersService(OrdersRepository ordersRepository){
    this.ordersRepository = ordersRepository;
}
    public List<Orders> getOrders() {
        List<Orders> orders = ordersRepository.findAll();
        System.out.println("Fetched Orders: " + orders);
        return orders;
    }
}

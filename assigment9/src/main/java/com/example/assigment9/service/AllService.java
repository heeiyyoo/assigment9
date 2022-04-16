package com.example.assigment9.service;

import com.example.assigment9.Repository.CustomerRepository;
import com.example.assigment9.Repository.OrderRepository;
import com.example.assigment9.Repository.PaymentRepository;
import com.example.assigment9.model.PaymentMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    PaymentRepository paymentRepository;
    public String Pay(Integer customerId, Integer orderId, PaymentMethod paymentMethod){
        if (orderRepository.getById(orderId).getPrice() < 1000.0)
            return "Customer: " + customerRepository.getById(customerId).getName() + "payed: " + orderRepository.getById(orderId).getPrice() + "with: " + paymentMethod;
        else if (paymentMethod != PaymentMethod.Card) {
            return "Invalid payment method!";
        }
        return "Customer:  " + customerRepository.getById(customerId).getName() + "payed: " + orderRepository.getById(orderId).getPrice() + "with: " + PaymentMethod.Card;
    }
}

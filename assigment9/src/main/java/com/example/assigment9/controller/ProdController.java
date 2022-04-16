package com.example.assigment9.controller;

import com.example.assigment9.model.PaymentMethod;
import com.example.assigment9.service.AllService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Profile("prod")
@RequiredArgsConstructor
public class ProdController {

    AllService allService;
    @PostMapping("/prod/{customerId}")

    public String pay(@PathVariable("customerId") Integer customerId, @RequestBody Integer orderId,@RequestBody PaymentMethod paymentMethod) {
        return allService.Pay(customerId, orderId, paymentMethod);
    }

}

package com.litvas.shop.delivery.controller;

import com.litvas.shop.delivery.domain.Delivery;
import com.litvas.shop.delivery.services.DeliveryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/deliveries")
@AllArgsConstructor
public class DeliveryController {

    private DeliveryService deliveryService;

    @PutMapping
    public Delivery changeDeliveryStatus(@RequestBody Delivery delivery) {
        return deliveryService.changeStatus(delivery);
    }

}

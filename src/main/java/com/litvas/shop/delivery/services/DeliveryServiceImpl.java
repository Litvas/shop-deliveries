package com.litvas.shop.delivery.services;

import com.litvas.shop.delivery.domain.Delivery;
import com.litvas.shop.delivery.repositories.DeliveryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeliveryServiceImpl implements DeliveryService {

    private DeliveryRepository deliveryRepository;

    @Override
    public Delivery changeStatus(Delivery delivery) {
        Delivery storedDelivery = deliveryRepository.getDeliveryByOrderId(delivery.getOrderId());
        storedDelivery.setDeliveryStatus(delivery.getDeliveryStatus());
        return deliveryRepository.save(storedDelivery);
    }

}

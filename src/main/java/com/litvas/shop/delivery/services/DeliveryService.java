package com.litvas.shop.delivery.services;

import com.litvas.shop.delivery.domain.Delivery;

public interface DeliveryService {

    Delivery changeStatus(Delivery delivery);

}

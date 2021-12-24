package com.litvas.shop.delivery.repositories;

import com.litvas.shop.delivery.domain.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    Delivery getDeliveryByOrderId(String orderId);

}

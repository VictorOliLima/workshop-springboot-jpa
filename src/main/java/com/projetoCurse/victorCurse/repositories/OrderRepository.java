package com.projetoCurse.victorCurse.repositories;

import com.projetoCurse.victorCurse.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

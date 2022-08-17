package com.orderexample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderexample.entity.OrderEntity;

@Repository
public interface EntityRepo extends JpaRepository<OrderEntity, Integer>  {

}

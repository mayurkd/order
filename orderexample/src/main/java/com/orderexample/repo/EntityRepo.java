package com.orderexample.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.orderexample.entity.OrderEntity;


@Repository
public interface EntityRepo extends CrudRepository<OrderEntity, Integer>  {
	List<OrderEntity> findByName(String name);
}

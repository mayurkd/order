package com.orderexample.itemrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderexample.itementity.ItemEntity;

@Repository
public interface Itemrepo extends JpaRepository<ItemEntity,Integer> {

}

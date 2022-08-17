package com.orderexample.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderexample.entity.OrderEntity;
import com.orderexample.repo.EntityRepo;


@RestController
public class OrderController {
	@Autowired
	EntityRepo entityrepo;
	
	@GetMapping(value = "/order")
	public List<OrderEntity> getorder(){
		return entityrepo.findAll();
	}
	@GetMapping(value = "/order/{id}")
	public Optional<OrderEntity> getorderid(@PathVariable("id")int id){
			 return entityrepo.findById(id);
		//return entityrepo.findAll().get(id);
	}
	
	@PostMapping(value = "/neworder")
	public String createnew(@RequestBody OrderEntity orderentity)
	{
		entityrepo.save(orderentity);
		return "New item Created Successfully";
	}
	@PutMapping(value = "/updateorder")
	public String updateorder(@RequestBody OrderEntity orderentity)
	{
		entityrepo.save(orderentity);
		return "Order Updated Successfully";
	}
	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id")int id)
	{
		entityrepo.deleteById(id);
		
	}
	
	@GetMapping(value = "/check")
	public String check()
	{
		return "System is running";
	}
	
}

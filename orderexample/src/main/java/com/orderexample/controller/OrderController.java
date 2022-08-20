package com.orderexample.controller;


import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orderexample.entity.OrderEntity;
import com.orderexample.itementity.ItemEntity;
import com.orderexample.itemrepo.Itemrepo;
import com.orderexample.repo.EntityRepo;


@RestController
public class OrderController {
	
	@Autowired
	EntityRepo entityrepo;
	@Autowired
	Itemrepo itemrepo;
	@GetMapping(value = "/item")
	public List<ItemEntity> getitemdetails()
	{
		return itemrepo.findAll();
	}
	@GetMapping(value = "/order")
	public List<OrderEntity> getorder(){
		return (List<OrderEntity>) entityrepo.findAll();
	}
	@GetMapping(value = "/order/{id}")
	public Optional<OrderEntity> getorderid(@PathVariable("id")int id){
			 return entityrepo.findById(id);
		//return entityrepo.findAll().get(id);
	}
	@GetMapping(value ="/item/{id}")
	public Optional<ItemEntity> getitemid(@PathVariable("id")int id){
		return itemrepo.findById(id);
	}
	
	@PostMapping(value = "/neworder")
	public String createnew(@RequestBody OrderEntity orderentity)
	{
		entityrepo.save(orderentity);
		return "New order Created Successfully";
	}
	@PostMapping(value="/newitem")
	public String createitem(@RequestBody ItemEntity item)
	{
		itemrepo.save(item);
		return "new item create";
	}
	@PutMapping(value = "/updateorder")
	public String updateorder(@RequestBody OrderEntity orderentity)
	{
		entityrepo.save(orderentity);
		return "Order Updated Successfully";
	}
	@PutMapping(value = "/updateitem")
	public String updateorder(@RequestBody ItemEntity item)
	{
		itemrepo.save(item);
		return "item Updated Successfully";
	}
	@DeleteMapping(value = "/deleteorder/{id}")
	public void deleteOrder(@PathVariable("id")int id)
	{
		entityrepo.deleteById(id);
		
	}
	@DeleteMapping(value = "/deleteitem/{id}")
	public void deleteItem(@PathVariable("id")int id)
	{
		itemrepo.deleteById(id);
		
	}
	@GetMapping("/getByName/{name}")
	public List<OrderEntity> getbyname(@PathVariable ("name") String name)
	{
		return entityrepo.findByName(name);
	}
	
	@GetMapping(value = "/check")
	public String check()
	{
		return "System is running";
	}
	
	
}

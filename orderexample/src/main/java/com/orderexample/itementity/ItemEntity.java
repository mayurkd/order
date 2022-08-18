package com.orderexample.itementity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ItemDetails")
public class ItemEntity {
@Id
@GeneratedValue
@Column(name = "Itemid")
private int Itemid;
@Column(name ="itemname")
private String itemname;
public int getItemid() {
	return Itemid;
}
public void setItemid(int itemid) {
	Itemid = itemid;
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
}

package com.HmWrk;

public class StoreProduct {

	  
	String label;
	int price;
	String category;
	boolean hasExpiration;
	int stock;

	StoreProduct(){}

	StoreProduct(String labell,
	int pricee,
	String categoryy,
	boolean hasExpirationn,
	int stockk){
	label = labell;
	price = pricee;
	category = categoryy;
	hasExpiration = hasExpirationn;
	stock = stockk;
	}

	StoreProduct(String labell,
	int pricee,
	int stockk){
	label = labell;
	price = pricee;
	category = "misc";
	hasExpiration = false;
	stock = stockk;
	}

	StoreProduct(String labell,
	int pricee
	){
	label = labell;
	price = pricee;
	stock = 0;
	}
}


package com.siiet.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Javastreamdemo3 {
	public static void main(String[] args) {
		
	
	List<Product>pl=new ArrayList<Product>();
	pl.add(new Product(1,"HONOR",500000));
	pl.add(new Product(2,"HP",300000));

	pl.add(new Product(3,"DELL",900000));
	Product p=pl.stream().max((Product1,Product2)->Product1.price>Product2.price?1:-1).get();
	System.out.println(p.price);
}
}

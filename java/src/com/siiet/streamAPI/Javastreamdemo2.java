package com.siiet.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo2 {
	public static void main(String[] args) {
		List<Product>pl=new ArrayList<Product>();
		pl.add(new Product(1,"HONOR",500000));
		pl.add(new Product(2,"HP",300000));

		pl.add(new Product(3,"DELL",900000));
double totalprice=pl.stream().collect(Collectors.summingDouble(Product->Product.price));
System.out.println(totalprice);
	}

}

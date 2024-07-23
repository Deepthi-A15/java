package com.siiet.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo {
	public static void main(String[] args) {
		List<Product>pl=new ArrayList<Product>();
		pl.add(new Product(1,"HONOR",500000));
		pl.add(new Product(2,"HP",300000));

		pl.add(new Product(3,"DELL",900000));
		List<Float>pl2=pl.stream().filter(p->p.price>30000)	
		               .map(p->p.price)
                    	.collect(Collectors.toList());
		System.out.println(pl2);
		

	}

}

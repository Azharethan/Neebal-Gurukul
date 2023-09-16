package com.service;

import com.model.Product;

public class ProductService {
	public double increasePriceByCategory(Product p) {
		if(p.getCatagory().equals("laptop")) {
			p.setPrice(p.getPrice()*1.01);
		return p.getPrice();
	}
		
		if(p.getCatagory().equalsIgnoreCase("Mobile")) {
			p.setPrice(p.getPrice()*1.02);
			return p.getPrice();
		}
		return 0;
	}
		
		public double computeTotalPrice(Product[] parry) {
			double totalPrice=0;
			for(Product p:parry) {
				totalPrice+=p.getPrice();
			}
			return totalPrice;
		}
		
		public String computeGreaterPrice(Product p1,Product p2) {
			if(p1.getPrice()>p2.getPrice()) {
				return p1.getTitle();
			}
			return p2.getTitle();
		}
	}


package com.Test;
import org.junit.Assert;
import org.junit.Test;

import com.model.Employee;
import com.model.Product;
import com.service.ProductService;


@SuppressWarnings("deprecation")
public class ProductServiceTest {
	ProductService p=new ProductService();
	Product p1=new Product(1,"vivo z1 pro",14000,"mobile");
	Product p2=new Product(2,"acer aspire",55000,"laptop");
	
	Product[] parry= {p1,p2};
	
	@Test
	public void increasePriceByCategory() {
		Assert.assertEquals(14280,Math.round(p.increasePriceByCategory(p1)));
	}
	
	@Test
	public void increasePriceByCategory1() {
		Assert.assertEquals(55550,Math.round(p.increasePriceByCategory(p2)));
	}
	
	@Test
	public void computeTotalPrice() {
		Assert.assertEquals(69000,Math.round(p.computeTotalPrice(parry)));
	}
	
	@Test
	public void computeGreaterPrice() {
		Assert.assertEquals("acer aspire", p.computeGreaterPrice(p1, p2));
	}

}

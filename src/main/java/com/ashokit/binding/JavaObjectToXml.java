package com.ashokit.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaObjectToXml {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Address addr=new Address();
		addr.setCity("HYD");
		addr.setCountry("INDIA");
		addr.setState("TG");
		
		Customer c=new Customer();
		
		c.setId(1);
		c.setEmail("venkatkilari5@gmail.com");
		c.setName("venkat");
		c.setPhno(789890678740l);
		c.setAddr(addr);
		
		
//		convertion of java object to xml format
		
//		marshalling process(java object to xml convertion)
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		
		Marshaller marshaller = context.createMarshaller();
		
		marshaller.marshal(c, new File("customer.xml"));

		
		System.out.println("xml created....");
	}

}

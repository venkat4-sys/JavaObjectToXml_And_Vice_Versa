package com.ashokit.binding;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlToJavaObject {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       File f=new File("customer.xml");
       
       
       //unmarshalling process(xml to java object)
       JAXBContext context = JAXBContext.newInstance(Customer.class);
       
       Unmarshaller unmarshaller = context.createUnmarshaller();
       
       Object object = unmarshaller.unmarshal(f);
       
       Customer c=(Customer) object;
       
       System.out.println(c);
	}

}

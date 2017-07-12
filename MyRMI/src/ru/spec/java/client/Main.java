package ru.spec.java.client;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import ru.spec.java.ee.DateService;

public class Main {
 public static void main(String[] args) throws NamingException {
	Context ctx = new InitialContext();
	//TestBean bean = (TestBean)ctx.lookup("text");
	
	//String result = bean.echo("hello from cl");
	//System.out.println(result);
	DateService datebean = (DateService)ctx.lookup("date service");
	for(int i=0;i<10;i++)
	System.out.println(datebean.getDate());
}
}

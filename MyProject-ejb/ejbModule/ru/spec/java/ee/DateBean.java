package ru.spec.java.ee;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless(mappedName="date service")
public class DateBean implements DateService {
	
	
	@Override
	public Date getDate(){
		System.out.println("I am date");
		return new Date();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("--new datebean"+Thread.currentThread());
	}
}
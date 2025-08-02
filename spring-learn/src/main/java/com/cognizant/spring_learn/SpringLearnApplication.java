package com.cognizant.spring_learn;

import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) throws ParseException {
	    System.out.println("SpringLearnApplication started...");
	    SpringApplication.run(SpringLearnApplication.class, args);
	    
	    displayDate(); // Call the new method
	}

	public static void displayDate() throws ParseException {
	    ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
	    SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
	    Date date = format.parse("31/12/2018");
	    System.out.println(date);
	}


}

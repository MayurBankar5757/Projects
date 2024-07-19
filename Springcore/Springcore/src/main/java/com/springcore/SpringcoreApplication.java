package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mypack.Person;
import com.springcore.component.Student;

@SpringBootApplication
public class SpringcoreApplication implements CommandLineRunner {
	@Autowired
	@Qualifier("Student2")
	Student st;
	@Autowired
	Person p ;
	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
		System.out.println("hello");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		st.stno =23;
//		System.out.println(this.st.stno);
//		
//		System.out.println(this.st.print()); 
		this.p.show();
	}

}

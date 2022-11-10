package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	try(ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("com/spring/config.xml"))
    	{
//    		Getting bean from IOC Container
    		Book b1 = (Book)cpac.getBean("firstBook");
    		Book b2 = (Book)cpac.getBean("secondBook");
    		Book b3 = (Book)cpac.getBean("thirdBook");
    		Book b4 = (Book)cpac.getBean("forthBook");
    		
    		System.out.println(b1);
    		System.out.println(b2);
    		System.out.println(b3);
    		System.out.println(b4);
    		
//    		Getting bean from IOC Container
    		Address first = (Address)cpac.getBean("a1");
    		Address second = (Address)cpac.getBean("a2");
    		
    		System.out.println();
    		System.out.println(first);
    		System.out.println(second);
    		
    		System.out.println();
    		Student st1 = (Student)cpac.getBean("stu1");
    		Student st2 = (Student)cpac.getBean("stu2");
    		System.out.println(st1);
    		System.out.println(st2);
    	}
    }
}

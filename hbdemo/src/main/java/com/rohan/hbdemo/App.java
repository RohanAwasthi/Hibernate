package com.rohan.hbdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	EmployeeName name = new EmployeeName();
    	name.setFname("nkdebug");
    	name.setLname("blr");
    	employee emp = new employee();
    	emp.setId(105);
    	emp.setCountry("IN");
    	emp.setName(name);
    	
    	
    	//emp.setId(104);
    //	emp.setName("rohan");
    //	emp.setCountry("India");
    	
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(employee.class);
    	
    	//ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	
    	 SessionFactory factory = config.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	 session.save(emp);
    	
    //	emp = session.get(Employee.class, 104);
    	
    	tx.commit();
    	System.out.println(emp);
    }

    }


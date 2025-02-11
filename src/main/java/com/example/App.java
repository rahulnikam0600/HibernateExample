package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration()
        		.configure()
        		.buildSessionFactory();
        
        System.out.println(factory);
        System.out.println(factory.isClosed());
    }
}

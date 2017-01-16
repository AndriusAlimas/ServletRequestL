package com.example.listener;
import javax.servlet.*;

public class MyServletRequestListener implements ServletRequestListener {
	// counter variable
	public static int totalRequest = 0;
	@Override
	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("\n*************************");
        System.out.println("********** Request was done  ***************");
        System.out.println("********** requestDestroyed() method run ***************");
        System.out.println("********** End of method  ***************");
        System.out.println("\n*************************");
	}

	@Override
	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("\n*************************");
        System.out.println("********** requestInitialized() method run ***************");
        ServletContext sc = event.getServletContext();
        // You can easly get request object from ServletRequest event:
        ServletRequest request = event.getServletRequest();
        System.out.println("We get ServletContext = " + sc + " object ");
        System.out.println("We get ServletRequest = " + request + " object ");
        System.out.println("Both from ServletRequestEvent!");
        System.out.println("********** We got request ***************");
        // we pre increament and show result:
        System.out.println("********** Total request " + ++totalRequest + " ***************");
        System.out.println("\n*************************");
		
	}

}

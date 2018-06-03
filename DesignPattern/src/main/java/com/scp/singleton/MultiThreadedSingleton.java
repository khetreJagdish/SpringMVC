package com.scp.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *   In the below code, getInstance() method is not thread safe. 
 *   Multiple threads can access it at the same time and for the first few threads when the instance variable is not initialized, 
 *   multiple threads can enters the if loop and create multiple instances and break our singleton implementation.
 * 		
 * Sometime it will Work but Sometime won't.
 * 		
 * 	*/

class LazyInitializationConnection {
	private static LazyInitializationConnection connection;  // Lazy Loading

	private LazyInitializationConnection() {
			System.out.println("Creating");
	} 
	

	public static LazyInitializationConnection getMyStaticBlockConnection() {
		if (null ==connection ) {
			connection = new LazyInitializationConnection();
		}
		return connection;
	}
	
	

}

public class MultiThreadedSingleton {
	
	 static void useSingleton() {
		LazyInitializationConnection connection = LazyInitializationConnection.getMyStaticBlockConnection();
		System.out.println("Connection :" + connection.hashCode());
	}
	public static void main(String[] args) {
			ExecutorService service = Executors.newFixedThreadPool(4);
			service.submit(MultiThreadedSingleton :: useSingleton);
			service.submit(MultiThreadedSingleton :: useSingleton);
			service.submit(MultiThreadedSingleton :: useSingleton);
			service.submit(MultiThreadedSingleton :: useSingleton);
			service.shutdown();
			}
	

}

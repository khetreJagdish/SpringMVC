package com.scp.singleton;

public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton INSTANCE;
	
	private LazyInitializedSingleton() {}
	
	public static LazyInitializedSingleton getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new LazyInitializedSingleton();
		}
		return INSTANCE;
	}
}

package com.scp.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton INSTANCE;
		
		private StaticBlockSingleton() {
		
			
	}
		static {
			try {
				INSTANCE = new StaticBlockSingleton();
			} catch (Exception e) {
				throw new RuntimeException("Exception occured in creating singleton instance");
			}
		}
	public static StaticBlockSingleton getInstance() {
		
		return INSTANCE;
	}
}

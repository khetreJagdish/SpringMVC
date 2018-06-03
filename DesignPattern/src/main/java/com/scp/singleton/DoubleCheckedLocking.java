package com.scp.singleton;

public class DoubleCheckedLocking {
	
	private static DoubleCheckedLocking INSTANCE;
	
	private DoubleCheckedLocking() {}
	
	public static  DoubleCheckedLocking getInstance() 
	{
		
		if(null == INSTANCE) 
		{
			synchronized (DoubleCheckedLocking.class) 
			{
				if(null == INSTANCE) 
				{
					INSTANCE = new DoubleCheckedLocking();
				}
			}
		}
		return INSTANCE;
		
	}
	
}

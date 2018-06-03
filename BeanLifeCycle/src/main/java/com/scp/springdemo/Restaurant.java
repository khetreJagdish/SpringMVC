package com.scp.springdemo;


public class Restaurant 
{
	
	
	protected class Drawing{
		private Restaurant restaurant;

		public Restaurant getRestaurant() {
			return restaurant;
		}

		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
		}
		
		
	}
		public void greetCustomer() {
			System.out.println("greetCustomer");
		}
		
		Restaurant restaurant = new Restaurant();
		Drawing drawing =new Drawing();

}

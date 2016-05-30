package Model;

import DAO.FlyWithRocket;
import DAO.Squeak;

public class RedheadDuck extends Duck {
	
	public RedheadDuck(){
		setQuackBehavior(new Squeak());
		setFlyBehavior(new FlyWithRocket());
	}
	
	public void display(){
		System.out.println("I'm a real RedheadDuck");
	}
}
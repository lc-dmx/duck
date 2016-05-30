package Model;

import DAO.FlyNoWay;
import DAO.MuteQuack;

public class RubberDuck extends Duck {
	
	public RubberDuck(){
		setQuackBehavior(new MuteQuack());
		setFlyBehavior(new FlyNoWay())	;
	}
	
	public void display(){
		System.out.println("I'm a real RubberDuck");
	}
}
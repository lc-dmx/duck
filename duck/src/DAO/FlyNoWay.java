package DAO;

import IDAO.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
	
	public void fly(){
		System.out.println("I can't fly");
	}
}
package Model;

import IDAO.QuackBehavior;
import IDAO.FlyBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void swim(){
		System.out.println("All ducks float");
	}
	
	public void setFlyBehavior(FlyBehavior behavior) {
		this.flyBehavior = behavior;
	}
	
	public void setQuackBehavior(QuackBehavior behavior) {
		this.quackBehavior = behavior;
	}

}
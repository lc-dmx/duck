package test;

import java.util.Scanner;

import Model.Duck;
import Model.MallardDuck;
import Model.RedheadDuck;
import Model.RubberDuck;

public class MiniDuckSimulator {

	public static void main(String[] args){

		@SuppressWarnings("resource")
		Scanner duck = new Scanner(System.in);
		System.out.println("请输入所查询的鸭子种类:");

		while (true) {
			String duckType = duck.next();
			if(duckType.equals("MallardDuck")){
				
				Duck MallardDuck = new MallardDuck();
				MallardDuck.display();
				MallardDuck.performQuack();
				MallardDuck.performFly();
				MallardDuck.swim();
				
			}else if(duckType.equals("RedheadDuck")){
				
				Duck RedheadDuck = new RedheadDuck();
				RedheadDuck.display();
				RedheadDuck.performQuack();
				RedheadDuck.performFly();
				RedheadDuck.swim();

			}else if(duckType.equals("RubberDuck")){
				
				Duck RubberDuck = new RubberDuck();
				RubberDuck.display();
				RubberDuck.performQuack();
				RubberDuck.performFly();
				RubberDuck.swim();

			}else{
				break;
			}

		} 

	}
}
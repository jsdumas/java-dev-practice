package designpatterns.hf.behavioural.strategy.duck;

import designpatterns.hf.behavioural.strategy.behaviour.FlyNoWay;
import designpatterns.hf.behavioural.strategy.behaviour.MuteQuack;

public class DecoyDuck extends Duck {

	// Constructor assign a behaviour implemented to behaviour interfaced in extended Class Duck with setter
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	@Override
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
package com.test.design.pattern.strategy.withENUM;

public class PlayMatch {

	public static void main(String args[])
	{
		Player p1 = new Player(Strategy.t20);
		p1.play();
		
		Player p2 = new Player(Strategy.oneday);
		p2.play();
		
		Player p3 = new Player(Strategy.test);
		p3.play();

	}
}

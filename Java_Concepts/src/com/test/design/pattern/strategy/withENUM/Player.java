package com.test.design.pattern.strategy.withENUM;

public class Player {
	private Strategy playerStrategy;
	
	public Player(Strategy strt) {
		this.playerStrategy = strt;
	}
	
	/*
	public void setStrategy(Strategy newStrategy) {
		this.playerStrategy = newStrategy;
	}
	*/
	public void play() {
		playerStrategy.play();
	}

}

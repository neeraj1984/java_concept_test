package com.test.design.pattern.strategy.withENUM;

public enum Strategy {
	t20() {
		@Override
		void play() {
			System.out.println("play t20");
		}
	},
	oneday{
		@Override
		void play() {
			System.out.println("play oneday match");
		}
		
	},
	test{
		@Override
		void play() {
			System.out.println("play test");
		}
	};
	
	
	//this method will be overriden by all enum constants
	void play() {		
		System.out.println("default play() method..");
	}

}

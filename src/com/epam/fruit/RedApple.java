package com.epam.fruit;

public class RedApple<E extends RedApple<E>> extends Apple<E> {

	public RedApple(int weight, int radius) {
		super(weight, radius);
	}

	/*
	@Override
	public int compareTo(E a) {
		return super.compareTo(a);
	}
	*/
	
}

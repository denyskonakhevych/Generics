package com.epam.fruit;

public abstract class Fruit/* implements Comparable*/ {

	protected int weight;
	
	public Fruit(int weight) {
		this.weight = weight;
	}
	/*
	public int compareTo(Object o) {
		if (o == null || !(o instanceof Fruit)) {
			throw new IllegalArgumentException("Wrong parameter: " + o);
		}
		Fruit that = (Fruit) o;
		return weight - that.weight;
	}
	*/
}

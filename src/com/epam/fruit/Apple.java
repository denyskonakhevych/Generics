package com.epam.fruit;

public class Apple<E extends Apple<E>> extends Fruit implements Comparable<E>/* implements Comparable<Apple>*/ {

	private int radius;
	
	public Apple(int weight, int radius) {
		super(weight);
		this.radius = radius;
	}

	@Override
	public int compareTo(Apple a) {
		if (a == null) {
			throw new IllegalArgumentException("Wrong parameter: " + a);
		}
		int weightDifference = weight - a.weight;
		if (weightDifference != 0) {
			return weightDifference;
		}
		return radius - a.radius;
	}

	@Override
	public String toString() {
		return "Apple {weight=" + weight + "; radius=" + radius +"}";
	}
	
	
}

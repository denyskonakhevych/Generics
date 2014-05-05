package com.epam.fruit;

public class Apple<E extends Apple<E>> extends Fruit implements Comparable<E> {

	protected int radius;
	
	public Apple(int weight, int radius) {
		super(weight);
		this.radius = radius;
	}

	@Override
	public int compareTo(E a) {
		if (a == null) {
			throw new IllegalArgumentException("Wrong parameter: " + a);
		}
		int weightDifference = weight - a.weight;
		if (weightDifference != 0) {
			return weightDifference < 0 ? -1 : 1;
		}
		int radiusDifference = radius - a.radius;
		return radiusDifference == 0 ? 0 : radiusDifference < 0 ? -1 : 1;
	}

	@Override
	public String toString() {
		return "Apple {weight=" + weight + "; radius=" + radius +"}";
	}
	
}

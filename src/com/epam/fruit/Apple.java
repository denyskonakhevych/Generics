package com.epam.fruit;

public class Apple extends Fruit implements Comparable<Apple> {

	private int radius;
	
	public Apple(int weight, int radius) {
		super(weight);
		this.radius = radius;
	}

	@Override
	public int compareTo(Apple a) {
		/*
		if (o == null || !(o instanceof Apple)) {
			throw new IllegalArgumentException("Wrong parameter: " + o);
		}
		int weightCompare = super.compareTo(o);
		if (weightCompare != 0) {
			return weightCompare;
		}
		Apple that = (Apple) o;
		return radius - that.radius;
		*/
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

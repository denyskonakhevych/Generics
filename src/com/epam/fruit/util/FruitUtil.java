package com.epam.fruit.util;

import java.util.Collection;

public class FruitUtil {
	
	public static <T extends Comparable<T>> Collection<T> getBiggerThan(Collection<T> in, T comparative) throws InstantiationException, IllegalAccessException {
		Collection<T> rez = in.getClass().newInstance(); // TODO: is it correct?
		for (T elem : in) {
			if (elem.compareTo(comparative) > 0) {
				rez.add(elem);
			}
		}
		return rez;
	}
	
	public static <T> void copyAll(Collection<? extends T> in, Collection<T> out) {
		if (in == null) {
			throw new IllegalArgumentException("Invalide source argument: " + in);
		}
		if (out == null) {
			throw new IllegalArgumentException("Invalide destination argument: " + out);
		}
		for (T fruit : in) {
			out.add(fruit);
		}
	}
}

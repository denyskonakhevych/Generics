package com.epam.arraytocollection;

import java.util.Collection;

public class MyArrayConverter {

	public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		if (a == null) {
			throw new IllegalArgumentException("Invalide source argument: " + a);
		}
		if (c == null) {
			throw new IllegalArgumentException("Invalide destination argument: " + a);
		}
		for (T o : a) {
			c.add(o);
		}
	}
}

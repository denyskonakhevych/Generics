package com.epam.arraytocollection;

import java.util.ArrayList;
import java.util.Collection;

public class MyArray {
	
	public static void main(String[] args) {
		String[] array = {"a", "b", "c"};
		Collection<String> collection = new ArrayList<>();
		MyArray.fromArrayToCollection(array, collection);
		System.out.println(collection);
	}

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

package com.epam.arraytocollection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class MyArrayConverterTest {

	@Test
	public void testStringsArrayList() {
		String[] array = {"a", "b", "c"};
		Collection<String> collection = new ArrayList<>();
		MyArrayConverter.fromArrayToCollection(array, collection);
		assertEquals(array, collection.toArray());
	}
	
	@Test
	public void testStringsLinkedList() {
		String[] array = {"a", "b", "c"};
		Collection<String> collection = new LinkedList<>();
		MyArrayConverter.fromArrayToCollection(array, collection);
		assertEquals(array, collection.toArray());
	}
	
	@Test
	public void testIntegerArrayList() {
		Integer[] array = {1, 2, 3};
		Collection<Integer> collection = new ArrayList<>();
		MyArrayConverter.fromArrayToCollection(array, collection);
		assertEquals(array, collection.toArray());
	}
	
	@Test
	public void testIntegerLinkedList() {
		Integer[] array = {1, 2, 3};
		Collection<Integer> collection = new LinkedList<>();
		MyArrayConverter.fromArrayToCollection(array, collection);
		assertEquals(array, collection.toArray());
	}
	
	@Test
	public void testIntegerHashSet() {
		Integer[] array = {1, 2, 3};
		Set<Integer> collection = new HashSet<>();
		MyArrayConverter.fromArrayToCollection(array, collection);
		assertEquals(array, collection.toArray());
	}
	
	@Test
	public void testIntegerTreeSet() {
		Integer[] array = {1, 2, 3};
		TreeSet<Integer> collection = new TreeSet<>();
		MyArrayConverter.fromArrayToCollection(array, collection);
		assertEquals(array, collection.toArray());
	}
}

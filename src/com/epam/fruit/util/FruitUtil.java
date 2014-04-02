package com.epam.fruit.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.epam.fruit.Apple;
import com.epam.fruit.Fruit;
import com.epam.fruit.Melon;
import com.epam.fruit.Orange;
import com.epam.fruit.RedApple;

public class FruitUtil {
	
	public static void main(String[] args) {
		
		/*
		FruitUtil futil = new FruitUtil();
		List<Fruit> fru = null;
		List<Apple> app = null;
		List<Orange> orn = null;
		List<RedApple> rapp = null;
		List<Melon> mel = null;

		copyAll(orn, fru);
		copyAll(rapp, fru);
		copyAll(rapp, app);
		copyAll(rapp, rapp);
		//copyAll(fr, or);
		//copyAll(or, app);
		*/
		/*
		Apple ap = new Apple(70, 9);
		RedApple rap = new RedApple(99, 25);
		Orange or = new Orange(110);
		Melon me = new Melon(500);
		*/
		/*
		Apple ap1 = new Apple(70, 10);
		Apple ap2 = new Apple(80, 10);
		Apple ap3 = new Apple(90, 10);
		Apple apEtalon = new Apple(80, 9);
		List<Apple> app = new ArrayList<>();
		app.add(ap1);
		app.add(ap2);
		app.add(ap3);
		try {
			System.out.println(getBiggerThan(app, apEtalon));
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		/*
		Apple ap1 = new Apple(70, 10);
		Apple ap2 = new Apple(80, 10);
		Apple ap3 = new Apple(90, 10);
		Apple ap4 = new Apple(70, 8);
		Apple ap5 = new Apple(69, 11);
		RedApple rap1 = new RedApple(70, 10);
		RedApple rap2 = new RedApple(80, 9);
		Orange or1 = new Orange(70);
		Melon me1 = new Melon(2000);
		System.out.println(ap1.compareTo(ap2)); // -10
		System.out.println(ap2.compareTo(ap3)); // -10
		System.out.println(ap1.compareTo(ap4)); // 2
		System.out.println(ap1.compareTo(ap5)); // 1
		System.out.println(ap4.compareTo(ap5)); // 1
		
		System.out.println(ap1.compareTo(rap1)); // 0
		System.out.println(ap2.compareTo(rap2)); // 1
		
		//System.out.println(or1.compareTo(ap1));
		//System.out.println(ap1.compareTo(or1));
		//System.out.println(ap1.compareTo(me));
		*/
		
	}
	
	public static <T extends Comparable<T>> Collection<T> getBiggerThan(Collection<T> in, T comparative) throws InstantiationException, IllegalAccessException {
		Collection<T> rez = in.getClass().newInstance();
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

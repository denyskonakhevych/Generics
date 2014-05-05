package com.epam.fruit.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.epam.fruit.*;

public class FruitUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCopyAllCompilation() {
		
		List<Fruit> fru = null;
		List<Apple> app = null;
		List<Orange> orn = null;
		List<RedApple> rapp = null;
		List<Melon> mel = null;
		
		FruitUtil.copyAll(orn, fru);
		FruitUtil.copyAll(rapp, fru);
		FruitUtil.copyAll(rapp, app);
		FruitUtil.copyAll(rapp, rapp);
		//FruitUtil.copyAll(fr, or);
		//FruitUtil.copyAll(or, app);
	}
	
	@Test
	public void testGetNewCollectionWithElementsBiggerThanSpecified() {
		
		Apple ap1 = new Apple(70, 10);
		Apple ap2 = new Apple(80, 10);
		Apple ap3 = new Apple(90, 10);
		Apple apEtalon = new Apple(80, 9);
		List<Apple> app = new ArrayList<>();
		app.add(ap1);
		app.add(ap2);
		app.add(ap3);
		List<Apple> newListOfFruits = null;
		try {
			newListOfFruits = (List<Apple>) FruitUtil.getBiggerThan(app, apEtalon);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		assertEquals(2, newListOfFruits.size());
		assertEquals(ap2, newListOfFruits.get(0));
		assertEquals(ap3, newListOfFruits.get(1));
	}
	
	@Test
	public void testFirstAppleLighterThanSecond_SecondBigger() {
		
		Apple ap2 = new Apple(80, 10);
		Apple ap3 = new Apple(90, 10);
		assertEquals(-1, ap2.compareTo(ap3));
	}
	
	@Test
	public void testFirstAppleWiderThanSecond_FirstBigger() {
		Apple ap1 = new Apple(70, 10);
		Apple ap4 = new Apple(70, 8);
		assertEquals(1, ap1.compareTo(ap4));
	}
	
	@Test
	public void testFirstAppleHeavierThanSecondAndSecondWider_FirstBigger() {
		Apple ap1 = new Apple(70, 10);
		Apple ap5 = new Apple(69, 11);
		assertEquals(1, ap1.compareTo(ap5));
	}
	
	@Test
	public void testFirstAppleLighterThanSecondAndSecondWider_SecondBigger() {
		Apple ap4 = new Apple(69, 10);
		Apple ap5 = new Apple(70, 11);
		assertEquals(-1, ap4.compareTo(ap5));
	}
	
	@Test
	public void testRedAndRegularApllesWithSameParametres_Equals() {
		Apple ap1 = new Apple(70, 10);
		RedApple rap1 = new RedApple(70, 10);
		assertEquals(0, ap1.compareTo(rap1));
	}
	
	@Test
	public void testFirstAppleWiderThanSecondRedApple_FirstBigger() {
		Apple ap2 = new Apple(80, 10);
		RedApple rap2 = new RedApple(80, 9);
		assertEquals(1, ap2.compareTo(rap2));
	}
}

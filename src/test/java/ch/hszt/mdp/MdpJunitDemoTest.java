package ch.hszt.mdp;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ch.hszt.mdp.impl.MdpJunitDemoImpl;

public class MdpJunitDemoTest {

	private IMdpJunitDemo junitDemo;

	@Before
	public void init() {
		junitDemo = new MdpJunitDemoImpl();
	}

	@Test
	public void isEmptyNull() {
		assertTrue(junitDemo.isEmpty(null));
	}
	
	@Test
	public void isEmptyString() {
		assertTrue(junitDemo.isEmpty(""));
	}
	
	@Test
	public void isEmptyNot() {
		assertFalse(junitDemo.isEmpty("noo000t"));
	}
	
	@Test
	public void capatilzeSmall() {
		assertEquals("Hello", junitDemo.capitalize("hello"));
	}
	
	@Test
	public void capatilzeCapsLock() {
		assertEquals("Hello", junitDemo.capitalize("HELLO"));
	}
	
	@Test
	public void capatilzeNumber() {
		assertEquals("123abc", junitDemo.capitalize("123ABC"));
	}
	
	@Test(expected=NullPointerException.class)
	public void reverseNull() {
		junitDemo.reverse(null);
	}
	
	@Test
	public void reverseText() {
		assertEquals("zsH tseT", junitDemo.reverse("Test Hsz"));
	}
	
    @Test
	public void joinText() {
		assertEquals("a b c", junitDemo.join("a","b","c"));
	}
    
    @Test
	public void joinEmpty() {
		assertEquals("", junitDemo.join(""));
	}
    
    @Test
	public void joinNull() {
		assertEquals(null, junitDemo.join());
	}
}

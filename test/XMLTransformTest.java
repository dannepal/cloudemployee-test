package com.otagate.engine;

import org.junit.Before;
import org.junit.Test;

public class XMLTransformTest {
	
	private XMLTransform transformer;
	private String apollo;
	private String budget;

	@Before
	public void setup() {
		apollo = "apollo.xml";
		budget = "budget.xml";
		transformer = new XMLTransform();
	}
	
	@Test
	public void testXMLTransformApollo() {
		transformer.transform(apollo);
	}
	
	@Test
	public void testXMLTransformBudget() {
		transformer.transform(budget);
	}
}

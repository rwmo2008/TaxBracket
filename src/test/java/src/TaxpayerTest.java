package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaxpayerTest {
	private static Taxpayer testPayer;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_singleTaxpayer0Income() {
		testPayer = new Taxpayer("single", 0);
		assertEquals("single", testPayer.getType());
		assertEquals(0, testPayer.getIncome());
		assertEquals(0.0, testPayer.calculateTax("single", 0), 0.001);
	}

	@Test
	void test_singleTaxpayer700KIncome() {
		testPayer = new Taxpayer("single", 700000);
		assertEquals(223072.25, testPayer.calculateTax("single", 700000), 0.001);
	}
	
	/*@Test
	void test_headTaxpayer700KIncome() {
		testPayer = new Taxpayer("head", 700000);
		assertEquals("single", testPayer.getType());
		assertEquals(0, testPayer.getIncome());
		assertEquals(223072.25, testPayer.calculateTax("single", 0), 0.001);
	}*/
}

package cl.ubb.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testMyMath {
	
	@Test
	public void AddTwoAndTwoIsFour(){  //prueba de la suma de 2+2
		//arrage
		MyMath myMath = new MyMath();
		
		//act
		int resultado= myMath.add(2, 2);
		
		//assert
		assertEquals(resultado, 4);
		
	}
	
	@Test
	public void AddMinusOneAndTwoIsThree(){  //prueba de la suma de -1y4
		//arrage
		MyMath myMath = new MyMath();
		
		//act
		int resultado= myMath.add(-1, 4);
		
		//assert
		assertEquals(resultado, 3);
	
	}
	
}

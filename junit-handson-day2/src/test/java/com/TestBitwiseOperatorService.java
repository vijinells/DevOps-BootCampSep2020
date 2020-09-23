/**
 * 
 */
package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


/**
 * @author Vijayalakshmi
 *
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestBitwiseOperatorService {
	
	BitwiseOperatorService bitwiseService=new BitwiseOperatorService();
	
	@Test
	public void bitwiseAnd(){
		Assertions.assertEquals(2, bitwiseService.bitwiseAnd());
	}
	
	@Test
	public void bitwiseOr(){
		Assertions.assertEquals(3, bitwiseService.bitwiseOr());
	}
	
	@Test
	public void bitwiseXor(){
		Assertions.assertEquals(1, bitwiseService.bitwiseXor());
	}
	
	@Test
	public void bitwiseCompliment(){
		Assertions.assertEquals(-4, bitwiseService.bitwiseCompliment());
	}
	
	@Test
	public void bitwiseLeftShift(){
		Assertions.assertEquals(8, bitwiseService.bitwiseLeftShift(2));
	}
}

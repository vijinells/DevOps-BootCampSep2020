/**
 * 
 */
package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

/**
 * @author Vijayalakshmi
 *
 */
@RestController
@RequestMapping("/bitwise")
public class BitwiseOperatorService {
	
	@GetMapping("/and")
	@ResponseStatus(HttpStatus.OK)
	public int bitwiseAnd(){
		int a=3,b=2;
		return a & b;
	}
	
	@GetMapping("/or")
	@ResponseStatus(HttpStatus.OK)
	public int bitwiseOr(){
		int a=3,b=2;
		return a | b;
	}
	
	@GetMapping("/xor")
	@ResponseStatus(HttpStatus.OK)
	public int bitwiseXor(){
		int a=3,b=2;
		return a ^ b;
	}
	
	@GetMapping("/compliment")
	@ResponseStatus(HttpStatus.OK)
	public int bitwiseCompliment(){
		int a=3;
		return ~a;
	}
	
	@GetMapping("/leftshift/{a}")
	@ResponseStatus(HttpStatus.OK)
	public int bitwiseLeftShift(@PathVariable int a){		
		return a<<2;
	}

}

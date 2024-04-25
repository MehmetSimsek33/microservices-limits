package com.in28minutes.restfull.restfullwebservice.versioning;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Name {
	private String firstName;
	private String lastName;
	
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}

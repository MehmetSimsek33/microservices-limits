package com.in28minutes.restfull.restfullwebservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonelController {

	
	@GetMapping("v1/person")
	public PersonV1 getPerson() {
		return new PersonV1("bob charlie");
	}
	@GetMapping("v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("bob", "charlie"));
	}
}


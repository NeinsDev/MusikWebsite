package org.nicoc.MusikFinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusikFinderApplication {

	@GetMapping("/")
	public String index() {
		return "Hello World";
	}

}

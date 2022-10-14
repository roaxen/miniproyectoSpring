package com.boot.MiniProyecto;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BackendV0 {
	@GetMapping(value = "aboutUs", produces=MediaType.TEXT_PLAIN_VALUE)
	
	public String aboutUs() throws IOException {
		
		String file = "S:\\M13\\MiniProyecto1\\aboutUs.json";
		String jsonFile = new String(Files.readAllBytes(Paths.get(file)));
		return jsonFile;
	}
	
	@GetMapping(value = "contact", produces=MediaType.TEXT_PLAIN_VALUE)
	public String contact() throws IOException {
		
		String file = "S:\\M13\\MiniProyecto1\\contact.json";
		String jsonFile = new String(Files.readAllBytes(Paths.get(file)));
		return jsonFile;
	}
}
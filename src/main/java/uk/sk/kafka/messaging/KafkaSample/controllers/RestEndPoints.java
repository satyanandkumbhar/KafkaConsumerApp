package uk.sk.kafka.messaging.KafkaSample.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoints {
	@RequestMapping(method= {RequestMethod.GET})
	public ResponseEntity<?> ping() {
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
}
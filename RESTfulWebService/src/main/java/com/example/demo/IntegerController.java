package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegerController {
	public static final String template="Your number is:%d";
	private final AtomicLong atomicLong=new AtomicLong();

	@GetMapping("/number")
	public Integer number(@RequestParam(value="num",defaultValue="0")int num) {
		return new Integer(atomicLong.incrementAndGet(),String.format(template, num));
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
// // Add the controller
// @RestController
// class Helloworld {
//         @GetMapping("/")
//         public String greet() {
//                 return "Hello GKE!";
//         }
// }

// @RestController
// public class WebController {

// 	private final JdbcTemplate jdbcTemplate;

// 	public WebController(JdbcTemplate jdbcTemplate) {
// 		this.jdbcTemplate = jdbcTemplate;
// 	}

// 	@GetMapping("/getTuples")
// 	public List<String> getTuples() {
// 		return this.jdbcTemplate.queryForList("SELECT * FROM tbl_employees").stream()
// 				.map((m) -> m.values().toString())
// 				.collect(Collectors.toList());
// 	}
// }
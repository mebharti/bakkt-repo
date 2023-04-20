package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Web app controller class for sample application. Contains a function that runs a query and displays the results.
 *
 * @author João André Martins
 * @author Chengyuan Zhao
 */
@RestController
public class WebController {

	private final JdbcTemplate jdbcTemplate;

	public WebController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@GetMapping("/")
	public List<String> getTuples() {
		return this.jdbcTemplate.queryForList("SELECT * FROM users").stream()
				.map((m) -> m.values().toString())
				.collect(Collectors.toList());
	}
}
package com.travel.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExploreApplication {

	// @Autowired
	// private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ExploreApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * String sqlString =
	 * "INSERT INTO user (id, fullname, email, password) VALUES (?, ?, ?, ?)";
	 * 
	 * int result = jdbcTemplate.update(sqlString, 3, "Testing",
	 * "syihabuddin@expointravel.com", "RahasiaHEHE");
	 * 
	 * if (result > 0) { System.out.println("A new row has been inserted."); }
	 * 
	 * }
	 */

}

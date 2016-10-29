package com.doug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringH2andSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringH2andSecurityApplication.class, args);
	}

	@Autowired
	private JdbcTemplate template;

	@RequestMapping("/")
	public List<Map<String, Object>> stocks() {
		return template.queryForList("select * from stock");
	}

}

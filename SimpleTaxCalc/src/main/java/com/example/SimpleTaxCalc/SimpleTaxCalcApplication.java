package com.example.SimpleTaxCalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleTaxCalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleTaxCalcApplication.class, args);
	}

	@RestController
	@RequestMapping("/api")
	class TaxCalculatorController {

		@GetMapping("/tax")
		public double calculateTax(@RequestParam double income, @RequestParam double taxRate) {
			return income * (taxRate / 100);
		}
	}

	@Controller
	class IndexController {
		@GetMapping("/indx")
		public String index() {
			return "index";
		}
	}

}

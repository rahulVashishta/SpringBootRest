package com.rahul.contract.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.contract.dao.Contract;

/**
 * @author Rahul Vashishta
 * @created on Nov 4, 2016 11:17:48 PM
 */
@RestController
public class ContractController {

	@ResponseBody
	@RequestMapping("/")
	String entry(){
		return "My Spring Boot App";
	}

	@RequestMapping(value="{contractNumber}")
	public Contract getContract(@PathVariable final int contractNumber) {
		Contract contract = new Contract();
		contract.setName("Rahul Vashishta");
		contract.setId(contractNumber);
		return contract;
	}

}

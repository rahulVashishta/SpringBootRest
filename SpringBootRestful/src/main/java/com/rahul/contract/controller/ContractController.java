package com.rahul.contract.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.contract.dao.Contract;

/**
 * @author Rahul Vashishta
 * @created on Nov 4, 2016 11:17:48 PM
 */
@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {

	public static final String CONTRACT_BASE_URI = "src/v1/controllers";

	@RequestMapping(value="{contractNumber}")
	public Contract getContract(@PathVariable final int contractNumber) {
		Contract contract = new Contract();
		contract.setName("Rahul Vashishta");
		contract.setId(contractNumber);
		return contract;
	}

}

package com.bansco.generator.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bansco.generator.dao.InputsDao;
import com.bansco.generator.models.Input;
import com.bansco.generator.models.Inputs;
import com.bansco.generator.models.Output;

@RestController
@RequestMapping("/api")
public class generatorController {

	protected final InputsDao inputsDao;

	generatorController(InputsDao inputsDao) {
		this.inputsDao = inputsDao;
	}

	@RequestMapping(value = "/generate/{input1}/{input2}/{input3}/{input4}/{input5}", method = RequestMethod.GET)
	public Output genrateMail(@PathVariable Input input1, @PathVariable Input input2, @PathVariable Input input3,
			@PathVariable Input input4, @PathVariable Input input5) {
		return inputsDao.expression(new Inputs(input1, input2, input3, input4, input5));
	}

}

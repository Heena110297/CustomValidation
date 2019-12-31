package Implementations;

import javax.validation.Validation;

import java.util.HashMap;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.util.CollectionUtils;

import Entities.Example;

public class ValidationServiceImpl {

	public static HashMap<String, String> validate(String key1, String key2, String key3) {
		HashMap<String, String> result = new HashMap<String, String>();
		Example req = new Example(key1, key2, key3);
		Validator validator;
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
		Set<ConstraintViolation<Example>> violations = validator.validate(req);
		if (!CollectionUtils.isEmpty(violations)) {
			for (ConstraintViolation<Example> violation : violations) {
				String propertyPath = violation.getPropertyPath().toString();
				String message = violation.getMessage();
				result.put(propertyPath, message);
			}
		}
		return result;
	}

}

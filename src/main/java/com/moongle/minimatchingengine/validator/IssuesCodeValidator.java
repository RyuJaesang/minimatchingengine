package com.moongle.minimatchingengine.validator;

import com.moongle.minimatchingengine.annotation.OrderPrice;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OrderPriceValidator implements ConstraintValidator<OrderPrice, Long> {
    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null || value == 0) {
            return false;
        }
        return true;
    }

}

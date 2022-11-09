package com.moongle.minimatchingengine.validator;

import com.moongle.minimatchingengine.annotation.OrderPrice;
import com.moongle.minimatchingengine.repository.IssuesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class OrderPriceValidator implements ConstraintValidator<OrderPrice, Object> {
    private final IssuesRepository repository;
    private String issuesName;
    private Long basePrice;
    private Long orderPrice;

    @Override
    public void initialize(OrderPrice constraintAnnotation) {
        this.issuesName = constraintAnnotation.issuesName();
        this.orderPrice = constraintAnnotation.orderPrice();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return false;
    }

}

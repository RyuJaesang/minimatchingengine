package com.moongle.minimatchingengine.annotation;

import com.moongle.minimatchingengine.validator.OrderPriceValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OrderPriceValidator.class)
public @interface OrderPrice {
    String message() default "호가 가격 범위 오류";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String issuesName();
    Long orderPrice();

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {
        OrderPrice[] value();
    }
}

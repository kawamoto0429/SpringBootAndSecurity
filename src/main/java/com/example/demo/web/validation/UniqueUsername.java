package com.example.demo.web.validation;

import javax.swing.text.Element;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueUsernameValidator.class)
public @interface UniqueUsername {
    String message() default "入力されたユーザーは既に登録されています。別のユーザーを入力してください";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


package ru.kpfu.itis.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.kpfu.itis.models.Operation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyValidator implements Validator {

    static Pattern p = Pattern.compile("\\d+|^$");

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    public void validate(Object o, Errors errors) {
        Operation operation = (Operation) o;

        if (operation.getArg_1() == null || operation.getArg_1().isEmpty()) {
            errors.rejectValue("arg_1", "", "Поле не может быть пустым");
        }

        if (operation.getArg_2() == null || operation.getArg_2().isEmpty()) {
            errors.rejectValue("arg_2", "", "Поле не может быть пустым");
        }

        if (operation.getNameOperation().equals("division") && operation.getArg_2().equals("0")) {
            errors.rejectValue("arg_2", "", "Делить на ноль нельзя");
        }

        Matcher matcher_arg_1 = p.matcher(operation.getArg_1());
        Matcher matcher_arg_2 = p.matcher(operation.getArg_2());

        if (!matcher_arg_1.matches()) {
            errors.rejectValue("arg_1", "", "Тут можно вводить только цифру");
        }
        if (!matcher_arg_2.matches()) {
            errors.rejectValue("arg_2", "", "Тут можно вводить только цифру");
        }
    }
}

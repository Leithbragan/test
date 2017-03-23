package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.models.Operation;
import ru.kpfu.itis.service.OperationService;
import ru.kpfu.itis.util.MyValidator;

@Controller
@RequestMapping(value = "/calculator")
public class CalculatorController {

    @Autowired
    OperationService operationService;

    private MyValidator myValidator = new MyValidator();

    @RequestMapping(value = "/history")
    public String showAllOperation(Model model) {
        model.addAttribute("operation", operationService.getAllOperation());
        return "history";
    }

    @RequestMapping(value = "/play")
    public String addOperation(Model model) {
        Operation operation = new Operation();
        model.addAttribute("operation", operation);
        model.addAttribute("nameOperation", operation.getNameOperation());
        model.addAttribute("total", operation.getTotal());
        return "play";
    }

    @RequestMapping(value = "/play_operation", method = RequestMethod.POST)
    public String saveOperation(@ModelAttribute Operation operation, BindingResult result) {
        myValidator.validate(operation, result);
        if (result.hasErrors()) {
            return "play";
        } else {
            operationService.addOperation(operation);
            System.out.println(operationService.makeOperation(operation).getTotal());

            return "play";
        }
    }


}

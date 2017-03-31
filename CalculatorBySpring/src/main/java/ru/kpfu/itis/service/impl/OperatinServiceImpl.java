package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.models.Operation;
import ru.kpfu.itis.repository.OperationRepository;
import ru.kpfu.itis.service.OperationService;

import java.util.List;

@Service
public class OperatinServiceImpl implements OperationService {

    @Autowired
    OperationRepository repository;

    @Override
    public List<Operation> getAllOperation() {
        return repository.getAllOperation();
    }

    @Override
    public void addOperation(Operation operation) {
        repository.addOperation(makeOperation(addSymbol(operation)));
    }

    @Override
    public Operation makeOperation(Operation operation) {
        String result = "";
        Operation buffer = operation;
        double arg_1 = Double.valueOf(operation.getArg_1());
        double arg_2 = Double.valueOf(operation.getArg_2());
        switch (operation.getNameOperation()) {
            case "sum":
                result = Double.toString(arg_1 + arg_2);
                break;
            case "minus":
                result = Double.toString(arg_1 - arg_2);
                break;
            case "multiplication":
                result = Double.toString(arg_1 * arg_2);
                break;
            case "division":
                result = Double.toString(arg_1 / arg_2);
        }
        operation.setTotal(result);
        return buffer;
    }

    public Operation addSymbol(Operation operation) {
        Operation buffer = operation;
        switch (buffer.getNameOperation()) {
            case "sum":
                buffer.setSymbol("+");
                break;
            case "minus":
                buffer.setSymbol("-");
                break;
            case "multiplication":
                buffer.setSymbol("*");
                break;
            case "division":
                buffer.setSymbol("/");
        }
        return buffer;
    }

    @Override
    public Operation put_value_in_input(Operation operation) {
        operation.setArg_1(operation.getTotal());
        operation.setArg_2("");
        return operation;
    }

}

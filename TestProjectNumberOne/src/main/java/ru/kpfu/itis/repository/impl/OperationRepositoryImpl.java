package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.models.Operation;
import ru.kpfu.itis.repository.OperationRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OperationRepositoryImpl implements OperationRepository {

    List<Operation> operations = new ArrayList<Operation>() {{
        add(new Operation("3476", "34", "sum", "+", "3510"));
        add(new Operation("12", "29", "multiplication", "*", "348"));
        add(new Operation("1256", "456", "minus", "-", "800"));
        add(new Operation("34", "2", "division", "/", "17"));
    }};

    @Override
    public List<Operation> getAllOperation() {
        return operations;
    }

    @Override
    public Operation findOperationByName(String nameOperation) {
        for (Operation operation : operations) {
            if (operation.getNameOperation() == null || !operation.getNameOperation().equals(nameOperation)) {
                return operation;
            }
        }
        return null;
    }

    @Override
    public void addOperation(Operation operation) {
        operations.add(operation);
    }
}

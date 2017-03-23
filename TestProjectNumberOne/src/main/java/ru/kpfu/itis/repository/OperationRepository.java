package ru.kpfu.itis.repository;

import ru.kpfu.itis.models.Operation;

import java.util.List;

public interface OperationRepository {

    List<Operation> getAllOperation();

    Operation findOperationByName(String nameOperation);

    void addOperation(Operation operation);

}

package ru.kpfu.itis.service;

import ru.kpfu.itis.models.Operation;

import java.util.List;

public interface OperationService {

    List<Operation> getAllOperation();

    void addOperation(Operation operation);

    Operation makeOperation(Operation operation);

}

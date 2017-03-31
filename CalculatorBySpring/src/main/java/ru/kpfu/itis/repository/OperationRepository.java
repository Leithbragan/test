package ru.kpfu.itis.repository;

import ru.kpfu.itis.models.Operation;

import java.util.List;

public interface OperationRepository {

    List getAllOperation();

    void addOperation(Operation operation);

}

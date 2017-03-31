package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.models.Operation;
import ru.kpfu.itis.repository.OperationRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class OperationRepositoryImpl implements OperationRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List getAllOperation() {
        Query query = em.createNativeQuery("SELECT * FROM operation", Operation.class);
        return query.getResultList();
    }

    @Override
    public void addOperation(Operation operation) {
        em.persist(operation);
    }
}

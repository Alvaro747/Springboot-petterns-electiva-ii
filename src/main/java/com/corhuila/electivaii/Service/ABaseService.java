package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.ABaseEntity;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public abstract class ABaseService<T extends ABaseEntity, D, S extends IBaseRepository<T, D>> {

    @Autowired
    protected S repository;

    public List<T> all() {
        return repository.findAll();
    }

    public Optional<T> findById(D id) {
        return repository.findById(id);
    }

    public T save(T entity) {
        return repository.save(entity);
    }


    public List<T> findByStateTrue() {
        return null;
    }

    public void update(D id, T entity) {
        Optional<T> optionalEntity = repository.findById(id);

        if (optionalEntity.isPresent()){
            T entityUpdate = optionalEntity.get();
            updateProperties(entityUpdate, entity);
            repository.save(entityUpdate);
        } else {
            System.out.println("No existe la entidad");
        }
    }

    public void delete(D id) {
        repository.deleteById(id);
    }


    protected abstract void updateProperties(T entityToUpdate, T entity);
}

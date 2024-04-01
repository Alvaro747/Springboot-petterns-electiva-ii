package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.ABaseEntity;
import com.corhuila.electivaii.IRepository.IBaseRepository;
import com.corhuila.electivaii.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
public abstract class ABaseController<T extends ABaseEntity, D, S extends IBaseRepository<T, D>, U extends ABaseService<T, D, S>> {

    @Autowired
    protected U service;

    @GetMapping()
    public List<T> findAll() {
        return service.all();
    }

    @GetMapping("/{id}")
    public Optional<T> findById(@PathVariable D id) {
        return service.findById(id);
    }

    @PostMapping()
    public T save(@RequestBody T entity) {
        return service.save(entity);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody T entity, @PathVariable D id) {
        service.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable D id) {
        service.delete(id);
    }
}

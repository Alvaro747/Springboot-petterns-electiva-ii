package com.corhuila.electivaii.IRepository;

import com.corhuila.electivaii.Entity.Materia;
import com.corhuila.electivaii.Entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatriculaRepository extends IBaseRepository<Matricula, Long> {

}
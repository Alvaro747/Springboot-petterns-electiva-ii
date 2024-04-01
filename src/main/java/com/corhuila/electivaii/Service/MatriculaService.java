package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Matricula;
import com.corhuila.electivaii.IRepository.IMatriculaRepository;
import com.corhuila.electivaii.IService.IMatriculaService;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService extends ABaseService<Matricula, Long, IMatriculaRepository> implements IMatriculaService {

    @Override
    protected void updateProperties(Matricula matriculaToUpdate, Matricula matricula) {
        matriculaToUpdate.setCorte(matricula.getCorte());
        matriculaToUpdate.setNota(matricula.getNota());
        matriculaToUpdate.setEstudianteId(matricula.getEstudianteId());
        matriculaToUpdate.setMateriaId(matricula.getMateriaId());
    }
}

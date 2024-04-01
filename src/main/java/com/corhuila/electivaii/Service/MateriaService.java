package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Materia;
import com.corhuila.electivaii.IRepository.IMateriaRepository;
import com.corhuila.electivaii.IService.IMateriaService;
import org.springframework.stereotype.Service;

@Service
public class MateriaService extends ABaseService<Materia, Long, IMateriaRepository> implements IMateriaService {

    @Override
    protected void updateProperties(Materia materiaToUpdate, Materia materia) {
        materiaToUpdate.setCodigo(materia.getCodigo());
        materiaToUpdate.setNombre(materia.getNombre());
        materiaToUpdate.setEstado(materia.getEstado());
    }
}

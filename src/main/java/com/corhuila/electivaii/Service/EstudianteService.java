package com.corhuila.electivaii.Service;

import com.corhuila.electivaii.Entity.Estudiante;
import com.corhuila.electivaii.IRepository.IEstudianteRepository;
import com.corhuila.electivaii.IService.IEstudianteService;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService extends ABaseService<Estudiante, Long, IEstudianteRepository>
        implements IEstudianteService {

    @Override
    protected void updateProperties(Estudiante estudianteToUpdate, Estudiante estudiante) {
        estudianteToUpdate.setNombre(estudiante.getNombre());
        estudianteToUpdate.setDocumento(estudiante.getDocumento());
        estudianteToUpdate.setEstado(estudiante.getEstado());
    }
}

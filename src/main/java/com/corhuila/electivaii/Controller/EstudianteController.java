package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Estudiante;
import com.corhuila.electivaii.IRepository.IEstudianteRepository;
import com.corhuila.electivaii.Service.EstudianteService;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("api/estudiante")
public class EstudianteController extends ABaseController<Estudiante, Long, IEstudianteRepository, EstudianteService> {
}

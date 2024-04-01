package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Matricula;
import com.corhuila.electivaii.IRepository.IMatriculaRepository;
import com.corhuila.electivaii.Service.MatriculaService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/matricula")
public class MatriculaController extends ABaseController<Matricula, Long, IMatriculaRepository, MatriculaService> {
}


package com.corhuila.electivaii.Controller;

import com.corhuila.electivaii.Entity.Materia;
import com.corhuila.electivaii.IRepository.IMateriaRepository;
import com.corhuila.electivaii.Service.MateriaService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/materia")
public class MateriaController extends ABaseController<Materia, Long, IMateriaRepository, MateriaService> {
}

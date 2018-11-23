package dev.exemple.controller;

import dev.exemple.entite.MyEntity;
import dev.exemple.repository.MyEntityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author formation
 */
@Controller
@RequestMapping("/exemples")
public class ExempleController {

    @Autowired
    private MyEntityRepository exempleRepo;

    @GetMapping
    public List<MyEntity> listerexemples() {
        return this.exempleRepo.findAll();
    }
}

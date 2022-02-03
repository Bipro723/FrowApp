package com.frow.designers.Controller;

import com.frow.designers.Model.Designers;
import com.frow.designers.Repository.DesignersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractAuditable_;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/designers")
public class DesignersController {
    
    @Autowired
    DesignersRepo designersRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Designers> getAllDesigners() {
        return designersRepo.findAll();
    }


    @GetMapping(value = "/{designers}")
    @ResponseStatus(HttpStatus.OK)
    public List<Designers> getAllDesignersByLine(@PathVariable String designers) {
        List<Designers> designer = designersRepo.findDesignersByLine(designers);
        return designer;

    }
}

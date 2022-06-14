package com.stefanini.hackathon.controller;

import com.stefanini.hackathon.dto.AlunoDTO;
import com.stefanini.hackathon.exception.TurmaNotFoundException;
import com.stefanini.hackathon.model.Aluno;
import com.stefanini.hackathon.mapper.AlunoDTOService;
import com.stefanini.hackathon.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoController {

    private final AlunoService alunoService;
    private final AlunoDTOService alunoDTOService;

    @Autowired
    public AlunoController(AlunoService alunoService, AlunoDTOService alunoDTOService) {
        this.alunoService = alunoService;
        this.alunoDTOService = alunoDTOService;
    }

    @Autowired


    @RequestMapping(path = "/aluno")
    public ModelAndView loadHtml(Model model) {

        ModelAndView mv = new ModelAndView("aluno");
        AlunoDTO alunoDTO = new AlunoDTO();

        mv.addObject("alunoDTO", alunoDTO);

        return mv;
    }

    @PostMapping(value = "/aluno")
    public String saveAluno(AlunoDTO aluno) throws TurmaNotFoundException {

        Aluno newAluno = alunoDTOService.mapAluno(aluno);

        alunoService.save(newAluno);

        return "redirect:/aluno";
    }

    @GetMapping("/deleteAluno/{id}")
    public String deleteAluno(@PathVariable (value = "id") int id, Model model) {

        //this.alunoService.remove(id);

        return "redirect:/aluno";
    }
}

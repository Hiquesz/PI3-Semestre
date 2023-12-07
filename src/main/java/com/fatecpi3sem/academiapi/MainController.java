package com.fatecpi3sem.academiapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fatecpi3sem.academiapi.academia.Academia;

@Controller 
@RequestMapping(path="/")
public class MainController {
	@GetMapping("/")
	public String academiaForm(Model model) {
		//model.addAttribute("academia", new Academia());
		return "index";
	}
//  @PostMapping(path="/add") // Map ONLY POST Requests
//  public @ResponseBody String addNewAluno (@RequestParam String nome
//      , @RequestParam String cpf) {
//    Aluno n = new Aluno();
//    n.setNome(nome);
//    n.setCpf(cpf);
//    alunoRepository.save(n);
//    return "Saved";
//  }

}

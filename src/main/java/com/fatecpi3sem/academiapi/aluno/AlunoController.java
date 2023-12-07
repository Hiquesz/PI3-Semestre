package com.fatecpi3sem.academiapi.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fatecpi3sem.academiapi.aluno.*;

@Controller
@RequestMapping(path="/aluno")
public class AlunoController {
	  @Autowired 
	  private AlunoRepository alunoRepository;
	//@GetMapping("/academia")
	//public String academia(@RequestParam(name="name", required=false, defaultValue="Monstro") String name, Model model) {
	//	model.addAttribute("name", name);
	//	return "academia";
	//}
	
//	@GetMapping("/")
//	public String academiaForm(Model model) {
//		model.addAttribute("aluno", new Aluno());
//		return "aluno";
//	}
	
//	@PostMapping("/aluno")
//	public String academiaSubmit(@ModelAttribute Aluno aluno, Model model) {
//		model.addAttribute("aluno", aluno);
//		return "resultalun";
//	}
  @PostMapping(path="/add") // Map ONLY POST Requests
  public @ResponseBody String addNewAluno (@RequestParam String nome, @RequestParam String cpf) {
    Aluno n = new Aluno();
    n.setNome(nome);
    n.setCpf(cpf);
    alunoRepository.save(n);
    return "Saved";
  }
  @GetMapping(path="/all")
  public @ResponseBody Iterable<Aluno> getAllAlunos() {
    // This returns a JSON or XML with the users
    return alunoRepository.findAll();
  }
	
}

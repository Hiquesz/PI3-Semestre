package com.fatecpi3sem.academiapi.academia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/academia")
public class AcademiaController {
	  @Autowired 
	  private AcademiaRepository academiaRepository;

	//@GetMapping("/academia")
	//public String academia(@RequestParam(name="name", required=false, defaultValue="Monstro") String name, Model model) {
	//	model.addAttribute("name", name);
	//	return "academia";
	//}
	
	@GetMapping("/")
	public String academiaForm(Model model) {
		model.addAttribute("academia", new Academia());
		return "academia";
	}
	
	@PostMapping("/")
	public String academiaSubmit(@ModelAttribute Academia academia, Model model) {
		model.addAttribute("academia", academia);		
		return "resultacad";
	}
	  @PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewAcademia (@RequestParam String nome, @RequestParam String endereco) {
	    Academia a = new Academia();
	    a.setNome(nome);
	    a.setEndereco(endereco);
	    academiaRepository.save(a);
	    return "resultacad";
	  }
	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Academia> getAllAcademias() {
		  return academiaRepository.findAll();
	  }
	
}

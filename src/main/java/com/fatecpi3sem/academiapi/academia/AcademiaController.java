package com.fatecpi3sem.academiapi.academia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcademiaController {
	
	//@GetMapping("/academia")
	//public String academia(@RequestParam(name="name", required=false, defaultValue="Monstro") String name, Model model) {
	//	model.addAttribute("name", name);
	//	return "academia";
	//}
	
	@GetMapping("/academia")
	public String academiaForm(Model model) {
		model.addAttribute("academia", new Academia());
		return "academia";
	}
	
	@PostMapping("/academia")
	public String academiaSubmit(@ModelAttribute Academia academia, Model model) {
		model.addAttribute("academia", academia);
		return "result";
	}
	
}

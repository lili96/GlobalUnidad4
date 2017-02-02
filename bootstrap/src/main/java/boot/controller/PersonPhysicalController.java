package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.PersonPhysical;
import boot.service.PersonPhysicalService;



@Controller
public class PersonPhysicalController {
	@Autowired
	private PersonPhysicalService personPhysicalService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-personPhysicals")
	public String allPersonPhysicals(HttpServletRequest request){
		request.setAttribute("personPhysicals",personPhysicalService.findAll());
		request.setAttribute("mode","MODE_PERSONPHYSICALS");
		return "personPhysical";
	}
	
	@GetMapping("/new-personPhysical")
	public String newPersonPhysical(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "personPhysical";
	}
	@PostMapping("/save-personPhysical")
	public String savePersonPhysical(@ModelAttribute PersonPhysical personPhysical,BindingResult bindingResult, HttpServletRequest request){
		personPhysicalService.save(personPhysical);
		request.setAttribute("personPhysicals",personPhysicalService.findAll());
		request.setAttribute("mode","MODE_PERSONPHYSICALS");
		return "personPhysical";
	}
	
	
	@GetMapping("/update-personPhysical")
	public String updatePersonPhysical(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("personPhysical",personPhysicalService.findPersonPhysical(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "personPhysical";
	}
	@GetMapping("/delete-personPhysical")
	public String deletePersonPhysical(@RequestParam int id,HttpServletRequest request){
		personPhysicalService.delete(id);
		request.setAttribute("personPhysicals",personPhysicalService.findAll());
		request.setAttribute("mode","MODE_PERSONPHYSICALS");
		return "personPhysical";
	}

}

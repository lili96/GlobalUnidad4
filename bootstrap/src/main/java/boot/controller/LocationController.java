package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Location;
import boot.service.LocationService;



@Controller
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-locations")
	public String allLocations(HttpServletRequest request){
		request.setAttribute("locations",locationService.findAll());
		request.setAttribute("mode","MODE_LOCATIONS");
		return "location";
	}
	
	@GetMapping("/new-location")
	public String newSLocation(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "location";
	}
	@PostMapping("/save-location")
	public String saveLocation(@ModelAttribute Location location,BindingResult bindingResult, HttpServletRequest request){
		locationService.save(location);
		request.setAttribute("locations",locationService.findAll());
		request.setAttribute("mode","MODE_LOCATIONS");
		return "location";
	}
	
	
	@GetMapping("/update-location")
	public String updateLocation(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("location",locationService.findLocation(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "location";
	}
	@GetMapping("/delete-location")
	public String deleteLocation(@RequestParam int id,HttpServletRequest request){
		locationService.delete(id);
		request.setAttribute("locations",locationService.findAll());
		request.setAttribute("mode","MODE_LOCATIONS");
		return "location";
	}

}

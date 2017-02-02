package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Item;
import boot.service.ItemService;



@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-items")
	public String allItems(HttpServletRequest request){
		request.setAttribute("items",itemService.findAll());
		request.setAttribute("mode","MODE_ITEMS");
		return "item";
	}
	
	@GetMapping("/new-item")
	public String newItem(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "item";
	}
	@PostMapping("/save-item")
	public String saveItem(@ModelAttribute Item item,BindingResult bindingResult, HttpServletRequest request){
		itemService.save(item);
		request.setAttribute("items",itemService.findAll());
		request.setAttribute("mode","MODE_ITEMS");
		return "item";
	}
	
	
	@GetMapping("/update-item")
	public String updateItem(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("item",itemService.findItem(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "item";
	}
	@GetMapping("/delete-item")
	public String deleteItem(@RequestParam int id,HttpServletRequest request){
		itemService.delete(id);
		request.setAttribute("items",itemService.findAll());
		request.setAttribute("mode","MODE_ITEMS");
		return "item";
	}
}

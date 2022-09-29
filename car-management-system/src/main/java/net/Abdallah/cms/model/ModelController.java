package net.Abdallah.cms.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	@GetMapping("/{brandId}/showModels")
	public String showSpeciticModels(Model m, @PathVariable String brandId) {
		List<CarModel> listModels = modelService.getAllModels("1");
		m.addAllAttributes(listModels);
		return "showModels";
	}
	
	@RequestMapping(value = "/showBrands/{brandId}", method = RequestMethod.GET )
	public String showModels(Model model, @PathVariable String brandId) {
		
		
		
		return "redirect:/{brandId}/showModels";
	}
	
	@RequestMapping(value = "/showBrands/{brand}", method = RequestMethod.POST)
	 public String handle(CarModel m, BindingResult result, RedirectAttributes redirectAttrs, @RequestParam String brandId) {
	   if (result.hasErrors()) {
	     return "index";
	   }
	   redirectAttrs.addAttribute("brandId", m.getBrandId()).addFlashAttribute("Message", "success");
	   return "redirect:/showBrands/{brandId}";
	 }

}

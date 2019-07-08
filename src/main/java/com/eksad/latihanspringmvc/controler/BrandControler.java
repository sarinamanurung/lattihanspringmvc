package com.eksad.latihanspringmvc.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eksad.latihanspringmvc.model.Brand;
import com.eksad.latihanspringmvc.repository.BrandRepositoryDao;

@Controller
@RequestMapping("/brand")

public class BrandControler {
	
	@Autowired
	BrandRepositoryDao brandRepositoryDao;

	@RequestMapping("")
	public String Index(Model model) {

		List<Brand> list = brandRepositoryDao.findAll();

		model.addAttribute("listBrand", list);

		return "list";
	}
	
	@RequestMapping("/add")
	public String addBrand(Model model ) {
		
		Brand brand = new Brand();
		
		model.addAttribute("brand", brand);
		
		return "add";
	}
	
	@RequestMapping(value = "/save", method= RequestMethod.POST)
	public String save(@ModelAttribute Brand brand) {
		brandRepositoryDao.save(brand);
				
		return "redirect:/product";
		
	}
	
	@RequestMapping(value = "/delete{id}")
	public String delete(@PathVariable Long id) {
		brandRepositoryDao.deleteById(id);
		return "redirect:/brand";
		
	}
	
	@RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
	public String editbrand(@PathVariable Long id, Model model) {
		Brand brand = brandRepositoryDao.findOne(id);
		return "addbrand";
	}

}

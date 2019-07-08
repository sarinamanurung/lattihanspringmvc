package com.eksad.latihanspringmvc.controler;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eksad.latihanspringmvc.model.Product;
import com.eksad.latihanspringmvc.repository.ProductRepositoryDao;



@Controller
@RequestMapping("/product")

public class ProductControler {
	
	@Autowired
	ProductRepositoryDao productRespositoryDao;
	
	@RequestMapping("")
	public String index(Model model) {
		
		List<Product>list = productRespositoryDao.findAll();
		model.addAttribute("listProduct", list);
		
		
		return "list";
		
	}
	@RequestMapping("/add")
	public String addProduct(Model model) {
		Product product = new Product();
		
		model.addAttribute("product", product);
		
		
		return "add";
		
	}
//	ModelAttribute
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	
	public String save(@ModelAttribute Product product) {
		productRespositoryDao.save(product);
		
		
		return "redirect:/product";
	}

}
	

package com.saifiahmada.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saifiahmada.spring.domain.Barang;
import com.saifiahmada.spring.service.BarangService;

@Controller
@RequestMapping(value = "/barang")
public class BarangController {
	
	@Autowired
	private BarangService barangService;
	
	@ModelAttribute("barang")
	public Barang getBarang(){
		return new Barang();
	}
	
	@RequestMapping(value = "/form" , method=RequestMethod.GET)
	public String form() {
		return "barangForm";
	}
	
	@RequestMapping(value = "/simpan" , method=RequestMethod.POST)
	public String simpan(@ModelAttribute("barang") Barang barang){
		barangService.save(barang); 
		return "redirect:/barang/form.html?success=true";
	}
	
	@RequestMapping(value="/list" , method=RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("barangs", barangService.findAll());
		return "barangList";
	}

}

package com.saifiahmada.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saifiahmada.spring.domain.Barang;
import com.saifiahmada.spring.repository.BarangRepository;

@Service
public class BarangService {
	
	@Autowired
	private BarangRepository barangRepository;
	
	public void save(Barang barang){
		barangRepository.save(barang);
	}
	
	public List<Barang> findAll() {
		return barangRepository.findAll();
	}

}

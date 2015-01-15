package com.saifiahmada.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saifiahmada.spring.domain.Barang;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Long> { 

}

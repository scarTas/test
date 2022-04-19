package com.capo.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capo.model.Contatto;
@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario","Rossi","marioz"));
		lista.add(new Contatto("Anna","Verdi","annaz"));
		lista.add(new Contatto("Luigi","Bianchi","luiggi"));
		return lista;
	}
}

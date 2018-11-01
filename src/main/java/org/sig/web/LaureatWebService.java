package org.sig.web;

import java.util.*;

import org.sig.Entity.Laureat;
import org.sig.dao.LaureatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class LaureatWebService {
	@Autowired
	private LaureatRepository laureatRepository;
	@RequestMapping(value="/laureats",method=RequestMethod.GET)
	public List<Laureat> getLaureat(){
		return laureatRepository.findAll();
	} 
	@RequestMapping(value="/laureats/{id}",method=RequestMethod.GET)
	public Laureat getLaureat(@PathVariable Long id){
		return laureatRepository.findOne(id);
	}
	@RequestMapping(value="/laureats",method=RequestMethod.POST)
	public Laureat save(@RequestBody Laureat l){
		return laureatRepository.save(l);
	}
	@RequestMapping(value="/laureats/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		laureatRepository.delete(id);
		return true;
	}
	@RequestMapping(value="/laureats/{id}",method=RequestMethod.PUT)
	public Laureat save(@PathVariable Long id,@RequestBody Laureat l){
		l.setId(id);
		return laureatRepository.save(l);
	}
	
	@RequestMapping(value="/chercherLaureats",method=RequestMethod.GET)
	public Page<Laureat> chercher(
			@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size)
	{
		return laureatRepository.chercher("%"+mc+"%",new PageRequest(page,size));
	} 
	 
}

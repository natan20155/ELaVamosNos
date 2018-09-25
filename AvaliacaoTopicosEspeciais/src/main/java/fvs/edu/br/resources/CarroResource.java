package fvs.edu.br.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fvs.edu.br.domain.Carro;
import fvs.edu.br.services.CarroService;

@RestController
@RequestMapping("/carros")
public class CarroResource {

	@Autowired
	private CarroService serv;
	
	@RequestMapping(value= {"/id"}, method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		
		Carro carro = serv.buscar(id);
		
		return ResponseEntity.ok().body(carro);
	}
	
	
}

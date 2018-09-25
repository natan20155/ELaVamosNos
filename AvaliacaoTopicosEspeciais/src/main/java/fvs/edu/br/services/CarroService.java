package fvs.edu.br.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fvs.edu.br.domain.Carro;
import fvs.edu.br.repositories.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository repo;
	
	public Carro buscar(Integer id){
		Optional<Carro> gol = repo.findById(id);
		return gol.orElse(null);
	}
}

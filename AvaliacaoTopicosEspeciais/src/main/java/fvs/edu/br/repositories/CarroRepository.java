package fvs.edu.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fvs.edu.br.domain.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>  {

}

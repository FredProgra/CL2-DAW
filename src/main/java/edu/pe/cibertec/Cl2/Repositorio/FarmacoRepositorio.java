package edu.pe.cibertec.Cl2.Repositorio;

import edu.pe.cibertec.Cl2.Model.Farmaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmacoRepositorio extends JpaRepository<Farmaco,Integer> {
}

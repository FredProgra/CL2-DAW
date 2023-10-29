package edu.pe.cibertec.Cl2.Service;

import edu.pe.cibertec.Cl2.Model.Farmaco;
import edu.pe.cibertec.Cl2.Repositorio.FarmacoRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
@AllArgsConstructor

public class FarmacoService {
  private   FarmacoRepositorio farmacoRepositorio;
    public List<Farmaco> listarFarmaco(){
        return  farmacoRepositorio.findAll();
    }
    public  boolean registrarFarmaco(Farmaco farmaco){
        return farmacoRepositorio.save(farmaco)!=null;
    }
    public  void eliminar(Integer id){
        farmacoRepositorio.deleteById(id);
    }


}

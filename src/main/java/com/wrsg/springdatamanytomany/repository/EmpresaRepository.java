package com.wrsg.springdatamanytomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wrsg.springdatamanytomany.entity.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

    @Query("SELECT e FROM Empresa e JOIN FETCH e.funcionarios ")
    List<Empresa> listarEmpresasComFuncionarios();
}
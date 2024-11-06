package com.wrsg.springdatamanytomany.repository;

import org.springframework.data.repository.CrudRepository;

import com.wrsg.springdatamanytomany.entity.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
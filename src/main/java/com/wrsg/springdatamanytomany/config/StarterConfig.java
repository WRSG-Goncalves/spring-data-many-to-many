package com.wrsg.springdatamanytomany.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wrsg.springdatamanytomany.entity.Empresa;
import com.wrsg.springdatamanytomany.entity.Funcionario;
import com.wrsg.springdatamanytomany.repository.EmpresaRepository;

@Configuration
public class StarterConfig {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Bean
    public void start() {
        Iterable<Empresa> empresas = empresaRepository.findAll();

        if (!empresas.iterator().hasNext()) {
            empresaRepository.save(criarEmpresa());
        }
    }

    private Funcionario criarFuncionario() {
        return Funcionario.builder()
                .cpf("001.112.223-32")
                .nome("Matheus")
                .build();
    }

    private Empresa criarEmpresa() {
        return Empresa.builder()
                .nome("SPAL INDUSTRIA BRASILEIRA DE BEBIDAS S/A - COCA COLA FEMSA")
                .cnpj("61.186.888/0093-01")
                .funcionarios(Collections.singletonList(criarFuncionario()))
                .build();
    }
}
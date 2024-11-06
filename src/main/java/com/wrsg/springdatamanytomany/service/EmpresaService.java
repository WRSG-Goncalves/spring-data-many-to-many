package com.wrsg.springdatamanytomany.service;

import static com.wrsg.springdatamanytomany.mapper.EmpresaMapper.INSTANCE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wrsg.springdatamanytomany.dto.EmpresaComFuncionarioResponse;
import com.wrsg.springdatamanytomany.dto.EmpresaResponse;
import com.wrsg.springdatamanytomany.entity.Empresa;
import com.wrsg.springdatamanytomany.repository.EmpresaRepository;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<EmpresaComFuncionarioResponse> listarEmpresasComFuncionarios() {
        return INSTANCE.listEmpresaComFuncionarioResponse(empresaRepository.listarEmpresasComFuncionarios());
    }

    public List<EmpresaResponse> listarTodos() {
        return INSTANCE.listEmpresaResponse((List<Empresa>) empresaRepository.findAll());
    }
}
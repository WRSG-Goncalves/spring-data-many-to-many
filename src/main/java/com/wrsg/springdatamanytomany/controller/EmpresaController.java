package com.wrsg.springdatamanytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wrsg.springdatamanytomany.dto.EmpresaComFuncionarioResponse;
import com.wrsg.springdatamanytomany.dto.EmpresaResponse;
import com.wrsg.springdatamanytomany.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/com-funcionarios")
    public ResponseEntity<List<EmpresaComFuncionarioResponse>> listarEmpresasComFuncionarios() {
        return ResponseEntity.ok(empresaService.listarEmpresasComFuncionarios());
    }

    @GetMapping
    public ResponseEntity<List<EmpresaResponse>> listarTodos() {
        return ResponseEntity.ok(empresaService.listarTodos());
    }
}
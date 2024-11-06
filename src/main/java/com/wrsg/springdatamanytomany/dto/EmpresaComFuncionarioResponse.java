package com.wrsg.springdatamanytomany.dto;

import java.util.List;

import com.wrsg.springdatamanytomany.entity.Funcionario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class EmpresaComFuncionarioResponse extends EmpresaResponse {

    private List<Funcionario> funcionarios;
}
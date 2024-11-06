package com.wrsg.springdatamanytomany.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.wrsg.springdatamanytomany.dto.EmpresaComFuncionarioResponse;
import com.wrsg.springdatamanytomany.dto.EmpresaResponse;
import com.wrsg.springdatamanytomany.entity.Empresa;

@Mapper
public interface EmpresaMapper {

    EmpresaMapper INSTANCE = Mappers.getMapper(EmpresaMapper.class);

    List<EmpresaResponse> listEmpresaResponse(List<Empresa> empresas);

    List<EmpresaComFuncionarioResponse> listEmpresaComFuncionarioResponse(List<Empresa> empresas);
}
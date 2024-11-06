package com.wrsg.springdatamanytomany.entity;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cnpj;

    @JsonManagedReference
    @Cascade(CascadeType.ALL)
    @ManyToMany
    @JoinTable(
            name = "EMPRESA_FUNCIONARIO",
            joinColumns = @JoinColumn(name = "EMPRESA_ID"),
            inverseJoinColumns = @JoinColumn(name = "FUNCIONARIO_ID")
    )
    private List<Funcionario> funcionarios;
}
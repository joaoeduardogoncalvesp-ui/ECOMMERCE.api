package com.ecommerce.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = false, unique = true, length = 14)
    private String cpf;
    
    @Column(nullable = false, unique = true, length = 100)
    private String email;
    
    @Column(length = 15)
    private String telefone;
    
    @Column(length = 200)
    private String endereco;
    
    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;
    
    @Column(nullable = false)
    private Boolean ativo = true;
    
    public Cliente() {
        this.dataCadastro = LocalDateTime.now();
    }
    
    // Getters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }
    public LocalDateTime getDataCadastro() { return dataCadastro; }
    public Boolean getAtivo() { return ativo; }
    
    // Setters
    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setDataCadastro(LocalDateTime dataCadastro) { this.dataCadastro = dataCadastro; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
}
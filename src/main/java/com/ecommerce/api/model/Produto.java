package com.ecommerce.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "produtos")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String descricao;
    private Double preco;
    private Integer qtdEstoque;
    private String categoria;
    private Boolean ativo;
    private LocalDateTime dataCadastro;
    
    public Produto() {
        this.ativo = true;
        this.dataCadastro = LocalDateTime.now();
    }
    
    // Getters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public Double getPreco() { return preco; }
    public Integer getQtdEstoque() { return qtdEstoque; }
    public String getCategoria() { return categoria; }
    public Boolean getAtivo() { return ativo; }
    public LocalDateTime getDataCadastro() { return dataCadastro; }
    
    // Setters
    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setPreco(Double preco) { this.preco = preco; }
    public void setQtdEstoque(Integer qtdEstoque) { this.qtdEstoque = qtdEstoque; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }
    public void setDataCadastro(LocalDateTime dataCadastro) { this.dataCadastro = dataCadastro; }
}

package com.ecommerce.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "cliente_id", nullable = false)
    private Long clienteId;
    
    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;
    
    @Column(name = "valor_total")
    private Double valorTotal;
    
    @Column(length = 50)
    private String status; // PENDENTE, PAGO, ENVIADO, ENTREGUE, CANCELADO
    
    @Column(name = "forma_pagamento", length = 50)
    private String formaPagamento; // CARTAO, BOLETO, PIX
    
    @Column(length = 500)
    private String observacao;
    
    public Pedido() {
        this.dataPedido = LocalDateTime.now();
        this.status = "PENDENTE";
        this.valorTotal = 0.0;
    }
    
    // Getters
    public Long getId() { return id; }
    public Long getClienteId() { return clienteId; }
    public LocalDateTime getDataPedido() { return dataPedido; }
    public Double getValorTotal() { return valorTotal; }
    public String getStatus() { return status; }
    public String getFormaPagamento() { return formaPagamento; }
    public String getObservacao() { return observacao; }
    
    // Setters
    public void setId(Long id) { this.id = id; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }
    public void setDataPedido(LocalDateTime dataPedido) { this.dataPedido = dataPedido; }
    public void setValorTotal(Double valorTotal) { this.valorTotal = valorTotal; }
    public void setStatus(String status) { this.status = status; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
}

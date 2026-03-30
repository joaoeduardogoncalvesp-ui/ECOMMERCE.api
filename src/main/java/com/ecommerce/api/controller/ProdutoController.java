package com.ecommerce.api.controller;

import com.ecommerce.api.model.Produto;
import com.ecommerce.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Produto consultar(@PathVariable Long id) {
        return produtoRepository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Produto incluir(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
    
    @PutMapping("/{id}")
    public Produto alterar(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return produtoRepository.save(produto);
    }
    
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }
}
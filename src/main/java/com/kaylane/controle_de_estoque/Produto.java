/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaylane.controle_de_estoque;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devsys-b
 */
public class Produto {
    public int id;
    public String descricao;
    public double qtd;
    public double valor;
    
    List<Movimento> listaMovtos;
    
    public Produto() {
        listaMovtos = new ArrayList<Movimento>();
    }
    
    public Produto (int id, String descricao, double qtd, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.qtd = qtd;
        this.valor = valor;
        listaMovtos = new ArrayList<Movimento>();
    }
    
    // ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    //Descricao
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //Quantidade
    public double getQtd() {
        return qtd;
    }
    public void setQtd(double qtd) {
        this.qtd = qtd;
    }
    
    //Valor Unitário
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getTotal() {
        return this.qtd * this.valor;
    }
    
    public void atualizaSaldo(double valor) {
        this.qtd = this.qtd + valor;
    }
    
    public void addMovto(Movimento m) {
        this.listaMovtos.add(m);
        this.atualizaSaldo(m.getQdtMovto());
    }
    
}

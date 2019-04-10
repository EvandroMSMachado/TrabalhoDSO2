/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.Entidades;

import br.com.ufsc.ine5612.Controladores.ControladorProduto;

/**
 *
 * @author Alexandre
 */
public class Produto {

    protected String nome;
    protected float preco;
    protected int codigo;
    protected int quantidade;
    protected ControladorProduto owner;

    public Produto(String nome, float preco, int codigo, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ControladorProduto getOwner() {
        return owner;
    }

    public void setOwner(ControladorProduto owner) {
        this.owner = owner;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDeProdutos;

/**
 *
 * @author Alexandre
 */
public class Produto {

    protected String nome;
    protected float preco;
    protected int codigo;
    //protected int quantidade;
    protected ControladorProduto owner;

    public Produto(String nome, float preco, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
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

    public ControladorProduto getOwner() {
        return owner;
    }

    public void setOwner(ControladorProduto owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + ", codigo=" + codigo + ", owner=" + owner + '}';
    }


}

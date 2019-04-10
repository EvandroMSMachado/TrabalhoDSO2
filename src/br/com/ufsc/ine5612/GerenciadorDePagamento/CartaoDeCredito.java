/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDePagamento;

/**
 *
 * @author Alexandre
 */
public class CartaoDeCredito {

    protected long numero;
    protected ControladorCartaoDeCredito owner;

    public CartaoDeCredito(ControladorCartaoDeCredito owner) {
        this.owner = owner;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public ControladorCartaoDeCredito getOwner() {
        return owner;
    }

    public void setOwner(ControladorCartaoDeCredito owner) {
        this.owner = owner;
    }
    
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDeCompras;

import java.util.Date;

/**
 *
 * @author Alexandre
 */
public class NotaFiscal {

    protected Date data;
    protected int numero;
    protected Pedido pedido;
    protected ControladorNotaFiscal owner;

    public NotaFiscal(Date data, int numero, Pedido pedido, ControladorNotaFiscal owner) {
        this.data = data;
        this.numero = numero;
        this.pedido = pedido;
        this.owner = owner;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ControladorNotaFiscal getOwner() {
        return owner;
    }

    public void setOwner(ControladorNotaFiscal owner) {
        this.owner = owner;
    }
    
    

}

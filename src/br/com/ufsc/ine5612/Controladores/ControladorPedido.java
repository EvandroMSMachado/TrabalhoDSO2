/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.Controladores;

import br.com.ufsc.ine5612.Interface.TelaCompra;

/**
 *
 * @author Alexandre
 */
public class ControladorPedido {

    protected ControladorPrincipal owner;
    protected TelaCompra telaCompra;

    public ControladorPedido(ControladorPrincipal owner) {
        this.owner = owner;
        this.telaCompra = new TelaCompra();

    }

    public ControladorPrincipal getOwner() {
        return owner;
    }

    public TelaCompra getTelaCompra() {
        return telaCompra;
    }

}

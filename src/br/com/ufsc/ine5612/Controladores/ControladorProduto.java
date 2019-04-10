/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.Controladores;

import br.com.ufsc.ine5612.Entidades.Produto;

/**
 *
 * @author Alexandre
 */
public class ControladorProduto {

    protected ControladorPrincipal owner;
    protected Produto produto;

    public ControladorProduto(ControladorPrincipal owner) {
        this.owner = owner;
    }

}

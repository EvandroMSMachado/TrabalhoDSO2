/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.Controladores;

import br.com.ufsc.ine5612.Entidades.Funcionario;
import br.com.ufsc.ine5612.Interface.TelaCancelaCompra;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class ControladorFuncionario {

    protected ControladorPrincipal owner;
    protected TelaCancelaCompra telaCancelaCompra;
    protected Funcionario funcionario;
    protected ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public ControladorFuncionario(ControladorPrincipal owner) {
        this.owner = owner;
        this.telaCancelaCompra = new TelaCancelaCompra();
        addFuncionarios();
    }

    public ControladorPrincipal getOwner() {
        return owner;
    }

    public TelaCancelaCompra getTelaCancelaCompra() {
        return telaCancelaCompra;
    }

    public boolean confereFuncionario(int senha) {
        for (Funcionario func : funcionarios) {
            if (func.getSenha() == senha) {
                return true;
            }
        }
        return false;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void addFuncionarios() {
        Funcionario funcionario1 = new Funcionario("Funcionario", 123);
        Funcionario funcionario2 = new Funcionario("Funcionario2", 1234);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

    }
}

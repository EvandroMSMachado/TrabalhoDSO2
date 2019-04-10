/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufsc.ine5612.GerenciadorDeCompras;

import br.com.ufsc.ine5612.Controladores.ControladorPrincipal;
import br.com.ufsc.ine5612.GerenciadorDeProdutos.Produto;
import br.com.ufsc.ine5612.Interface.TelaCancelaCompra;
import br.com.ufsc.ine5612.Interface.TelaCompra;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Alexandre
 */
public class ControladorPedido {

    protected ControladorPrincipal owner;
    protected ArrayList<Produto> produtos = new ArrayList<Produto>();
    protected TelaCompra telaCompra;
    protected TelaCancelaCompra telaCancelaCompra;

    public ControladorPedido(ControladorPrincipal owner) {
        this.owner = owner;
        this.telaCompra = new TelaCompra();
        this.telaCancelaCompra = new TelaCancelaCompra();
        addProdutos();
    }

    public ControladorPrincipal getOwner() {
        return owner;
    }

    public TelaCompra getTelaCompra() {
        return telaCompra;
    }

    public Produto encontrarProduto(final int codigo) {
        Optional<Produto> optional = produtos.stream().filter((elemento) -> elemento.getCodigo() == codigo).findAny();
        if (optional.isPresent()) {
            this.getTelaCompra().adicionaProduto(optional.get());
            this.getTelaCompra().setCampo_jTextField1("");
            return optional.get();
        } else {
            this.getTelaCompra().showProdutoNaoEncontrado();

        }

//        for (Produto produto : produtos) {
//            if (produto.getCodigo() == codigo) {
//                return produto;
//            }
//        }
        //System.out.println(codigo);
        //System.out.println(produtos);
        //JOptionPane.showMessageDialog(null, "Produto não encontrado");
        return null;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public TelaCancelaCompra getTelaCancelaCompra() {
        return telaCancelaCompra;
    }
    
    public void addProdutos() {
        Produto produto1 = new Produto("Sabão1", 3.50F, 111);
        Produto produto2 = new Produto("Sabão2", 3.50F, 222);
        Produto produto3 = new Produto("Sabão3", 3.50F, 333);
        Produto produto4 = new Produto("Sabão4", 3.50F, 444);
        Produto produto5 = new Produto("Sabão5", 3.50F, 555);
        
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
    }

}

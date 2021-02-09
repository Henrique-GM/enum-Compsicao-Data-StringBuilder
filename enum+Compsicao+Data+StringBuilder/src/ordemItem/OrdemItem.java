/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordemItem;

import produto.Produto;

/**
 *
 * @author Henrique
 */
public class OrdemItem {
    
    private Integer quantidade;
    private Double preco;  
    
    private Produto produto;
    
    public OrdemItem() {       
    }

    public OrdemItem(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public Double subTotal() {           
       return preco * quantidade; 
    }

    @Override
    public String toString() {
        return getProduto().getNome()
                + (", $")
                + String.format("%.2f", preco)
                + ", Quantidade: "
                + quantidade
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
    
    
}

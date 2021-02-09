/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordem;

import cliente.Cliente;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ordemEstatus.Enum.OrdemEstatus;
import ordemItem.OrdemItem;
/**
 *
 * @author Henrique
 */
public class Ordem {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
    
    private Date momento;
    private OrdemEstatus Status;
    
    private Cliente cliente;
    private List<OrdemItem> itens = new ArrayList<>();

    public Ordem() {       
    }
    
    public Ordem(Date momento, OrdemEstatus Status, Cliente cliente) {
        this.momento = momento;
        this.Status = Status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrdemEstatus getStatus() {
        return Status;
    }

    public void setStatus(OrdemEstatus Status) {
        this.Status = Status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void AdicionarItem(OrdemItem item) {
        itens.add(item);
    }
    
    public void RemoverItem(OrdemItem item) {
        itens.remove(item);
    }
    
    public Double total() {
        double soma = 0;
        for (OrdemItem OI : itens) {
            soma += OI.subTotal();
        }
        
        return soma;
    }
    
    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ordem momento: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Ordem estatus: ");
		sb.append(Status + "\n");
		sb.append("cliente: ");
		sb.append(cliente + "\n");
		sb.append("Ordem itens:\n");
		for (OrdemItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
    
}

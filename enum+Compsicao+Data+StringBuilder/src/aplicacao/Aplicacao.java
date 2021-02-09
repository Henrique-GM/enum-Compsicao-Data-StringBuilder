/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import cliente.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import ordem.Ordem;
import ordemEstatus.Enum.OrdemEstatus;
import ordemItem.OrdemItem;
import produto.Produto;
/**
 *
 * @author Henrique
 */
public class Aplicacao {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
              
        System.out.println("Entre com os dados dos clientes: ");	
        System.out.print("Nome: ");
	String nome = sc.nextLine();
	System.out.print("Email: ");
	String email = sc.next();
	System.out.print("Data de aniversário (DD/MM/YYYY): ");
	Date dataAniversario = sdf.parse(sc.next());
        
        Cliente cliente = new Cliente(nome, email, dataAniversario);
        
        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        OrdemEstatus estatus = OrdemEstatus.valueOf(sc.next());
        
        Ordem ordem = new Ordem(new Date(), estatus, cliente);
        
        System.out.println("Quantos itens o pedido vai ter? ");
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println("Entre com o # " + (i + 1) + " dado");
            System.out.print("Nome produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            
            System.out.print("preço produto: ");
            Double precoProduto = sc.nextDouble();
            
            System.out.print("Quantidade: ");
            Integer quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);            
            
            OrdemItem ordemItem = new OrdemItem(quantidade, precoProduto, produto);            
            
            ordem.AdicionarItem(ordemItem);
        }
        
        System.out.println();
        System.out.println(ordem);
        
        sc.close();
    }
}

package Terceira;

import java.util.ArrayList;
import java.util.Collections;

public class ListadeCompras {
	private static final ListadeCompras LISTA = new ListadeCompras();
	public static ListadeCompras getLista() {
		return LISTA;
		}//Retorna a lista
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void addLista(Produto produto) {
		produtos.add(produto);
	}
	
	//Ordena pelo preço
	public void ordenacao() {
		Collections.sort (produtos);
	}
	//Printa a lista
	public void exibir() {
		for (Produto produto : produtos) {
			System.out.println("Item: "+produto.getItem()+"  Preço: "+produto.getPreco());
		}
	}
}

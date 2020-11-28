package Terceira;
public class App {
	public static void main(String[] args) {
		ListadeCompras lista = ListadeCompras.getLista();
		lista.addLista(new Item("Samsung Smartphone",800));
		lista.addLista(new Item("Secador Polyshop",250));
		lista.addLista(new Item("TV 50' LG",5000));
		lista.addLista(new Item("Microondas",500));
		lista.addLista(new Item("Arcondicionas 8000 BTUS",6000));
		
		lista.ordenacao();
		lista.exibir();
	}
}

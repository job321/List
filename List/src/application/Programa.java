package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		// List não aceita tipos primitivos
		// ArrayList é uma classe que implementa a interface
		//List é uma interface
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("joao");
		list.add("jose");
		list.add(1, "Ana"); // adiciona o elemento na posição
		list.add("Marcia");
		list.add("Bob");
		list.add("Abia");
		
		 // para ver o tamanho da lista
		System.out.println(list.size());
		//foreach
		for (String x : list) {
			System.out.println(x);	
		}
		System.out.println("---------------------------");
		
		// remove por posição ou comparação
		list.remove(0);  
		list.remove("joao");
		
		//remover por predicado
		list.removeIf(x -> x.charAt(0) == 'M'); //função lambda
		for (String x : list) {
			System.out.println(x);	
			}
		System.out.println("---------------------------");
		
		//informa a posição de Bob
		System.out.println("Index of Bob:" + list.indexOf("Bob"));
		
		System.out.println("---------------------------");
		
		
		//modo para filtrar strings que começam com a char'' escolhida
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);	
			}
		// enconta o primeiro da lista
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}

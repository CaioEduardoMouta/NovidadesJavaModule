package br.com.alura.factorymethod;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	public static void main(String[] args) {
		
		List<String> nomes = List.of("Primeiro Nome", "Segundo Nome");
		Set.of("terceiroNome");
		Map.of("nome","João");
		System.out.println(nomes);
		
//		ArrayList<String> nomes = new ArrayList<>();
//		nomes.add("primeiroNome");
//		nomes.add("segundoNome");
//		nomes.add("terceiroNome");
//		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
//		System.out.println(nomesImutavel);
	}
}

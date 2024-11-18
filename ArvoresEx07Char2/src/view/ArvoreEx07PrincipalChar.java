package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar;

public class ArvoreEx07PrincipalChar {

	public static void main (String[] args) {
		
		String[] vetor = {"k", "d", "m", "b", "f", "l", "t", "c", "p", "z", "r"};
		int tamanho = vetor.length;
		
		ArvoreChar arvorechar = new ArvoreChar();
		
		for (int i = 0; i < tamanho; i++ ) {
			arvorechar.insert(vetor[i].charAt(0));
		}
		
		arvorechar.remove("m".charAt(0));
		
		try {
			arvorechar.prefixSearch();
			System.out.println();
			arvorechar.infixSearch();
			System.out.println();
			arvorechar.postfixSearch();
			System.out.println();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		arvorechar.search("r".charAt(0));
		
	}
	
}

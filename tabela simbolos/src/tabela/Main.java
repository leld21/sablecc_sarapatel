package tabela;
import tabela.TSimbolo;
import tabela.Simbolo;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args)
	 {
		TSimbolo Tsimbolo = new TSimbolo();
		HashMap novoescopo = new HashMap();
		Tsimbolo.tabela.push(novoescopo);
		
		Tsimbolo.inserir("teste", "inteiro");
		Tsimbolo.inserir("teste2", "cacaca");
		
		HashMap escopodois = new HashMap();
		
		Tsimbolo.tabela.push(escopodois);
		
		Tsimbolo.inserir("teste3", "inteiro3");
		
		HashMap escopotres = new HashMap();
		Tsimbolo.tabela.push(escopotres);
		
		Tsimbolo.inserir("teste3", "cadeia3");
		
		System.out.println(Tsimbolo.tabela);
		System.out.println(Tsimbolo.buscar("teste3").getTipo());
		Tsimbolo.remover();
		System.out.println(Tsimbolo.buscar("teste3").getTipo());
	 }
}

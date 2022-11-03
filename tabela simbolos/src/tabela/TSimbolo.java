package tabela;
import tabela.Simbolo;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Iterator;


public class TSimbolo {
	final Integer SIZE = 256;
	LinkedList<HashMap<Integer, Simbolo>> tabela = new LinkedList<HashMap<Integer, Simbolo>>();
	
	public int hash(String key)
	{
		int ac = 0;
		for (char c : key.toCharArray())
		{
			ac = (ac * 16 + c) % SIZE;
		}
		return ac;
	}
	
	public HashMap<Integer, Simbolo> remover () {
		if(tabela.size()>1) {
			return tabela.pop();
		}
		
		return null;
		
	}
	
	public Simbolo buscar (String id) {
		for(int i=0;i<tabela.size();i++) {
			if(tabela.get(i).containsKey(hash(id))) {
				return tabela.get(i).get(hash(id));
			};
		}
		
		return null;
	}
	
	public boolean inserir (String id, String tipo) {
		Simbolo sim = new Simbolo(id,tipo);
		Integer key = hash(id);
		if(!tabela.getFirst().containsKey(key)) {
			tabela.getFirst().put(key,sim);
			return true;
		}
		return false;
		
	}
	
	
}

package predictive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Backup {
	public static Set<String> signatureToWords(String signature){
		Map<String, ArrayList> hash_map2 = new HashMap();
		ArrayList <String> a = new ArrayList();
		ArrayList <String> d = new ArrayList();
		ArrayList <String> g = new ArrayList();
		ArrayList <String> j = new ArrayList();
		ArrayList <String> m = new ArrayList();
		ArrayList <String> p = new ArrayList();
		ArrayList <String> t = new ArrayList();
		ArrayList <String> w = new ArrayList();
		ArrayList <String> z = new ArrayList();
		a.add("a");
		a.add("b");
		a.add("c");
		d.add("d");
		d.add("e");
		d.add("f");
		g.add("g");
		g.add("h");
		g.add("i");
		j.add("j");
		j.add("k");
		j.add("l");
		m.add("m");
		m.add("n");
		m.add("o");
		p.add("p");
		p.add("q");
		p.add("r");
		p.add("s");
		t.add("t");
		t.add("u");
		t.add("v");
		w.add("w");
		w.add("x");
		w.add("y");
		w.add("z");
		z.add(" ");
		hash_map2.put("2", a);
		hash_map2.put("3", d);
		hash_map2.put("4", g);
		hash_map2.put("5", j);
		hash_map2.put("6", m);
		hash_map2.put("7", p);
		hash_map2.put("8", t);
		hash_map2.put("9", w);
		hash_map2.put("0", z);
		
		ArrayList <String> Book = new ArrayList();
		Book.add("home");
		Book.add("pin");
		Book.add("bin");
		Book.add("tin");
		Book.add("lake");
		
		
		HashSet<String> Words = new HashSet();
		
		for(int title=0; title<5; title++) {
			boolean checklength = true;
			if(Book.get(title).length()!= signature.length()) {
				 checklength =  false;
			}
			else {
		for(int i=0; i<signature.length(); i++) {
    		ArrayList <String> Group= (hash_map2.get(signature.substring(i,i+1)));
    		
    		String currentLetter = Book.get(title).substring(i,i+1);
    		if(!Group.contains(currentLetter)) {
    			checklength= false;	
    		}
    		}
    		}
		if(checklength==true) {
		Words.add(Book.get(title));	
		}
		}
		
		return Words;	
	}
}

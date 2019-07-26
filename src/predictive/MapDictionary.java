/**
 * PART 3 : More Efficiency
 * @author Ahmad_khouli
 * Exercise 1: Implement a new class MapDictionary Dictionary Interface
 */
package predictive;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDictionary implements Dictionary{
	String path;
	private static Map<String, Integer> hash_map1;
	private static TreeMap<String, ArrayList<String>> wordlist;
	/**
	 * Method isValidWord to check whether word is valid
	 * (i.e doesn't contain numbers or symbols)
	 * 
	 */
	static boolean isValidWord(String word) {
		 if(word.matches("[a-zA-Z]+")) {
			 return true;
		 }
		return false;
	}
	/**
	 * The wordToSignature method is the same method used in 
	 * Exercise 1
	 */
	public static String wordToSignature(String word) {
		hash_map1 = new HashMap<>();
		hash_map1.put("a", 2);
		hash_map1.put("b", 2);
		hash_map1.put("c", 2);
		hash_map1.put("d", 3);
		hash_map1.put("e", 3);
		hash_map1.put("f", 3);
		hash_map1.put("g", 4);
		hash_map1.put("h", 4);
		hash_map1.put("i", 4);
		hash_map1.put("j", 5);
		hash_map1.put("k", 5);
		hash_map1.put("l", 5);
		hash_map1.put("m", 6);
		hash_map1.put("n", 6);
		hash_map1.put("o", 6);
		hash_map1.put("p", 7);
		hash_map1.put("q", 7);
		hash_map1.put("r", 7);
		hash_map1.put("s", 7);
		hash_map1.put("t", 8);
		hash_map1.put("u", 8);
		hash_map1.put("v", 8);
		hash_map1.put("w", 9);
		hash_map1.put("x", 9);
		hash_map1.put("y", 9);
		hash_map1.put("z", 9);
		hash_map1.put(" ", 0);
		StringBuffer sig = new StringBuffer();
		for(int i = 0; i < word.length(); i++){
			sig.append(hash_map1.get(word.substring(i, i+1).toLowerCase()));
		}	
		return sig.toString();		
	}
	/**
	 * The constructor takes a String path to the
	 * dictionary and stores the dictionary in a multi-valued Map that maps each signature to set of words.
	 *  Using a Map, data can be retrieved quickly by looking up a signature as in ListDictionary, but
	 *  now it does not require scanning either side of the index as earlier. MapDictionary
	 *  will also allow efficient insertion of new words in the dictionary while still allowing fast
	 *  look-up.
	 */
	public MapDictionary(String path) {
		this.path = path;
		String line = "";
		String linesig = "";	
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
		try {
			Scanner sc = new Scanner(new FileReader(path));
			  wordlist = new TreeMap<>();
			String sig= "";
			boolean checklength = false;
		    while (sc.hasNextLine()) {
		    	ArrayList<String> word = new ArrayList();
		    	 checklength = true;
		    	line = sc.nextLine().toLowerCase();
		    	sig = wordToSignature(line);
		  if(!isValidWord(line)) {
		    		checklength =  false;	 
		    	}
			if(checklength==true) {
				word.add(line);
			if(!wordlist.containsKey(sig)) {

			wordlist.put(sig, word);
			}
			if(wordlist.containsKey(sig)) {
			ArrayList <String> x1=	wordlist.get(sig);
			x1.add(line);
			wordlist.put(sig,x1);
			}					
		    }			
		    }}
			catch(FileNotFoundException e){
				System.out.println("File does not Exist");
			}
	}
	/**
	 * signatureToWords returns in a TreeSet<String> the matching
	 * whole words for the given signature. The character length of each returned word is
	 * the same as the input signature.
	 */
	public Set<String> signatureToWords(String signature) {
		TreeSet<String> Words = new TreeSet();
	    Words.addAll(wordlist.get(signature));
			return  Words;
	}
	public static void main(String[] args) {
String path = "C:\\Users\\Ahmad\\eclipse-workspace\\WS2-3\\src\\predictive\\words.text";
		MapDictionary a = new MapDictionary(path);
		String b = "4663";
		System.out.println(a.signatureToWords(b));
	}
	
}

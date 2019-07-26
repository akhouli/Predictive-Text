/**
 * PART 4 : Prex-matching
 * @author Ahmad_khouli
 * Exercise 1: Implement a new class TreeDictionary
 * 
 * ----		-------------------------------------
 * NOTE :	| The following Class is incomplete |
 * ----		-------------------------------------
 * 
 * 
 */
package predictive;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeDictionary implements Dictionary{
	String path;
	private static Map<String, Integer> hash_map1;
	private TreeDictionary two;
	private TreeDictionary three;
	private TreeDictionary four;
	private TreeDictionary five;
	private TreeDictionary six;
	private TreeDictionary seven;
	private TreeDictionary eight;
	private TreeDictionary nine;
	private String signature;
	private String word;
	
	static boolean isValidWord(String word) {
		 if(word.matches("[a-zA-Z]+")) {
			 return true;
		 }
		return false;
	}

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

	public TreeDictionary getTwo() {
		return two;
	}

	public void setTwo(TreeDictionary two) {
		this.two = two;
	}

	public TreeDictionary getThree() {
		return three;
	}

	public void setThree(TreeDictionary three) {
		this.three = three;
	}

	public TreeDictionary getFour() {
		return four;
	}

	public void setFour(TreeDictionary four) {
		this.four = four;
	}

	public TreeDictionary getFive() {
		return five;
	}

	public void setFive(TreeDictionary five) {
		this.five = five;
	}

	public TreeDictionary getSix() {
		return six;
	}

	public void setSix(TreeDictionary six) {
		this.six = six;
	}

	public TreeDictionary getSeven() {
		return seven;
	}

	public void setSeven(TreeDictionary seven) {
		this.seven = seven;
	}

	public TreeDictionary getEight() {
		return eight;
	}

	public void setEight(TreeDictionary eight) {
		this.eight = eight;
	}
	public TreeDictionary getNine() {
		return nine;
	}

	public void setNine(TreeDictionary nine) {
		this.nine = nine;
	}

	public TreeDictionary(String path) {
		this.path = path;
		this.signature = signature;
		this.word = word;
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
			if(two.equals("2")) {
//
//			two.setnode2(sig);
//			}
//			if(wordlist.containsKey(sig)) {
//			ArrayList <String> x1=	wordlist.get(sig);
//			x1.add(line);
//			wordlist.put(sig,x1);
			}
		    }			
		    }}
			catch(FileNotFoundException e){
				System.out.println("File does not Exist");
			}
	}
	public Set<String> signatureToWords(String signature) {
		TreeSet<String> Words = new TreeSet();
//	    Words.addAll(wordlist.get(signature));
			return  Words;
	}
	public static void main(String[] args) {
String path = "C:\\Users\\Ahmad\\eclipse-workspace\\WS2-3\\src\\predictive\\words.text";
		MapDictionary a = new MapDictionary(path);
		String b = "4663";
		System.out.println(a.signatureToWords(b));
	}
	
}

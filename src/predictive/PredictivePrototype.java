/**
 * PART 1 : ProtoType & Design
 * @author Ahmad_khouli
 * Exercise 1: wordToSignature
 * Exercise 2: signatureToWords 
 */
package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;



public class PredictivePrototype {

	public static Map<String, Integer> hash_map1;
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
	 * 
	 * The method wordToSignature takes a word and returns a numeric signature, accumulating the result character-by-character.
 	 * Using the StringBuffer class rather than String will be more efficient
 	 * and that is because Strings in Java are immutable i.e when you instantiate a new String Object, you can not ever alter it.
 	 * Using StringBuffer is very important for optimization, hence when we are dealing with a huge number of
 	 * string concats we should use StringBuffer to make it faster.
	 */
	public static String wordToSignature(String word) {
		/**
		 * Using a Hashmap to store the values to the corresponding keys
		 * where for ex. number 2 is would be abc and number 3 is def and so on
		 */
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
	 *	The following method takes the given numeric signature that is passed as a String
	 * and returns a set of possible matching words from the dictionary as a HashSet of Strings. 
	 * Although HashSets are non synchronized, they are faster than TreeSets
	 * and are considered an efficient approach for search operations. The returned set
	 * will not have any duplicates, and each word would be in lower-case.
	 * Nonetheless, since we are not storing the dictionary in our Java program, but
	 * instead scanning the dictionary every time, this implementation is inefficient
	 * and requires a lot of time if we are looking up multiple words.
	 * 
	 */
	
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
		HashSet<String> Words = new HashSet();
			try {
				Scanner sc = new Scanner(new File("C:\\Users\\Ahmad\\eclipse-workspace\\WS2-3\\src\\predictive\\words.text"));
				String line;
			    while (sc.hasNextLine()) {
			    	boolean checklength = true;
			    	line = sc.nextLine().toLowerCase();
			    	if(line.length() != signature.length() || !isValidWord(line)) {
			    		checklength =  false;	    	 
			}
			else {
		for(int i=0; i<signature.length(); i++) {
    		ArrayList <String> Group= (hash_map2.get(signature.substring(i,i+1)));
    		String currentLetter = line.substring(i,i+1);
    		if(!Group.contains(currentLetter)) {
    			checklength= false;	
    			}
    		}
    	}
		if(checklength==true) {
		Words.add(line);	
		}
		
			    }
			}
		catch(FileNotFoundException e){
			System.out.println("File does not Exist");
		}
		catch(IOException x) {
			System.out.println("Exception");
		}
		return Words;	
	}
	
	
	
	public static void main(String[] args) {
		PredictivePrototype a = new PredictivePrototype ();
		 String b = new String("Home");
		 String f = "4663";
		 System.out.println(wordToSignature(b));
		 System.out.println(a.signatureToWords(f));
		
	}
}

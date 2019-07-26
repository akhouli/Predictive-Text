/**
 * PART 2 : Storing and Searching a Dictionary
 * @author Ahmad_khouli
 * Exercise 1: ListDictionary implementing Dictionary Interface
 */
package predictive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListDictionary implements Dictionary {
	ArrayList <WordSig> wordsig;
	String path;
	private static Map<String, Integer> hash_map1;
	/**
	 * 
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
	 * The constructor for ListDictionary takes a String path to the
	 * dictionary, reads and stores it in an ArrayList. Each entry of the ArrayList is
	 * is a pairing of the word that has been read in and its signature. This uses the Help of Class
	 * WordSig that pairs words and signatures.
	 */
	public ListDictionary(String path) {
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
			String sig= "";
			boolean checklength = false;
			wordsig = new ArrayList <WordSig>();
		    while (sc.hasNextLine()) {
		    	 checklength = true;
		    	line = sc.nextLine().toLowerCase();
		    	if(!isValidWord(line)) {
		    		checklength =  false;	 
		    	}
			if(checklength==true) {	
			WordSig l1 = new WordSig (line,wordToSignature(line));
			wordsig.add(l1);	

		    }
		    }}
			catch(FileNotFoundException e){
				System.out.println("File does not Exist");
			}
			catch(IOException x) {
				System.out.println("Exception");
		}
	}
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
	 * The signatureToWords method is re-written as an instance method
	 * to use the stored dictionary. The ArrayList<WordSig> is
	 * stored in sorted order using Collections.sort, then the method
	 * uses binary search to perform the look-ups.
	 * I've used TreeSets instead of HashSets as TreeSets are already sorted
	 */
	public Set<String> signatureToWords(String signature) {
		TreeSet<String> Words = new TreeSet();
		Collections.sort(wordsig);
		WordSig wordsig2 = new WordSig(" ", signature);		
		/**
		 * int 'a' and int 'b' would be equal to the index of the first match
		 * 'a' would later be incremented to return all the matching words
		 * that have a higher index, whereas 'b' would be decremented to 
		 * return all the matching words with a lower index
		 */
		int a= Collections.binarySearch(wordsig, wordsig2);
		int b = Collections.binarySearch(wordsig, wordsig2);
	    	while(wordsig.get(a).getSignature().equals(signature)) {
	    	Words.add(wordsig.get(a).getWords());
	    	a++;
	    	 {
	    		 while(wordsig.get(b).getSignature().equals(signature)) {
	    		    	Words.add(wordsig.get(b).getWords());
	    		    	b--; 		 
			}
	    	 }
	    	}
			return  Words;
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String path = "C:\\Users\\Ahmad\\eclipse-workspace\\WS2-3\\src\\predictive\\words.text";
		ListDictionary a = new ListDictionary(path);
		String b = "75328";
		String f = "4663";
		System.out.println(a.signatureToWords(b));
		System.out.println(a.signatureToWords(f));
		long end = System.currentTimeMillis();
		long duration = end -start;
		System.out.println("Time taken:" + duration + "ms.");

		
	}

	

}

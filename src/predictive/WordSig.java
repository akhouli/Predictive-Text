package predictive;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class WordSig implements Comparable<WordSig>{
	private String words;
	private String signature;
	
	
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public WordSig(String words, String signature) {
		this.words= words;
		this.signature=signature;
	}
	@Override
	public String toString() {
		return "Word=" + words + ", Signature=" + signature + "";
	}


	@Override
	public int compareTo(WordSig ws) {
		return (this.signature.compareTo(ws.signature));
	}
	public static void main(String[] args) {
		String a = "4663";
		String b = "home";
		WordSig x = new WordSig(a, b);
		System.out.println(x);
		
//	Collections.sort(words);
	}
	

}

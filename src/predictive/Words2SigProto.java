/**
 * PART 1 : ProtoType & Design
 * @author Ahmad_khouli
 * Exercise 3: wordToSignature CommandLine Program 
 */
package predictive;

public class Words2SigProto {
	
	
	public static void main(String[] args) {
		PredictivePrototype a = new PredictivePrototype();
		for(String w : args) {
			if(a.isValidWord(w)) {
			System.out.println(a.wordToSignature(w));
		}
	}
	

}
}

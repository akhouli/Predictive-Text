/**
 * PART 1 : ProtoType & Design
 * @author Ahmad_khouli
 * Exercise 3: signatureToWords CommandLine Program 
 */
package predictive;

public class Sigs2WordsProto {
	/**
	 * Here we measure the time taken to complete the execution
	 *  Sigs2-WordsProto from start to finish as well as
	 *  The Look up time, i.e after we have scanned the dictionary.
	 *  Results: 
	 *  Time taken for total execution for 4663 and 57: 527ms & 924ms respectively
	 *  Time taken for look up: 526ms & 397ms respectively
	 *  This shows that the following implementation is inefficient as it
	 *  rescans the dictionary every time.
	 * 
	 */
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		PredictivePrototype a = new PredictivePrototype();
		for(String w : args) {
			long mid = System.currentTimeMillis();
			System.out.println(a.signatureToWords(w));
			long end = System.currentTimeMillis();
			long duration = end -start;
			long durationmid = end -mid;
			System.out.println("Time taken:" + duration + "ms.");
			System.out.println("Time taken:" + durationmid + "ms.");
		}
	}
	
}




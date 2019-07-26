/**
 * PART 2 : Storing and Searching a Dictionary
 * @author Ahmad_khouli
 * Exercise 2: Sigs2WordsList CommandLine Program 
 */
package predictive;

public class Sigs2WordsList {
	/**
	 * Here we measure the time taken to complete the execution
	 *  Sigs2WordsList from start to finish as well as
	 *  the Look up time, i.e after we have scanned the dictionary.
	 *  Results: 
	 *  Time taken for total execution for 4663 and 57: 1671ms & 1690ms respectively
	 *  Time taken for look up: 94ms & 19ms respectively
	 *  This shows that the following implementation takes longer than Sigs2Words Proto
	 *  for total execution, however, the lookup time is much more efficient. Where Sigs2Words
	 *  had a look up time of 526ms & 397ms respectively whereas The following implementation
	 *  had a look up time of 94ms & 19ms respectively.
	 * 
	 */
		public static void main(String[] args) {
			long start = System.currentTimeMillis();
			String path = "C:\\Users\\Ahmad\\eclipse-workspace\\WS2-3\\src\\predictive\\words.text";
			ListDictionary a = new ListDictionary(path);
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







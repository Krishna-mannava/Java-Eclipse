import java.util.*;
public class LambdaThread {

	 public static void main(String args[])
	 {
	     Scanner sc=new Scanner(System.in);
	     String dupSen=sc.nextLine().toLowerCase();
	     String uniqSen=dupSen.replaceAll("[,;:.?!]","");
	     System.out.println(uniqSen);
	     String[] words = dupSen.split("\\s+");
	     String[] words2 = uniqSen.split("\\s+");
	     List<String>l=Arrays.asList(words2);
	     HashSet<String>h=new HashSet<String>(l);
	     List<String>sl=new ArrayList<String>(h);
	     Collections.sort(sl);
	     System.out.println("Number of words "+String.valueOf(words.length));
	     System.out.println("Number of unique words "+String.valueOf(h.size()));
	     System.out.println("The words are");
	     int c=1;
	     for(String i:sl)
	     {
	    	 System.out.println(String.valueOf(c)+". "+i);
	    	 c++;
	     }
	     
	 }

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Thread creation using java 8 lambda using runnable
				Thread evenNumberThread = new Thread(() -> {
					
					// this logic is implementation of run() method to print only even numbers
					for (int i = 0; i < 20; i++) {
						if (i % 2 == 0) {
							System.out.println("Even Number Thread : "+i);
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				});
				evenNumberThread.start();
				for (int i = 0; i < 20; i++) {
					if (i % 2 == 1) {
						System.out.println("Odd Number Thread : "+i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}

	}*/

}


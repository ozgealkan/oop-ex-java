import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {
	
	private static Scanner i;

	public static void showMenu(){
		System.out.println("");
		System.out.println("1. Add dog");
		System.out.println("2. Add cat");
		System.out.println("3. Remove dog");
		System.out.println("4. Remove cat");
		System.out.println("5. List dogs");
		System.out.println("6. List cats");
		System.out.println("7. List all pets");
		System.out.println("8. Show min, max and average weight of dogs");
		System.out.println("0. Quit");
		System.out.println("");
		System.out.println("Please enter your choice :");
	}
	
	public static void main( String[] args ) 
	   {
		HashMap<String,Double> nmap = new HashMap<String,Double>();
		HashMap<String,String> cmap = new HashMap<String,String>();
		while(true){
		showMenu();
		int c;
		i = new Scanner(System.in);
		c = i.nextInt();
		switch(c){
		
		case 0 :
			System.out.println("Do you wanna exit ? (Y/N)");
			Scanner exit = new Scanner(System.in);
			String e = exit.nextLine();
			if (e == "Y")
			{
				System.exit(0);
			}
			break;
	
		case 1 :
			System.out.println("Please enter the dog name :");
			Scanner s = new Scanner(System.in);
			String m = s.nextLine();
			System.out.println("Please enter the weight :");
			String v = s.nextLine();
			Double dV = Double.valueOf(v);
			Pet x = new Pet(m);
			Dog y = new Dog(m,dV);
			nmap.put(x.getName(),y.getWeight());
			System.out.println("Dog added successfully.");
		    break;
				
		case 2 :
			System.out.println("Please enter the cat name :");
			Scanner cs = new Scanner(System.in);
			String name = cs.nextLine();
			System.out.println("Please enter the coat color :");
			String coat = cs.nextLine();
			Pet k = new Pet(name);
			Cat p = new Cat(name,coat);
			cmap.put(k.getName(), p.getcoatColor());
			System.out.println("Cat added successfully.");
			break;
		
		case 3 :
			System.out.println("Please enter the dog name :");
			Scanner g = new Scanner(System.in);
			String rem = g.nextLine();
			Pet z = new Pet(rem);
			nmap.remove(z.getName());
			System.out.println("Dog removed successfully.");
			break;
			
		case 4 :
			System.out.println("Please enter the cat name :");
			Scanner gg = new Scanner(System.in);
			String cc = gg.nextLine();
			Pet h = new Pet(cc);
			cmap.remove(h.getName());
			System.out.println("Cat removed successfully.");
			break;
			  
		case 5 :  
			System.out.println("");
			System.out.println("**List of dogs and weights**");
			Set<String> ks = nmap.keySet();
		    java.util.Iterator<String> it =  ks.iterator();
		    while (it.hasNext()) {
		            String key = it.next();
		            System.out.print(key + " ");
		            System.out.println(nmap.get(key));
		    }
		    break;
		        
		case 6 :
			System.out.println("");
			System.out.println("**List of cats and coat colors**");
			Set<String> ksk = cmap.keySet();
		    java.util.Iterator<String> ite =  ksk.iterator();
		    while (ite.hasNext()) {
		            String key = ite.next();
		            System.out.print(key + " ");
		            System.out.println(cmap.get(key));
		    }
		    break;
		        
		case 7 :
			System.out.println("");
			System.out.println("**List of all pets**");
			Set<String> t = nmap.keySet();
		    java.util.Iterator<String> tt =  t.iterator();
		    while (tt.hasNext()) {
		            String key = tt.next();
		            System.out.print(key + " ");
		            System.out.println(nmap.get(key));
		    }
		        
		    Set<String> ki = cmap.keySet();
		    java.util.Iterator<String> ttt =  ki.iterator();
		    while (ttt.hasNext()) {
		            String key = ttt.next();
		            System.out.print(key + " ");
		            System.out.println(cmap.get(key));
		    }
		    break;
		        
		case 8 :
			System.out.println("Maximum weight of dogs : " + Collections.max(nmap.values()));
			System.out.println("Minumum weight of dogs : " + Collections.min(nmap.values()));
			double sum = 0.0;
			for (double f : nmap.values()) {
			    sum = sum + f;
			}
			double avg = (sum / (nmap.size()));
			System.out.println("Average weight of dogs : " + avg);
			break;
		
	}
		    if (c != 0) continue;
	   }	
	   }
}

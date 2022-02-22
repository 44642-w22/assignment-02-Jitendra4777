package assignment02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AssignmentTwo {
	
	
	public static void stringOccurance(String[] s1) {
		
		Map< String, Integer> map= new HashMap<String, Integer>();
		
		  for(String s: s1) {
			  if(map.containsKey(s)) {
				  
				  map.put(s, map.get(s) + 1);
			  }else {
				  map.put(s, 1);
			  }
			  
		  }
		System.out.print("Output: ");
	     for(Map.Entry<String, Integer> m: map.entrySet()) {
	    	 
	       System.out.print(m.getKey()+" - "+m.getValue()+", ");
	     }
		

	}
	
	
	public static Map<String,String> problem02(String[] s1){
		
		Map<String, String> map= new HashMap<String, String>();
		
		for(String s : s1) {
			
			
		  if(map.containsKey(Character.toString(s.charAt(0)))) {
			  map.put(Character.toString(s.charAt(0)), map.get(Character.toString(s.charAt(0)))+s);
			  
		  }else {
			
			  
			  map.put(Character.toString(s.charAt(0)), s);
		  }
		
		}
		
		System.out.print("Output: ");
	     for(Map.Entry<String, String> m1: map.entrySet()) {
	    	 
	       System.out.print(m1.getKey()+" - "+m1.getValue()+", ");
	     }
		return map;
		
	}
	
	public static Set<Integer> problem03(int[] A1){
		
		Set<Integer> s= new LinkedHashSet<Integer>();
		for(int i:A1) {
			
			while(!s.add(i)) {
				i=i+1;
			}
		}
		
		Iterator<Integer> itr=s.iterator();
		System.out.print("Output: [");
		while(itr.hasNext()) {
			System.out.print(itr.next()+", ");
		}
		System.out.print("]");
		return s;
	}
	
	public static ArrayList<String> problem04(ArrayList<String> A1){
		ArrayList<String> A2=new ArrayList<String>();
		for(int i=0;i<A1.size();i++) {
			
			int l=A1.get(i).length();
			
			char[] ch=A1.get(i).toCharArray();
			
			int index=0;
			for(int j=0;j<l;j++) {
				int k=0;
				for(k=0;k<j;k++) {
					
					if(ch[j]==ch[k]) {
						
						break;
					}
				}
					if(k==j) {
						
						ch[index++]=ch[j];
					}
				}
				
			A2.add(String.valueOf(Arrays.copyOf(ch, index)));
			
		}
		
		for(int a=0;a<A2.size();a++) {
			
			System.out.println(A2.get(a));
		}
		return A2;
	}

	
	public static Map<String, String> problem05(ArrayList<String> A){
		Map<String, String> m1=new HashMap<String, String>();
		for(int i=0;i<A.size();i++) {
			
		       char first=A.get(i).charAt(0);
		       char last= A.get(i).charAt(A.get(i).length()-1);
		       
		       if(m1.containsKey(first)) {
		    	   
		    	   m1.put(Character.toString(first),Character.toString(last));
		       }else {
		       
		       m1.put(Character.toString(first),Character.toString(last));
		       }
		}
		 for(Map.Entry<String, String> m: m1.entrySet()) {
	    	 
		       System.out.print(m.getKey()+" : "+m.getValue()+", ");
		     }
		return m1;
	}
public static Map<String, Boolean> problem06(ArrayList<String> A){
		Map<String, Boolean> m1=new HashMap<String, Boolean>();
		for(int i=0;i<A.size();i++) {
			
				  if(m1.containsKey(A.get(i))) {
					  
					  m1.put(A.get(i), true);
				  }else {
					  m1.put(A.get(i),false);
				  }
				  
			  
		}
		  for(Map.Entry<String, Boolean> m: m1.entrySet()) {
		    	 
		       System.out.print(m.getKey()+" : "+m.getValue()+", ");
		     }
		return m1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("----------------***************problem01**********-------------       ");
		
		System.out.println("Enter the array value");
		int ar1=sc.nextInt();
		String[] s1 = new String[ar1];
		System.out.println("Enter the values: ");
		sc.nextLine();
		for(int i=0;i<ar1;i++) {
			
	      s1[i]=sc.nextLine();

	      }
		
		AssignmentTwo.stringOccurance(s1);
		System.out.println();
		System.out.println("----------------***************problem02**********-------------       ");
		System.out.println("Enter the array value");
		int ar2=sc.nextInt();
		String[] s2=new String[ar2];
		System.out.println("Enter the values: ");
		sc.nextLine();
		for(int i=0;i<ar2;i++) {
			
	      s2[i]=sc.nextLine();

	      }
		AssignmentTwo.problem02(s2);
		System.out.println();
		System.out.println("----------------***************problem03**********-------------       ");
		System.out.println("Enter the array value");
		int ar3=sc.nextInt();
		int[] a= new int[ar3];
		System.out.println("Enter the values: ");
		sc.nextLine();
		for(int i=0;i<ar3;i++) {
			
			a[i]=sc.nextInt();

	      }
		 AssignmentTwo.problem03(a);
			System.out.println();
	System.out.println("----------------***************problem04**********-------------       ");
			System.out.println("Enter the array value");
			int ar4=sc.nextInt();
			ArrayList<String> A1=new ArrayList<String>();
			System.out.println("Enter the values: ");
			sc.nextLine();
			for(int i=0;i<ar4;i++) {
				
		      A1.add(sc.nextLine());

		      }
			AssignmentTwo.problem04(A1);
			System.out.println();
			System.out.println("----------------***************problem05**********-------------       ");
			System.out.println("Enter the array value");
			int ar5=sc.nextInt();
			ArrayList<String> A2=new ArrayList<String>();
			System.out.println("Enter the values: ");
			sc.nextLine();
			for(int i=0;i<ar5;i++) {
				
		      A2.add(sc.nextLine());

		      }
			AssignmentTwo.problem05(A2);
	  
			
			System.out.println();
			System.out.println("----------------***************problem06**********-------------       ");
			System.out.println("Enter the array value");
			int ar6=sc.nextInt();
			ArrayList<String> A3=new ArrayList<String>();
			System.out.println("Enter the values: ");
			sc.nextLine();
			for(int i=0;i<ar6;i++) {
				
		      A3.add(sc.nextLine());

		      }
			AssignmentTwo.problem06(A3);
	
	}

}

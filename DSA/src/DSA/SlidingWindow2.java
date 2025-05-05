package DSA;
/*
Find All Anagrams in a String?

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
*/
import java.util.*;

public class SlidingWindow2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int c=0,w=0,k=0,p=0,pos=0;
		String wi="";
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<str.length();i++){
			if(i+str1.length()<=str.length()){
			for(int j=i;j<i+str1.length();j++){
				if(j==i){
					pos=j;
					}
			wi+=String.valueOf(str.charAt(j));
			}}
			else{
				break;
			}
		char[] c1=wi.toCharArray();
	    char[] c2=str1.toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    String s3=new String(c1);
	    String s4=new String(c2);
	   if(s3.equals(s4)){
		arr.add(pos);
	}
			wi="";
		}	
		System.out.println(arr);
	}
}

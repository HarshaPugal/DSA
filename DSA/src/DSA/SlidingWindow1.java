package DSA;

/*
Count Occurrences of Anagram

Given a word and a text, return the count of occurrences of the anagrams of the word in the text.

gotxxotgxdogt, word = got

Input: text =

Output : 3

Words "got," "otg" and "ogt" are anagrams of "got."
*/
import java.util.*;
public class SlidingWindow1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int c=0,w=0,k=0,count=0;
		String wi="";
		for(int i=0;i<str.length();i++){
			if(i+str1.length()<=str.length()){
			for(int j=i;j<i+str1.length();j++){
			wi+=String.valueOf(str.charAt(j));
			}}
			else{
				break;
			}
			count=count+check(wi,str1);
	
			wi="";
		}	
				System.out.println(count);
	}
	public static int check(String s,String s1){
		int c=0,count=0;
	    char[] c1=s.toCharArray();
	    char[] c2=s1.toCharArray();
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    String s3=new String(c1);
	    String s4=new String(c2);
	   if(s3.equals(s4))
	    count++;
	    return count;
		}
}

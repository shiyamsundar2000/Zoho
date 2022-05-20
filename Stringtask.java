package Task2;

import java.util.ArrayList;
import java.util.List;

public class Stringtask {

	static String str = "";
	String str1 = "zoho";

	public Stringtask(String str1) {
		this.str = str1;
	}

	public String myConcat(String a) {
		String str1 = this.str;

		return str1 + str;
	}

	public char mycharat(int z) {
		String str1 = this.str;
		char ch[] = str1.toCharArray();
		return ch[z];
	}

	public int mylength() {
		int i = 0;
		//int n = 5;
		String str1 = this.str;
		char ch[] = str.toCharArray();

		for (char c : ch) {
			i++;

		}
		return i;
	}

	public int mycodepoint(int i) {
		String str1 = this.str;
		char[] ch = new char[10];
		
		ch = str.toCharArray();
		if(0<i) {
			i = ch[i];
		}else {
			return -1;
		}
		
		return i;
	}

	public int mycodepointbefore(int s) {
		String str1 = this.str;
		char[] ch = new char[10];
		ch = str.toCharArray();
		if(0<s) {
			s = ch[s - 1];
		}else {
			return -1;
		}
		
		return s;
	}
		
	public String toLowercase() {
		String str1 = this.str;

		char[] charArray = new char[str.length()];
		charArray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (charArray[i] >= 65 && charArray[i] <= 90) {
				charArray[i] = (char) (charArray[i] + 32);

			}
		}
		String st = new String(charArray);
		return st;
	}

	public String toUppercase() {
		String str1 = this.str;
		char[] charArray = new char[str.length()];

		charArray = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (charArray[i] >= 97 && charArray[i] <= 122) {
				charArray[i] = (char) (charArray[i] - 32);

			}

			// for (int i = 0; i < charArray.length; i++) {
			// System.out.print(charArray[i]);
		}
		String st = new String(charArray);
		return st;
	}

	public String SubString(int a, int b) {

		String str1 = this.str;

		char[] ch = str.toCharArray();

		int startIndex = a;

		int endIndexEntered = b;

		int endIndex = 0;

		if (endIndexEntered == 0) {
			endIndex = ch.length;
		} else {
			endIndex = endIndexEntered;
		}

		String res = "";

		for (int i = startIndex; i < endIndex; i++) {
			if (endIndex == startIndex)
				break;
			res = res + ch[i];
		}
		return res;
	}

	public boolean empty(String a) {

		if (a.length() == 0) {
			return true;
		}
		return false;

	}

	public boolean contain() {
		String str1 = "oho";

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <=str1.length(); j++) {
				if (str.charAt(i) == str1.charAt(j)) {
					counter++;

				} 
				else {
					if (str1.length()-i >= str.length()) {
						counter++;

						return true;
					}
					else {
					return false;
					}
				}
			}
		}
		
		return false;
		

	}

	public boolean Equals() {
		String str1 = "oho";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str1.charAt(i))
				return false;
		}
		return true;
	}

	public boolean StartsWith() {
		 String str=this.str;
		int c = 0;
		char[] ich = str.toCharArray();
		char[] jch = str1.toCharArray();

		boolean res = false;

		for (int i = 0; i < str1.length(); i++) {			
				if (ich[i] == jch[i]) {
					c++;
				} else {
					break;
				}
			}
		
		if (str1.length() == c) {
			res = true;
		}
		return res;
	}

	public boolean EqualsIgnorecase() {

		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			if (ch[i] >= 65 && ch[i] <= 90) {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		for (int j = 0; j < str1.length(); j++) {
			if (ch1[j] >= 65 && ch1[j] <= 90) {
				ch1[j] = (char) (ch1[j] + 32);

			}
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j <= i; j++) {
				if (ch[i] == ch1[j]) {
					count++;
				}
			}

		}

		if (str.length() == count) {
			return true;
		} else
			return false;

	}
    public boolean Endswith() {
    	String str=this.str;
    	int c=0;
    	char[] ich = str.toCharArray();
		char[] jch = str1.toCharArray();
		int n = str.length()-str1.length();
		for(int i=n;i<str.length();i++) {
			for(int j=0;j<=str1.length();j++) {
			
				if(ich[i]==jch[i]) {
					c++;
					break;
			}
				
		}
		
		if(str1.length()==c) {
			return true;
		}
		else {
			return false;
    }
		}
		  	
		return false;
		
    	
    }
 

  	public char[] tochararray() {
		this.str = str1;
        char[] charArrary = new char[str.length()]; 
      
        for (int i = 0; i < str.length(); i++) { 
            charArrary[i] = str.charAt(i); 
        } 
        //System.out.println(charArrary);
		return charArrary;
	}
    
  	public String [] spilt(char a){
    	String str=this.str;
    	
    	List<String> c=new ArrayList<String>();
    	char[] ch =str.toCharArray();
    	String Strtemp = "";
		for(int i=0;i<ch.length;i++)
    		if(ch[i]!=a) {
    			Strtemp=Strtemp+ch[i];
    		}
    		else {
    			c.add(Strtemp);
    	        Strtemp="";
    }
		c.add(Strtemp);
		
		String [] s=new String [c.size()];	
		
		for(int i=0;i<c.size();i++) {
		s[i]=c.get(i);
		
		}
    return s;
      	
    }
    
    public String trim() {   	
    	String str1 = this.str; 
    	char[] cd=str1.toCharArray();
    	     int n=0;
    	    for ( int i = 0; i < str.length(); i++) { 	    	
    	    	if(cd[i] ==(char)32 ) {
    	            n++;
    	        }				
				else {
					break;
				}
    	    }
    	    String string=SubString(n, str.length());
			return string;
    	 }
    public int Indexof() {
    	char[] ch=str.toCharArray();
    	char b='h';
    	for(int i=0;i<str.length();i++) {
    		if(ch[i]==b) {
    			return i;
    		}
    	}
		return b;
    	
    }
	public static void main(String[] args) {
		Stringtask obj = new Stringtask("zoho");

         System.out.println("concat          : "+obj.myConcat(str));
	     System.out.println("charAt            : "+obj.mycharat(3));
		 System.out.println("mylength          :"+obj.mylength());
		 System.out.println("mycodepoint       :"+obj.mycodepoint(2));
		 System.out.println("mycodepointbefore :"+obj.mycodepointbefore(1));
		 System.out.println("Lowercase         :"+obj.toLowercase());
	     System.out.println("Uppercase         :"+obj.toUppercase());
		 System.out.println("Substring         :"+obj.SubString(1,3));
		 System.out.println("empty             :"+obj.empty(""));
		 System.out.println("contain           :"+obj.contain());
		 System.out.println("Equals            :"+obj.Equals());
		 System.out.println("Startswith        :"+obj.StartsWith());		
		 System.out.println("EqualsIgnorecase  :"+obj.EqualsIgnorecase());  
		 System.out.println("Endswith          :"+ obj.Endswith());
		 char [] ca = obj.tochararray();
		 System.out.println(ca);
		 System.out.println("trim              :"+obj.trim());
		 System.out.println("Indexof           :"+obj.Indexof());
		 String [] starray = obj.spilt('h');
		 for(String s: starray) {
			 System.out.println(s);
		 }
			
         	}
}

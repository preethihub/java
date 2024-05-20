//feature 1: take user input of the index number
//feature 2: take user inputs for every funtion in the string


import java.util.*;
 class strings {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String s1=sc.next();
        System.out.println("hello "+s1+" welcome to java");
        System.out.println();

        //returns the number of characters in the string
        System.out.print("Enter index number: ");
        sc.next();
        char c=s1.charAt(0);
        System.out.println(" index number is "+c);
        System.out.println();

        //returns the substring of the character from the end index number
        System.out.print("Enter substring number: ");
        sc.next();
        String s=s1.substring(3);
        System.out.println("Substring from  beginindex number "+s);
        System.out.println();
   
        //returns the character from begin index to end index number
        System.out.print("Enter substring number of start and end : ");
        sc.next();
        String S=s1.substring(2, 06);
        System.out.println("Substring from starting to ending "+S);
        System.out.println();

        // concating 2 strings together
        sc.next();
        String str1="lanuagess";
        System.out.println("Concated string:- "+s1.concat(str1));
        System.out.println();
        

        //returns strings of the index number at the first occurrence
        System.out.print("Enter only beginning index of character: ");
        sc.next();
        String s2="lanuages";
        int s6=s2.indexOf("ages");
        System.out.println("the index number is "+s6);
        System.out.println();

        //returns index number for string 
        System.out.print("Enter string and index number: ");
        sc.next();
        int s8=s2.indexOf("s", 2);
        System.out.println("the index value is "+s8);
        System.out.println();

        //checking strings are equal or not
        Boolean b1="programs".equals("Programs");
        System.out.println("Is it equals "+b1);
        b1="programs".equals("programs");
        System.out.println("Is it equals "+b1);
        System.out.println();

        //compares the 2 strings
        System.out.println("comparing two strings");
        int a=s2.compareTo(str1);
        System.out.println("the difference between ASCII value is "+a);
        sc.next();
        System.out.println();

        //converting lower characters to upper characters
        System.out.print("Enter string to convert upper case: ");
        sc.next();
        String su=s1.toUpperCase();
        System.out.println("changed to upper case => "+su);
        System.out.println();

        //converting upper characters to lower characters
        System.out.print("Enter string to convert lower case: ");
        sc.next();
        String sl=s1.toLowerCase();
        System.out.println("changed to lower case => "+sl);
        System.out.println();

        //returns the string by removing start and end spaces
        System.out.print("Enter string to trim: ");
        sc.next();
        String word2=" methods ";
        String sm=word2.trim();
        System.out.println("trim the word"+sm);
        System.out.println();

        //replacing the characters from old to new character
        System.out.println("Replacing the string from old to new characters");
        System.out.println("original string"+word2);
        System.out.println("replaced by m to p => "+word2.replace('m', 'p'));

        
       sc.close();
        
    }
}


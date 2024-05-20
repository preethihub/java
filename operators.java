// Feature 1 : add all operators in the program
// Feature 2 : take user input for every operator


import java.util.Scanner;
public class operators {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
    // int a,b,res, mul;
    int a,b,c,res;

        System.out.print("enter a: ");
        a=sc.nextInt();

        System.out.print("enter b: ");
         b=sc.nextInt();


        System.out.println("-------Arithmetic operators----------");
        System.out.println("addition: "+(a+b));

        System.out.println("multiplication: "+a*b);

        System.out.println("division: "+a/b);      
        
        System.out.println("subtraction: "+(a-b));

        System.out.println("modulus: "+(a%b));


        System.out.println("-------Assignment operators----------");
        System.out.println("Assign values: "+(c=a));

        System.out.println("adds: "+(b += a));

        System.out.println("subtracts: "+(b -= a));

        System.out.println("multiples: "+(b *= a));

        System.out.println("divides: "+(b /= a));

        System.out.println("modulus: "+(b %= a));

        System.out.println("exponential(power): "+(b ^= a));


        System.out.println("-------Relational operators----------");
        System.out.println("equals: "+(a==b));

        System.out.println("not equals: "+(a != b));

        System.out.println("greater: "+(a>b));

        System.out.println("less than: "+(a<b));

        System.out.println("greater than equals: "+(a >= b));

        System.out.println("lesser than equals: "+(a <= b));


        System.out.println("-------Logical operators----------");
        System.out.println("AND: "+(a<20 & a<20));

        System.out.println("OR: "+(a<10 || a<20));

        System.out.println("greater: "+(!(a<10 & a<20)));


        System.out.println("-------Unary operators----------");
        System.out.println("post-increment: "+(a++));

        System.out.println("pre-increment: "+(++a));

        System.out.println("post-decrement: "+(a--));

        System.out.println("pre-decrement: "+(--a));


        System.out.println("-------Bitwise operators----------");
        System.out.println("AND: "+(a&b));

        System.out.println("OR: "+(a|b));

        System.out.println("XOR: "+(a^b));

        System.out.println("-------Ternary operators----------");
        res=((a>b)?(a>c)? a: c: (b>c)? b: c);
        System.out.println("Max of three numbers= "+res);

        System.out.println("-------Shift operators----------");
        System.out.println("left shift operator "+(a<<2));
        System.out.println("right shift operator "+(a>>2));
        System.out.println("unsigned right shift operator "+(a>>>2));

        sc.close();
    }
    
}

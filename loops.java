class loops
{
    public static void main(String[] args) 
    {
//         for(int i=0;i<=4;i++)
//         {
//         for(int j=i;j<=4;j++)
//         {
//             System.out.print("* ");
//         }
//         System.out.println();
    
// }

    int i=0;

    if (i<10) {
        System.out.println("for loop:- executing condition in one line");
        System.out.println("for loop Syntax:- for(initialization; condition; increment/decrement;){ statement to be executed }");
        System.out.println("--------------------------------------------------");
    } else {
        System.out.println("while loop:- executes the statement repeatedly");
        System.out.println("while loop Syntax:- while(boolean condition){ loop statements }");
        System.out.println("--------------------------------------------------");
    }

    if (i>5) {
        System.out.println("do-while loop:- it checks for condition after executing statements");
        System.out.println("do-while loop Syntax:- do{ statements } while(condition)");
        System.out.println("--------------------------------------------------");
    } else {
        System.out.println("Nested loop:- one loop inside another loop,d/f loops for,while,do-while loop");
        System.out.println("for loop inside another for loop");
        System.out.println("while loop inside another while loop");
        System.out.println("do-while loop inside another do-while loop");
        
    }
}
}


//feature 1: using ifelse print definition and syntax of all the loops
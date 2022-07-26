
import java.util.*;

public class Stack{

static final int MAX=100;
int top=-1;

int[] s=new int[MAX];

public static void main(String args[])
{
    Stack s1=new Stack();
        int opt, val;
        System.out.println("1. PUSH ");
        System.out.println("2. POP ");
        System.out.println("3. PEEP ");
        System.out.println("4. DISPLAY STACK ");
        System.out.println("5. EXIT ");
        System.out.println("\n Enter Your Option: ");
        Scanner sc=new Scanner(System.in);
        opt=sc.nextInt();
    do{
        switch(opt)
        {
            case 1: System.out.println("Enter the value to be added to the stack: ");
                    val=sc.nextInt();
                    s1.push(val);
                    break;

            case 2: s1.pop();
                    break;
            case 3: s1.peep();
            break; 

            case 4: s1.display();
            break;

}
}while(opt!=5);

}

public void push(int val)
{
if(top==MAX-1)
{
System.out.println("Stack is FULL!");
}
else
{
top++;
s[top]=val;
System.out.println("Element added to the stack is: "+val);
display();
}
}

public void pop()
{
int x;
if(top==-1)
{
System.out.println("Stack is EMPTY!");
}
else
{
x=s[top];
System.out.println("The element deleted from the stack is: "+x);
top--;
display();
}
}

public void peep()
{
int n;
n=s[top];
System.out.println("The value at the top of the stack is: "+n);
}

public void display()
{
int i;
if(top==-1)
System.out.println("STACK IS EMPTY!");
else
{
for(i=0; i<=top; i++)
System.out.println("The elements in the stack are: "+s[i]);
}

}

}
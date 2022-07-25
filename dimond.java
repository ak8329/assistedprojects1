

interface a
{  
    default void show() 
    { 
        System.out.println("Default io"); 
    } 
} 
interface b 
{  
    default void show() 
    { 
        System.out.println("Default l"); 
    } 
}  
public class dimond implements a, b
{  
    public void show() 
    {  
        a.super.show(); 
        b.super.show(); 
    } 
    public static void main(String args[]) 
    { 
       dimond ob = new dimond(); 
        ob.show(); 
    } 
}



public class accesscall{  
 int data=50;
  
 void change(int data){  
 data=data+100;
 //changes will be in the local variable only  
 }  
  void change1(accesscall op){  
 op.data=op.data+100;//changes will be in the instance variable  
 } 

     
 public static void main(String args[]){  
  accesscall op=new accesscall();  
  
   System.out.println("before change "+op.data);  
   op.change(500);  
  
   System.out.println("after change "+op.data);  
   op.change1(op);
      System.out.println("after change "+op.data); 
  
 }  
} 


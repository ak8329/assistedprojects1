package ak;

	 
	public class Runthread implements Runnable{
		 
	    public static int myCount = 0;
	    public Runthread (){
	         
	    }
	    public void run() {
	        while(Runthread.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++Runthread .myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread...");
	        Runthread  mrt = new Runthread();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(Runthread.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++Runthread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread...");
	    }
	}


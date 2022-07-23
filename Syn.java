	class PrintCount {
		   //print thread counter
		   public void printCounter() {
		      try {
		         for(int i = 5; i > 0; i--) {
		            System.out.println("Counter ==>  "  + i );
		         }
		      } catch (Exception e) {
		         System.out.println("Thread  interrupted.");
		      }
		   }
		}
		class ThreadCounter extends Thread {
		   private Thread t;
		   private String threadName;
		   PrintCount  PD;
		   ThreadCounter( String name,  PrintCount pd) {
		      threadName = name;
		      PD = pd;
		   }
		   public void run() {
		      synchronized(PD) {
		         PD.printCounter();
		      }
		      System.out.println("Thread " +  threadName + " exiting.");
		   }
		   public void start () {
		      System.out.println("Starting " +  threadName );
		      if (t == null) {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }
		}
		public class Syn{
		   public static void main(String args[]) {
		      PrintCount PD = new PrintCount();
		      ThreadCounter T1 = new ThreadCounter( "Thread_1 ", PD );
		      ThreadCounter T2 = new ThreadCounter( "Thread_2 ", PD );
		      T1.start();
		      T2.start();      
		      try {
		         T1.join();
		         T2.join();
		      } catch ( Exception e) {
		         System.out.println("Interrupted");
		      }
		   }
		}

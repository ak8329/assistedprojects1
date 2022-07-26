
public class Queue { 
	      
	    public static int front, rear, capacity;   
	    public static int queue[];   
	     
	    Queue(int size) {   
	        front = rear = 0;   
	        capacity = size;   
	        queue = new int[capacity];   
	    }   
	     
	    // insert an element into the queue  
	    static void Enqueue(int item)  {   
	        // check if the queue is full  
	        if (capacity == rear) {   
	            System.out.printf("\nQueue is full\n");   
	            return;   
	        }   
	     
	        // insert element at the rear   
	        else {   
	            queue[rear] = item;   
	            rear++;   
	        }   
	        return;   
	    }   
	     
	    //remove an element from the queue  
	    static void Dequeue()  {   
	        // check if queue is empty   
	        if (front == rear) {   
	            System.out.printf("\nQueue is empty\n");   
	            return;   
	        }   
	     
	        // shift elements to the right by one place uptil rear   
	        else {   
	            for (int i = 0; i < rear - 1; i++) {   
	                queue[i] = queue[i + 1];   
	            }   
	     
	         
	      // set queue[rear] to 0  
	            if (rear < capacity)   
	                queue[rear] = 0;   
	     
	            // decrement rear   
	            rear--;   
	        }   
	        return;   
	    }   
	     
	    // print queue elements   
	    static void Display()   
	    {   
	        int i;   
	        if (front == rear) {   
	            System.out.printf("Queue is Empty\n");   
	            return;   
	        }   
	     
	        // traverse front to rear and print elements   
	        for (i = front; i < rear; i++) {   
	            System.out.printf(" %d , ", queue[i]);   
	        }   
	        return;   
	    }   
	     
	    // print front of queue   
	    static void Front()   
	    {   
	        if (front == rear) {   
	            System.out.printf("Queue is Empty\n");   
	            return;   
	        }   
	        System.out.printf("\nFront Element of the queue: %d", queue[front]);   
	        return;   
	    }   
  
	    public static void main(String[] args) {   
	        // Create a queue of capacity 4   
	        Queue q = new Queue(4);   
	     
	        System.out.println("Initial Queue:");  
	       // print Queue elements   
	        q.Display();   
	     
	        // inserting elements in the queue   
	        q.Enqueue(10);   
	        q.Enqueue(30);   
	        q.Enqueue(50);   
	        q.Enqueue(70);   
	     
	        // print Queue elements   
	        System.out.println("Queue after Enqueue Operation:");  
	        q.Display();   
	     
	        // print front of the queue   
	        q.Front();   
	           
	        // insert element in the queue   
	        q.Enqueue(90);   
	     
	        // print Queue elements   
	        q.Display();   
	     
	        q.Dequeue();   
	        q.Dequeue();   
	        System.out.printf("\nQueue after two dequeue operations:");   
	     
	        // print Queue elements   
	        q.Display();   
	     
	        // print front of the queue   
	        q.Front();   
	    }   
	}  


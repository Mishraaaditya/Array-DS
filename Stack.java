import java.util.Scanner;


 public class  Stack                               //class for testing stack operation
{
	public static void main(String[] args) 
	{
								  //variable used to store tupe of operation	
		Mystack st = new Mystack();            //created stack
		
		Scanner s = new Scanner(System.in);    

		while(true)
		{
			System.out.println("enter your choice");
			System.out.println("enter 1 for push a numer");
			System.out.println("enter 2 for pop a number");
			System.out.println("enter 3 for printing a stack elements");
			System.out.println("enter 4 for peek element");
            System.out.println("enter 5 for  exit");
			int option = s.nextInt();							//reading type value
			switch(option)
			{
			case 1: System.out.println("Enter your element which you want to push");
					st.push(s.nextInt());                   
					break;

			case 2: 
                    int k = st.pop();
                    if(k==-1){
                      System.out.println("Stack Underflow"); 
                      break;
                     }
                     
                     System.out.println("Element  you popped is "+ k);
                     break;
                    
                    

			case 3: System.out.println("stack element is ");
					st.print();
					break;
            case 4: 
                int p = st.peek();
                if(p==-1){
                System.out.println("Stack Underflow"); 
                 break;
                }
                System.out.println("Peek is :  "+ p);
                break;
            case 5 : System.out.println("Exiting....");
                     System.exit(0);
			default: System.out.println("You have entered the wrong choice"); 
					return ;

			}
		
		}
        
		
	}
}
class Mystack {
    private  class Node{
        int data;
        Node next;
        
        Node(int data)
        {
            this.data=data;
            next=null;
        }
     }
    
     
         Node head=null;
        
        //PUSH OPERATION
        public  void push(int data){
            Node newNode= new Node(data);
            
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public boolean isEmpty(){
            return head==null;
        }
        //POP OPERATION
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        
        //PEEK OPERATION
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public void print(){
            Node temp =  head ;
            if(isEmpty()){
                System.out.println("Empty Stack");

            }
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;

            }
        }
    }

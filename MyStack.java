public class MyStack<E> implements Stack<E>{
       Node<E> head;
     private  int numItems;
      int TOS;
       
 
   public void createstack(){   
      numItems = 0;
      head = null;
      TOS=0;
   } 

   public void push(E item) throws ListIndexOutOfBoundsException {
       
        
		Node<E> newNode = new Node<E>(item);
		newNode.setNext(head);
		head = newNode;
		numItems++;
		TOS=1;
          
   }

   public void pop() {
      
            
              head = head.getNext(); 
             
              if(head == null){
            	  TOS=0;
              }
              else
              {
            	  TOS=1;
              }
            numItems--;
   }

   public boolean isEmpty(){
           return numItems == 0;          
   }

   public E get(int index) throws ListIndexOutOfBoundsException{
       if ( index > 0 && index <= numItems + 1){
             Node<E> current = find(index);
             E item = current.getItem();
             return item;
       }
       else
            throw new ListIndexOutOfBoundsException("GET ERROR: List Index Out Of Bounds");
   }

   public int size(){
           return numItems;
   }

   
   public Node<E> find(int index){
   Node<E> current = head;
 
   for (int i = 1; i < index; i++)
   { 
	   
      current = current.getNext(); 
   }

   return current;
   } 
   
   public E getTOS(){
	   Node<E> current=find(TOS);
	   E item= current.getItem();
	   return item;
   }
}//end class

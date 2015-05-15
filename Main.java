import java.util.*;
import acm.graphics.*;
import acm.program.*;

import java.awt.*;
public class Main<E> extends GraphicsProgram {

	MyStack<E> City = new MyStack<E>();
    int a, index,i;
    int offset=3;
    String search;
    
    E item;
    
    private GLabel Title=new GLabel("STACK ADT");
   
    ;
    
    Scanner numofitems= new Scanner(System.in);
    Scanner items= new Scanner(System.in);
    Scanner main= new Scanner(System.in);
    Scanner find= new Scanner(System.in);
	
	public void run(){
		City.createstack();
		add(Title, 10,12);	
		main();
	}
	

    private void push(){
    	
    	System.out.print("Enter item: ");
    	item = (E) items.next();
    	City.push(item);
    	System.out.println("STACK SIZE is "+ City.size());
    	System.out.println("TOP OF STACK IS " + City.getTOS());
    	System.out.print("\n");
    	
    }
    
    
    private void pop(){
    	if(City.isEmpty()){
    	System.out.println("STACK IS EMPTY!\n");
    	}
    	else
    	{
    	System.out.println(City.getTOS()+" Has been removed!");
    	City.pop();
    	System.out.println("STACK SIZE is "+ City.size());
    	if(City.isEmpty()){
        	System.out.println("STACK IS EMPTY!\n");
        	}
    	else{
    	System.out.println("TOPS OF STACK IS " + City.getTOS());
    	}
    	System.out.print("\n");
    	}
    } 
    
    private void removeall(){
    	if(City.isEmpty())
    	{
    	System.out.println("STACK IS EMPTY!\n");
    	}
    	else{
    	do
    	{
    	City.pop();
    	
    	}while(City.size()!=0);
    	System.out.println("STACK SIZE is "+ City.size());
    	System.out.println("STACK IS EMPTY!\n");
    	}
    	
    	
    }
    
    private void displaylist(){
    	add(Title,10,12);
    	for(i = 1;i <=City.size();i++){
    		GLabel item= new GLabel((i)+") "+ City.get(i));
    	     add(item, (getWidth() - item.getWidth())/2, getWidth()/10 + i * (item.getHeight() + offset));
    	}
    	        	
    }
    
    private void refresh(){
    	removeAll();
    	setBackground(Color.WHITE);
    }
    
    private void isEmpty(){
    	System.out.print("STACK IS EMPTY --> "+City.isEmpty()+"\n\n");
    }
    
  
    
  private void main(){
	 
		System.out.println("1) PUSH");
		System.out.println("2) POP");
		System.out.println("3) Check if Empty");
		System.out.println("4) REMOVE ALL (POP ALL)");
		System.out.print("ENTER CHOICE: ");
		a = main.nextInt();
		switch (a){
		
		case 1:
			  
			  push();
			  refresh();
			  displaylist();
			  main();
			  
		
		case 2:
			  pop();
			  refresh();
			  displaylist();
			  main();
			  
		case 3:
			 isEmpty();
			 main();
		
		case 4:
			 removeall();
			  refresh();
			  displaylist();
			  main();
			  

	    default:
	    	  
			  System.out.println("Please enter a valid number!");
			  System.out.println("\n");
			  main();
			  
		}
	  
  }
}

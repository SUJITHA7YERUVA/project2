package project2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	 private ArrayList<Task> theList;

	  public static void main(String[] args)
	  {
		  
		  Scanner input = new Scanner(System.in);
	        final int MAX = 10;
	        String[] list = new String[MAX];
	        List<String> list1 =new ArrayList<String>();
	        int choice = 0;

	        while (choice != 8) {
	            System.out.println();
	            System.out.println("Type 1 Add new Item");
	            System.out.println("Type 2 print type1");
	            System.out.println("Type 3 delete item");
	            System.out.println("Type 4 Check if deadline has been exceeded");
	            System.out.println("Type 5 Remove done/expired items");
	            System.out.println("Type 6 Get the description for each item.");
	            System.out.println("Type 7 Search for a specific Item");
	            System.out.println("Type 8 Add more functionality if you feel adventurous.");
	            System.out.print("Select an option: ");
	            choice = input.nextInt();
	            String userEnteredItem;
	            if (choice == 1) {
	                System.out.println("Keep hitting enter after to do's, if you want to stop, type 'stop'.");
	                for (int i=0;i<MAX;i++) {
	                    userEnteredItem = input.nextLine();
	                    if(!userEnteredItem.isEmpty()) {
	                        list[i] = userEnteredItem;
	                        if (userEnteredItem.equals("stop"))  {
	                            break;
	                           
	                        }
	                        i++;
	                    } else {
	                        i--; // Do not increase index for empty item.
	                    }
	                }
	            }
	            else if (choice == 2) {
	                for (int index = 0;index < choice; index++) {
	                    System.out.println(list[index] );
	                    break;
	                }
	                
	               
	                
	            }
	            else if (choice == 3) {
	            	for(String s : list) {
	            		System.out.println(s);
	            	}
	            }
	            else {
	                input.close();
	            }
	        }
	        
	        
	        
	    Main myList = new Main();

	    myList.add("get dressed");
	    myList.add("brush teeth");
	    myList.add("...ehm...");
	    myList.add("shower");
	    myList.add("eat");
	    myList.add("drink");
	    myList.add("buy ticket");

	    myList.done("brush teeth");
	    myList.done("shower");

	    myList.todolistAusgeben();

	  }

	  public Main()
	  {
	    theList = new ArrayList<Task>();
	  }

	  public void add(String activity)
	  {
	    theList.add(new Task(activity));
	  }

	  public Task get(String activity)
	  {
	    for (Task task : theList)
	      if (task.isCalled(activity))
	        return task;

	    return null;
	  }

	  public void done(String activity)
	  {
	    Task task = get(activity);

	    if (task != null)
	      task.done();
	  }

	  public void todolistAusgeben()
	  {
	    int sizeOfList = theList.size();
	    for (int i=0; i < sizeOfList; i++) {
	      Task sTodo = theList.get(i);
	      System.out.println(sTodo);
	    }
	  }

	   private class Task {

	    private String name;
	    private boolean status;

	    public Task(String name)
	    {
	      this.name = name;
	      this.status = false;
	    }

	    public boolean isCalled(String name)
	    {
	      return this.name.equals(name);
	    }

	    public void done()
	    {
	      status = true;
	    }

	    public String toString()
	    {
	      return name + " : " + (status ? "DONE" : "Waiting...");
	    }

	  }

	
} 


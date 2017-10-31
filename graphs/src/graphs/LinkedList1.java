package graphs;
import java.util.LinkedList;
class Student{
	int rollno;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class LinkedList1 {
	  public static void main(String[] args) {
	   LinkedList<Student> list = new LinkedList();
	   Student st=new Student();
	   st.setName("nikita");
	   st.setRollno(1);
	   list.add(st);
	   Student st1=new Student();
	   st1.setName("anjali");
	   st1.setRollno(2);
	   list.add(st1);
	  
       
	   // print the list
	   System.out.println("LinkedList:" + list.toString());

	   // add a new element at the end of the list
	  // list.add("Element");
	   

	   // print the updated list
	   }

@Override
   public String toString() {
	   
		return ;
		//return "LinkedList1 []"	}
	
}


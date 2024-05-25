import java.util.Scanner;

class employee {

	employee next;
	
	int id;
	
	String name;
	String gender;
	double Salary;
	
	
	employee( int id,String name,
	String gender,
	double Salary){
		
	
		this.id=id;
		this.name=name;
		this.Salary=Salary;
		this.gender=gender;
		this.next=null;
		
		
		
	}
	
	 public String toString() {
	        return "EmployeeId: " + id + "\n" +
	               "Name: " + name + "\n" +
	               "Gender: " + gender + "\n" +
	               "Salary: " + Salary + "\n";
	    }
	}
public class LinklistEmp {

	
	
	
	employee root;
	
	
	 void addemp(int id, String name,String gender, double salary){
		
		 employee e=new employee(id,name,gender,salary);
		 
		 if(root==null) {
			 
			 root=e;
			 
		 }
		 else {
			
			 employee t=root;
			 
			 while(t.next!=null) {
				 
				 t=t.next;
				 
			 }
			 
			 
			 t.next=e;
			 
			 
		 }
		 
		 
		 
		
	}
	 
	
	void SearchId(int id) {
		 employee t=root;
		 
		 if(root==null) {
			 
			 System.out.println(" list is empty");
		 }
		 
		 else {
			
			 
			 while(t != null && t.id != id) {
				 
				t=t.next;
				 
			 }
			 
			 if(t==null) {
				 
				 System.out.println("id not in list");
				 
			 }
			 
			 else {
				 
				System.out.println(t);
			 }
			 
			 
		 }
		 
	 }
	
	void print() {
		
		
		if(root==null) {
			System.out.println("list is empty");
		}
		else{
			employee t=root;
			 while(t!=null) {
				 
				 System.out.println(t);
				 t=t.next;
			 }
		}
		
	 
		
		
	}
	
	void delete_byid(int id) {
		
		 employee t=root;
		 employee t2=root;
		if(root==null) {
			
			System.out.println("list is empty");
		}
		
		else{
			
			
			 
			 while(t.id!=id&& t.id!=id) {
				 t2=t;
				t=t.next; 
			 }
			 
			 
			 if(t==null) {
				 System.out.println("Id not found");
				 
			 }
			 else {
				 
				 t2.next=null;
				 
			System.out.println(""+t.id+ "is deleted");
				 
			 }
			
		}
		
		
		
		
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinklistEmp ll= new LinklistEmp ();
		Scanner sc=new Scanner(System.in);
		int a;
		do {
			
		System.out.println("1->.Add Employe 2-> SearchbyId 3-> DisplayDetails 4->deleteById");	
			
		 System.out.println("Enter your choice: ");
		 
		 a=sc.nextInt();
		 
		 
		 switch(a) {
		 
		
		 
		 
		 case 1:
			 System.out.println("Enter id, name ,geder,salary ");
			 
			 int id=sc.nextInt();
			 String name=sc.next();
			 String gender=sc.next();
			 double salary= sc.nextDouble();
			
			 ll.addemp(id,name,gender,salary);
			 break;
		 
		 case 2: 

			System.out.println("Enter id");	
            int sid=sc.nextInt();
            ll.SearchId(sid);
       	  break;
       	  
		 case 3:
			 ll.print();
			 break;
			 
			 
		 case 4:
			 System.out.println("enter id");
			
			 int did=sc.nextInt();
			 ll.delete_byid(did);
			 break;
		 case 0:
			 
			 System.out.println("Thank you visit again");
			 break;
			 
			 default:
				 System.out.println("wrong choich");
		 }
			
		}while(a!=0);
		
		
	}

}

package student;
import java.util.*;
class value{  
int id,year;  
String name,college;  
float cgpa;
public value(int id, String name, String college,float cgpa, int year) {  
    this.id = id;  
    this.name = name;  
    this.college = college;  
    this.cgpa = cgpa;  
    this.year = year;  
}  
}  

public class Detail {
	ArrayList<value> ar=new ArrayList<value>();
	public void menu()
	{ 
		
		int op;
		do {
		System.out.println("Enter your choice");
		System.out.println("1.Add stuent detail");
		System.out.println("2.remove student detail ");
		System.out.println("3.update student detail");
		System.out.println("4.display student detail");
		System.out.println("5.exit");
		Detail sd1=new Detail();
		Scanner sc=new Scanner(System.in);
		 op=sc.nextInt();
		switch (op){
		case 1:
			sd1.add();
			break;
		case 2:
			sd1.remove();
			break;
		//case 3:
			//sd1.update();
		//	break;
		//case 4:
		//	sd1.display();
			//break;
		case 5:
			sd1.exit();
			break;
		
			}}while(op>0 && op<=5);
	}
	
	public void exit() {
		System.out.println("The operation is completed");
		System.exit(0);
	}
	public void add() {
		
		Scanner scanner = new Scanner(System.in);
		int id,year;  
		String name,college;  
		float cgpa;
		
		System.out.println("Enter student Id : ");
		id=scanner.nextInt();
		
		System.out.println("Enter student Name : ");
		name=scanner.next();
		
		System.out.println("Enter College name : ");
		college=scanner.next();

		System.out.println("Enter cgpa : ");
		cgpa=scanner.nextFloat();
		
		System.out.println("Enter student passedout year: ");
		year=scanner.nextInt();
		value obj=new value(id,name,college,cgpa,year);
		ar.add(obj);
		System.out.println("Detail added sucessfully");
	
	}
	public void remove(){
		System.out.println("Which student Id would you like to delete?");
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
		value vr=(value)itr.next();
			//if (vr.id) {
				//vr.remove();
				System.out.println("Successfully Deleted");
			//}else
			{
				System.out.println("Enter the vaild Id ");
			}

		}}
	
	
	public static void main(String[] args)
	{
		int id,year;  
		String name,college;  
		float cgpa;
		Detail sd=new Detail();
		sd.menu();
		
	}
	}



package student;
import java.util.*;

public class Studentdetail{
	ArrayList<Value> v1=new ArrayList<Value>();
	Value obj = new Value();
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
		Studentdetail sd1=new Studentdetail();
		Scanner sc=new Scanner(System.in);
		 op=sc.nextInt();
		switch (op){
		case 1:
			sd1.add();
			break;
		case 2:
			sd1.remove();
			break;
		case 3:
			sd1.update();
			break;
		case 4:
			sd1.display();
			break;
		case 5:
			sd1.exit();
			break;
		
			}}while(op>0 && op<=5);
	}
		//add the student detail//
		public void add() {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter student Id : ");
			obj.setId(scanner.nextInt());
			
			System.out.println("Enter student Name : ");
			obj.setName(scanner.next());
			
			System.out.println("Enter College name : ");
			obj.setCollege(scanner.next());

			System.out.println("Enter cgpa : ");
			obj.setCgpa(scanner.nextFloat());
			
			System.out.println("Enter student passedout year: ");
			obj.setYear(scanner.nextInt());
			
			v1.add(obj);
			System.out.println("Detail added sucessfully");
		
		}
		//display the student detail//
		public void display() {
			Value v=new Value();
			//Iterator<Value> itr =v1.iterator();

			//while (itr.hasNext()) {
				//Value Ve= (Value)itr.next();
			
			for(int i=0;i<v1.size();i++)
			{
				System.out.print("Student Id : " + v.getId());
				System.out.print("student name : " + v.getName());
				System.out.println("college : " + v.getCollege());
				System.out.println("cgpa : " + v.getCgpa());
				System.out.println("year of passed out : " + v.getYear());
			}
				
		
			}
		//update the student detail//
		
		public void update(){
			System.out.println("Which student Name  would you like to update?");
			Scanner scanner=new Scanner(System.in);
			String n=scanner.next();
			Iterator<Value> itr = v1.iterator();
			while (itr.hasNext()) {

				Value ve= itr.next();
	
				if (ve.getName().contains(n)) {

					Value obj = new Value();
					
					System.out.println("Enter student Id : ");
					obj.setId(scanner.nextInt());
					
					System.out.println("Enter student Name : ");
					obj.setName(scanner.next());
					
					System.out.println("Enter College name : ");
					obj.setCollege(scanner.next());

					System.out.println("Enter cgpa : ");
					obj.setCgpa(scanner.nextFloat());
					
					System.out.println("Enter student passedout year: ");
					obj.setYear(scanner.nextInt());
					
					v1.add(obj);
					System.out.println("Detail updated sucessfully");
				}
				else
				{
					System.out.println("Enter the valid student Id");
					exit();
				}

			}}
		//deleting the student detail//
		public void remove(){
			System.out.println("Which student Name would you like to delete?");
			Scanner scanner=new Scanner(System.in);
			String n = scanner.next();
			Iterator<Value> itr = v1.iterator();
			while (itr.hasNext()) {
			Value v = itr.next();
				if (v.getName().contains(n)) {
					itr.remove();
					System.out.println("Successfully Deleted");
				}else
				{
					System.out.println("Enter the vaild Id ");
				}

			}}
		// exit //
		public void exit() {
			System.out.println("The operation is completed");
			System.exit(0);
		}

		
	
public static void main(String[] args)
{
	Studentdetail sd=new Studentdetail();
	sd.menu();
	
}
}

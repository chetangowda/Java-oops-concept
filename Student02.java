
public class Student02 {
		 int rollno;  
		 String name;  
		  
		 void insertRecord(int r, String n){  //method  
		  rollno=r;  
		  name=n;  
		 }  
		  
		 void displayInformation(){System.out.println(rollno+" "+name);}//method  
		  
		 public static void main(String args[]){  
		  Student02 s1=new Student02();  
		  Student02 s2=new Student02();  
		  
		  s1.insertRecord(111,"chetan");  
		  s2.insertRecord(222,"chetan gowda");  
		  
		  s1.displayInformation();  
		  s2.displayInformation();  
		  
		 }  
	

}

class Student{
    //parameterized constructor
    int rollno;
    String name;
    Student(String n ,int r)
    {
        name = n;   
        rollno = r;
    }
    void get(){
        System.out.println(name +" "+rollno);
    }

    // Default constructor
    // student()
    // {
    //      rollno=123;
    //      name="Praveen";
    // }
  
    //Method
    // void display()
    // {
    //     System.out.println(rollno+" "+name);
    // }
  
    public class Sample{
        public static void main(String[] args) {
    
            Student s=new Student("Indhu",209);
            s.get();
            // Student s=new Student();`
            // s.display();
        
        }

    }
}

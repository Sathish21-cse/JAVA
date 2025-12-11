import java.util.*;

public class HandlerClass
{
    static int id=1;
    private HashMap<Integer,Student> studentList=new HashMap<>();
    Scanner sc;
    HandlerClass(Scanner sc)
    {
        this.sc=sc;
    }
    public void addStudent(Student student)
    {
        studentList.put(student.getId(),student);
        System.out.println("Student Successfully Added");
    }
    public void removeById()
    {
        System.out.println("Enter the Student ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        if(studentList.containsKey(id))
        {
            studentList.remove(id);
            System.out.println("Student removed Successfully !");
        }
        else System.out.println("No Student Found !");
//        for(Student s:studentList)
//        {
//            if(s.getId()==id)
//            {
//                studentList.remove(s);
//                System.out.println("Student rempoved Successfully !");
//                return;
//            }
//        }
//        System.out.println("Student not found ! ");

    }
    public void showStudents()
    {
        for(Map.Entry<Integer,Student> it:studentList.entrySet())
        {
            System.out.println(it.getValue());
        }
//        for(Student s:studentList)
//        {
//            System.out.println(s);
//        }
    }
    public Student createStudent(int id,String name,int year,String dept)
    {
        return new Student(id,name,year,dept);
    }

    public void updateById()
    {
        System.out.println("Enter the Student ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        Student student=null;
        if(studentList.containsKey(id)) student=studentList.get(id);
//        for(Student s:studentList)
//        {
//            if(s.getId()==id)
//            {
//                student=s;
//            }
//        }
        if(student==null)
        {
            System.out.println("No Such Student found !! ");
            return;
        }
        else
        {
            System.out.println("Enter the student name: ");
            String name=sc.nextLine();
            System.out.println("Enter the student dept: ");
            String dept= sc.nextLine();
            System.out.println("Enter the Student year: ");

            int year=sc.nextInt();
            student.setName(name);
            student.setDept(dept);
            student.setYear(year);
        }
        System.out.println("Student details Updated Successfully !");
    }

    public void Register()
    {
        System.out.println("Enter the student name: ");
        String name=sc.nextLine();
        System.out.println("Enter the student dept: ");
        String dept= sc.nextLine();
        System.out.println("Enter the Student year: ");
        int year=sc.nextInt();

        Student s=createStudent(id++,name,year,dept);
        addStudent(s);
    }

}

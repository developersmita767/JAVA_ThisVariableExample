class Student{
    int rollNum;
    String name;
    int age;
    double marks;
    double percentage;
    int totalMark=600;
    String extraActivity;
    Student(int rollNum,String name,int age,int marks){
        System.out.println("Inside Student constructor 1");
        this.rollNum =rollNum;
        this.name=name;
       this.age=age;
        this.marks=marks;
    }
    Student(int rollNum,String name,int age,int marks,String extraActivity){
        this(rollNum,name,age,marks);
        System.out.println("Inside Student constructor 2");
        this.extraActivity=extraActivity;
        
    }
    void calculateGrade(){
        calculatePercentage();
        if(percentage>80){
            System.out.println("Grade A");
        }else if(percentage>60){
            System.out.println("Grade B");
        }else {
            System.out.println("Grade C");
        }
    }
    void calculatePercentage(){
        this.percentage = (this.marks/600)*100;
        System.out.println("Percentage="+this.percentage);
    }
    
}
public class ThisVariableTest{
    public static void main(String[] ar){
        //Student s=new Student(1,"Ram",10,480);
        //System.out.println("Name:"+s.name);
        //System.out.println("Roll number:"+s.rollNum);
        //System.out.println("Age:"+s.age);
        //s.calculateGrade();
         Student s2=new Student(1,"Biju",10,420,"Cricket");
         System.out.println("Name:"+s2.name);
         System.out.println("Name:"+s2.extraActivity);
    }
}
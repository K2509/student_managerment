import java.util.Scanner;

class Student{
    int id;
    String name;
    String stu_class;
    Scanner sc = new Scanner(System.in);

    public Student(){
        System.out.print("Enter student's name: ");
        this.name = sc.nextLine();
        System.out.printf("Enter %s's ID: ", this.name);
        this.id = sc.nextInt(); sc.nextLine();
        System.out.printf("Enter %s's class: ", this.name);
        this.stu_class = sc.nextLine();
    }
    public void print(){
        System.out.printf("%d. %s is in class %s\n", this.id, this.name, this.stu_class);
    }
}

public class Student_info{
    public static void main(String[] args) {
        Student[] stu_list = new Student[5];

        for (byte i = 1; i < 3; i++){
            stu_list[i] = new Student();
        }
        for (byte i = 1; i < 3; i++){
            stu_list[i].print();
        }
    }
}

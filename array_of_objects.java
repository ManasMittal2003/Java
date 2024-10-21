import java.util.Scanner;
class stu {
    String name;
    int age;
    public void setter(String n, int a){
        name = n;
        age = a;
    }
    public void getter(){
        System.out.print("Name: "+name+" ");
        System.out.println("Age: "+age);
    }
}

public class array_of_objects {
    public static void main(String args[]){
        stu students[] = new stu[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<students.length;i++){
            students[i] = new stu();
            System.out.println("Enter details of " + (i+1) + " student: ");
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            students[i].setter(name,age);
        }
        for(int i=0;i<students.length;i++){
            students[i].getter();
        }
    }
}

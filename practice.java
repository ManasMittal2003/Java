class calculator {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public String greeting(String name){
        return "Hello "+name;
    }
}
public class practice {
    public static void main(String a[]) {
        calculator obj = new calculator();
        // System.out.println(obj.add(2,3));
        String str = obj.greeting("Manas");
        System.out.println(str);
    }
}

class temp {
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
public class overloading {
    public static void main(String a[]){
        temp obj = new temp();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3,4));
    }
}

//add method is overloaded
//one add method accepts two params and other accepts 3 params
//we can do overloading by changing number of params and also by making same number of params 
//but of different types.
//if you are trying to do overloading by same params but different return type even then it
//will not work it has to be done using params only.

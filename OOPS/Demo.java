class Calculator{
    int num = 5;
    public int add(int n1, int n2){
       // System.out.println(num);
     return n1+n2;
    }


   
}
public class Demo {
    public static void main (String args[]) {
     int data =10;
     Calculator cal = new Calculator();
     Calculator cal1 = new Calculator();
    int r1 = cal.add(3,4);
    cal.num = 15;
    System.out.println(cal1.num);
    System.out.println(cal.num);
    }
}    
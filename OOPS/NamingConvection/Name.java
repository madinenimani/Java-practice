class C{
    public C() {
        System.out.println("object created");
    }
    public void show() {
        System.out.println("in A show");
    }

}

public class Name{
    public static void main (String args[]){
      new C().show();
      new C().show();
    }
}
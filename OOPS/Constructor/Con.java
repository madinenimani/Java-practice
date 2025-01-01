class Human{
    private int age;
    private String name;
  /*   public Human(){
        age  = 19;
        name = "kanta";
        
        //System.out.println("in constructor");
    }
    public Human(int a , String n){
        age = a;
        name = n;
    } */
    public Human(int age , String name){
        this.age = age;
        this.name = name;
    }
    public int getage(){
     return age;
    } 
    public void setage(int age){
    this.age = age;
    }
    public String getname(){
     return name;
    }
    public void setname(String name){
     this.name = name;
    }
 
 }
 
 public class Con{
     public static void main (String args[]){
     // Human hu = new Human();
      Human hu1 = new Human(9,"mani");
      //hu.name = "mani";
     // System.out.println(hu.getage()+ ":" + hu.getname());
      System.out.println(hu1.getage()+ ":" + hu1.getname());
     // hu.setage(20);
      //hu.setname("mani");
      //System.out.println(hu.getage()+ ":" + hu.getname());
 }
}
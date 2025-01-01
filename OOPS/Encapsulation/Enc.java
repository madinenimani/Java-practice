class Human{
   private int age;
   private String name;

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

public class Enc{
    public static void main (String args[]){
     Human hu = new Human();
     //hu.name = "mani";
     hu.setage(20);
     hu.setname("mani");
     System.out.println(hu.getage());
     System.out.println(hu.getname());
    }
}
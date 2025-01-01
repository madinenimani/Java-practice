class Mobile{
  String brand;
  int price;
  static String name;
  static {
 name = "phone";
 System.out.println("in static block");

  }

  public Mobile()
  {
   brand = "";
   price = 200;
   name = "phone";
   System.out.println("in constractor");
  }
  public static void show1(Mobile mob1){
 
   System.out.println(mob1.brand +":" + mob1.price +":" +name);
  }
 public void show(){
    System.out.println(brand + ":"  + price + ":" + name);
 }
}
public class Stat{
    public static void main (String args[]) throws ClassNotFoundException{
    Mobile mob = new Mobile();
    mob.brand = "mi";
    mob.price = 18000;
    Mobile.name = "artphone";
   
    



    Mobile mob1= new Mobile();
    mob1.brand = "infinx";
    mob1.price = 150000;
    Mobile.name = "phone";
    
    mob.show();
 Mobile.show1(mob1);
 }
}
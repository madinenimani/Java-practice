public class Pro {
    public static void main (String args[]) {
       /*  String name = "mani";
        System.out.println(name);
        System.out.println("hello " + name);
        System.out.println(name.charAt(2));
        System.out.println(name.concat("kanta"));
        String name = "mani";
        name = name + "kanta";
        System.out.println("hello " + name);
        String s1 = "Mani";
        String s2 = "Mani";
        System.out.println(s1 == s2); */
        StringBuffer sb = new StringBuffer("manikanta");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" madineni");
        sb.deleteCharAt(10);
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
        }
}
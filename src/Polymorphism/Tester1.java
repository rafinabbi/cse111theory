package Polymorphism;

public class Tester1{
  public static void main(String[] args){
    Gandalf var1 = new Frodo();
    Gandalf var2 = new Bilbo();
    Gandalf var3 = new Gandalf();
    Object var4 = new Bilbo();
    Bilbo var5 = new Frodo();
    Object var6 = new Gollum();
    
//    System.out.println(var1.name);
//    System.out.println(var2.name);
//   System.out.println(var3.name);
//    System.out.println(var4.name);
//    System.out.println(var5.name);
//    System.out.println(var6.name);
    //var1.method1();
    //var2.method1();
//    var4.method1();
//    var6.method1();
//    var1.method2();
//    var3.method2();
//    var4.method2();
//    var5.method2();
//    var6.method2();
// //   ((Frodo)var4).method3();
  //  ((Frodo)var6).method2();     
  //  ((Gollum)var1).method3();     
  //  ((Gollum)var4).method1();       
    //((Gandalf)var1).method2();
 //   ((Frodo)var4).method1();       
  // ((Gollum)var6).method2();
   ((Gandalf)var2).method1();
 //   ((Bilbo)var6).method2();       
  //  ((Frodo)var1).method3();       
  //  ((Gandalf)var5).method3();
    //((Gandalf)var2).method1();
//    ((Gandalf)var1).method1();
  }
}
class Bilbo extends Gandalf{
  public void method1(){
    System.out.println("Bilbo 1");
    System.out.println(super.name+" 1");
  }
}
class Frodo extends Bilbo{
  public String name = "Frodo";
  public void method1(){
    System.out.println(super.name+" 1");
    System.out.println("Frodo 1");
    super.method1();
  }
  public void method3(){
    System.out.println(this.name+" 3");
    System.out.println("Frodo 3");
  }

}
class Gandalf{
  public String name = "Gandalf";
  public void method1(){
    System.out.println("Gandalf 1");
  }
  public void method2(){
    System.out.println("Gandalf 2");
    method1();
    System.out.println(name+" 2");
  }
}
class Gollum extends Gandalf{
  public String name = "Gollum";
  public void method3(){
    System.out.println("Gollum 3");
    this.method2();
  }
}
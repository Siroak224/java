package a;
 import b.b;
 public class test {
 public static void main(String []args) {
 a ab=new a();
 ab.defaultMethod();
 ab.protectedMethod();
 ab.publicMethod();
 b ba=new b();
 ba.publicMethod();
 }
 }
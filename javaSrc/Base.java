package javaSrc;

public class Base {
    void printMe(Base b) {
        b.doPrint();
    }

    public void doPrint() {
        System.out.println("Base....");
    }
}

class Child extends Base {
    public void doPrint() {
        System.out.println("Child.....");
    }

    public static void main(String[] args) {
        Child child = new Child();
        Base base = new Child();
        Base base1 = new Base();

        child.doPrint();
        base.doPrint();
        base1.doPrint();


        String str1 = "str1";
        String str2 = new String("str1");

        if(str1 == str2) {
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 != str2");
        }

        String str3 = "str1";

        if(str1 == str3) {
            System.out.println("str3");
        } else {
            System.out.println("str1");
        }
    }
}
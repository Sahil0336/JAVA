package com.Sahil;
class Customer{
    String name;
    int age,ac_no;
    void SetData(String n,int a,int ac){
        name =n;
        age =a;
        ac_no = ac;
    }
    void getData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("A/c no:"+ac_no);
    }
}
public class CustomerDetails {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        c1.SetData("Rana",21,2110);
        c2.SetData("Amit",22,21110);
        c1.getData();
        c2.getData();
    }
}

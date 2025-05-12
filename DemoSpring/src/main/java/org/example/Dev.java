package org.example;

public class Dev {

    public Dev() {
        System.out.println("Dev is important");
    }

    private Laptop laptop;

    int age;

    public Dev(Laptop laptop){
        this.laptop = laptop;
        System.out.println("Constructor is compiling...");
    }
    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void  build()
    {
        System.out.println("Coding is imp to do");
        laptop.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

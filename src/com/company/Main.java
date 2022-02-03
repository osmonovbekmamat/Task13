package com.company;


public class Main {

    public static void main(String[] args) {
        Popugai popugai = new Popugai();
        popugai.setAty("ПАПУГАЙ.");
        popugai.setJashy(15);
        popugai.setSvety("ЖАШЫЛ.");
        popugai.setJashagan_jeri("КЫРГЫЗСТАН.");
        System.out.println("АТЫ: " + popugai.getAty() + "\n" + "ЖАШЫ: " + popugai.getJashy() + "\n" +
                "СВЕТИ: " + popugai.getSvety() + "\n" + "ЖАШАГАН ЖЕРИ: " + popugai.getJashagan_jeri());

        System.out.println("+------------------------------------------------------------------------------+");

        Balyk balyk = new Balyk();
        balyk.setAty("ФАРЕЛЬ.");
        balyk.setUzunu(0.8);
        balyk.setEmne_kylat("СУУДА СУЗОТ.");
        balyk.setJashy(2);
        System.out.println("БАЛЫКТЫН АТЫ: " + balyk.getAty() + "\n" + "БАЛЫКТЫН УЗУНУ: " + balyk.getUzunu() + "\n"
               + "БАЛЫК ЭМНЕ КЫЛАТ? " + balyk.getEmne_kylat() + "\n" + "БАЛЫКТЫН ЖАШЫ: " + balyk.getJashy());

        System.out.println("------------------------------------------------------------------------------+");

        Myshyk myshyk = new Myshyk();
        myshyk.setAty("МАША.");
        myshyk.setColor("КАРА.");
        myshyk.setJashy(6);
        myshyk.setParodasy("АМЕРИКАНСКИЙ.");
        System.out.println("МЫШЫКТЫН АТЫ: " + myshyk.getAty() + "\n" + "СВЕТИ: " + myshyk.getColor() + "\n" +
                "МЫШЫКТЫН ЖАШЫ: " + myshyk.getJashy() + "\n" + "ПАРОДАСЫ: " + myshyk.getParodasy());

        System.out.println("------------------------------------------------------------------------------+");

        Dog dog = new Dog();
        dog.setName("XОТИКО.");
        dog.setColor("АК.");
        dog.setParody("AЛАБАЙ.");
        dog.setAge(12);
        System.out.println("AТЫ: " + dog.getName() + "\n" + "СВЕТИ: " + dog.getColor() + "\n" + "ПАРОДАСЫ: " +
                dog.getParody() + "\n" + "ЖАШЫ: " + dog.getAge());

    }

}


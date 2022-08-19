package scollMagic;

import java.util.Arrays;

public class Griffindor extends Hogwards {

    private int nobility;
    private int honour;
    private int bravery;
    private String name;

    public Griffindor(int conjure, int transgress, int nobility, int honour, int bravery, String name) {
        super(conjure, transgress);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
        this.name = name;
    }

    @Override
    public int compareCharacteristic() {
        int sum = 0;
        sum += getNobility() + getHonour() + getBravery();
        return sum;
    }

    public void compareCharacteristic(Griffindor student_1, Griffindor student_2) {
        if(student_1.compareCharacteristic() > student_2.compareCharacteristic()) {
            System.out.println(student_1.getName() + " лучший Гриффиндорец, чем " + student_2.getName());
        } else {
            System.out.println(student_2.getName() + " лучший Гриффиндорец, чем " + student_1.getName());
        }
    }


    @Override
    public void descriptionStudent() {
        super.descriptionStudent();
        System.out.println("Качества студента" + " " + getName() + " " + " факультета Гриффиндоров: " +
                getNobility() + " " + getHonour() + " " + getBravery());
    }







    public int getNobility() {
        return nobility;
    }



    public int getHonour() {
        return honour;
    }


    public int getBravery() {
        return bravery;
    }


    @Override
    public String getName() {
        return name;
    }
}

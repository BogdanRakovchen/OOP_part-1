package scollMagic;

import java.util.zip.ZipEntry;

public class Hogwards implements DescriptionStudent {
    private int conjure;
    private int transgress;

    public Hogwards(int conjure, int transgress) {
        this.conjure = conjure;
        this.transgress = transgress;
    }



    public void descriptionStudent() {
        System.out.println("Описание студента:");
        System.out.println("Качества всех студентов: " + getConjure() + " " + getTransgress());
    }

    public int compareCharacteristic() {
        int sum = 0;
        return sum;
    }

    public String  getName() {
        return " ";
    }
    public void compareCharacteristic(Hogwards s1, Hogwards s2) {
        if (s1.compareCharacteristic() > s2.compareCharacteristic()) {
            System.out.println(s1.getName() + " лучший Гриффиндорец, чем " + s2.getName());
        } else {
            System.out.println(s2.getName() + " лучший Гриффиндорец, чем " + s1.getName());
        }
    }


    public int getConjure() {
        return conjure;
    }


    public int getTransgress() {
        return transgress;
    }

    public void comparePowerConjureAndTransgress(Griffindor griffindor, Kogtevran kogtevran) {
        if (griffindor.getConjure() > kogtevran.getConjure() && griffindor.getTransgress() > kogtevran.getTransgress()) {
            System.out.println(griffindor.getName() + " обладает бОльшей мощностью магии, чем " + kogtevran.getName());
        } else {
            System.out.println(kogtevran.getName() + " обладает бОльшей мощностью магии, чем " + griffindor.getName());

        }
    }
}

package scollMagic;
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

    public int compareCharacteristic() {
        int sum = 0;
        sum += getNobility() + getHonour() + getBravery();
        System.out.println(sum);
        return sum;
    }


    public void descriptionStudent() {
        System.out.println("Описание студента:");
        System.out.println("Качества всех студентов: " + getConjure() + " " + getTransgress());
        System.out.println("Качества студента" + " " + getName() + " " + " факультета Гриффиндоров: " +
                getNobility() + " " + getHonour() + " " + getBravery());
    }




    public void compareCharacteristic(Griffindor student_1, Griffindor student_2) {
        if(student_1.compareCharacteristic() > student_2.compareCharacteristic()) {
            System.out.println(student_1.getName() + " лучший Гриффиндорец, чем " + student_2.getName());
        } else {
            System.out.println(student_2.getName() + " лучший Гриффиндорец, чем " + student_1.getName());
        }
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



    public String getName() {
        return name;
    }
}

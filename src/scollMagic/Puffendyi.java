package scollMagic;

public class Puffendyi extends Hogwards {

    private String name;
    private int industrious;
    private int faithful;
    private int honest;

    public Puffendyi(int conjure, int transgress, String name, int industrious, int faithful, int honest) {
        super(conjure, transgress);
        this.name = name;
        this.industrious = industrious;
        this.faithful = faithful;
        this.honest = honest;
    }


    @Override
    public int compareCharacteristic() {
        int sum = 0;
        sum += getIndustrious() + getFaithful() + getHonest();
        return sum;
    }


    @Override
    public void descriptionStudent() {
        super.descriptionStudent();
        System.out.println("Качества студента" + " " + getName() + " " + "факультета Пуфендуев: " +
                getIndustrious() + " " + getFaithful() + " " + getHonest());
    }

    @Override
    public void compareCharacteristic(Hogwards student_1, Hogwards student_2) {
        if(student_1.compareCharacteristic() > student_2.compareCharacteristic()) {
            System.out.println(student_1.getName() + " лучший Пуфендуй, чем " + student_2.getName());
        } else {
            System.out.println(student_2.getName() + " лучший Пуфендуй, чем " + student_1.getName());
        }
    }

    public int getIndustrious() {
        return industrious;
    }

    public String getName() {
        return name;
    }



    public int getFaithful() {
        return faithful;
    }



    public int getHonest() {
        return honest;
    }


}

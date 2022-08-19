package scollMagic;

public class Kogtevran extends Hogwards {

    private String name;
    private int intelligent;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Kogtevran(int conjure, int transgress, String name, int intelligent, int wise, int witty, int fullOfCreativity) {
        super(conjure, transgress);
        this.name = name;
        this.intelligent = intelligent;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }


    @Override
    public int compareCharacteristic() {
        int sum = 0;
        sum += getIntelligent() + getWise() + getWitty() + getFullOfCreativity();
        return sum;
    }


    @Override
    public void descriptionStudent() {
        super.descriptionStudent();
        System.out.println("Качества студента" + " " + getName() + " " +  "факультета  Kогтевранов: " +
                getIntelligent() + " " + getWise() + " " + getWitty() + " " + getFullOfCreativity() );
    }

    @Override
    public void compareCharacteristic(Hogwards student_1, Hogwards student_2) {
        if(student_1.compareCharacteristic() > student_2.compareCharacteristic()) {
            System.out.println(student_1.getName() + " лучший Когтевран, чем " + student_2.getName());
        } else {
            System.out.println(student_2.getName() + " лучший Когтевран, чем " + student_1.getName());
        }
    }


    public int getIntelligent() {
        return intelligent;
    }


    public int getWise() {
        return wise;
    }


    public int getWitty() {
        return witty;
    }


    public int getFullOfCreativity() {
        return fullOfCreativity;
    }



    public String getName() {
        return name;
    }

}

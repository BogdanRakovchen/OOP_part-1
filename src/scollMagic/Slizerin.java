package scollMagic;

public class Slizerin extends Hogwards {

    private String name;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(int conjure, int transgress, String name, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(conjure, transgress);
        this.name = name;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }


    @Override
    public int compareCharacteristic() {
        int sum = 0;
        sum += getCunning() + getDetermination() + getAmbition() + getLustForPower();
        return sum;
    }

    @Override
    public void descriptionStudent() {
        super.descriptionStudent();
        System.out.println("Качества студента" + " " + getName() + " " + "факультета Слизеринов: " +
                getCunning() + " " + getDetermination() + " " + getAmbition() + getLustForPower());
    }

    @Override
    public void compareCharacteristic(Hogwards student_1, Hogwards student_2) {
        if(student_1.compareCharacteristic() > student_2.compareCharacteristic()) {
            System.out.println(student_1.getName() + " лучший Слизерин, чем " + student_2.getName());
        } else {
            System.out.println(student_2.getName() + " лучший Слизерин, чем " + student_1.getName());
        }
    }


    public int getCunning() {
        return cunning;
    }

    public String getName() {
        return name;
    }



    public int getDetermination() {
        return determination;
    }



    public int getAmbition() {
        return ambition;
    }



    public int getResourcefulness() {
        return resourcefulness;
    }



    public int getLustForPower() {
        return lustForPower;
    }


}

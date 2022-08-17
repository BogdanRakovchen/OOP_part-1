package scollMagic;

import java.util.zip.ZipEntry;

public class Hogwards {
    private int conjure;
    private int transgress;

    public Hogwards(int conjure, int transgress) {
        this.conjure = conjure;
        this.transgress = transgress;
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

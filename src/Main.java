import scollMagic.*;
public class Main {
    public static void main(String[] args) {

        Hogwards hogwards = new Hogwards(1,2);

        Griffindor harreyPotter = new Griffindor(1,5, 6, 12, 34, "Гарри");
        Griffindor hermionaGreidger = new Griffindor(2, 4, 7, 12, 21, "Гермона");
        Griffindor ronYizli = new Griffindor(1,4,2, 23, 12, "Рон");

        hogwards.descriptionStudent();
        harreyPotter.descriptionStudent();
        hogwards.descriptionStudent();
        hermionaGreidger.descriptionStudent();
        hogwards.descriptionStudent();
        ronYizli.descriptionStudent();

        harreyPotter.compareCharacteristic(harreyPotter, hermionaGreidger);
        harreyPotter.compareCharacteristic(hermionaGreidger, ronYizli);
        harreyPotter.compareCharacteristic(harreyPotter, ronYizli);


        System.out.println();


        Slizerin drakoMalfoi = new Slizerin(12, 23, "Драко", 3, 12, 32, 14, 32);
        Slizerin grekhemMontegu = new Slizerin(21, 32, "Грекхэм", 43, 12, 33, 43, 12);
        Slizerin gregoriGoil = new Slizerin(12, 42,"Грегори", 43, 12, 55, 21, 34);

        drakoMalfoi.descriptionStudent();
        grekhemMontegu.descriptionStudent();
        gregoriGoil.descriptionStudent();

        drakoMalfoi.compareCharacteristic(drakoMalfoi, grekhemMontegu);
        drakoMalfoi.compareCharacteristic(grekhemMontegu, gregoriGoil);
        drakoMalfoi.compareCharacteristic(drakoMalfoi, gregoriGoil);

        System.out.println();




        Puffendyi zakhariaSmith = new Puffendyi(12, 43, "Захария", 22, 12, 32);
        Puffendyi sedricDiggori = new Puffendyi(21, 44, "Седрик", 54, 74, 21);
        Puffendyi dgastinFinFletchli = new Puffendyi(43, 55, "Джастин", 12, 53, 43);

        zakhariaSmith.descriptionStudent();
        sedricDiggori.descriptionStudent();
        dgastinFinFletchli.descriptionStudent();

        zakhariaSmith.compareCharacteristic(zakhariaSmith, sedricDiggori);
        zakhariaSmith.compareCharacteristic(sedricDiggori, dgastinFinFletchli);
        zakhariaSmith.compareCharacteristic(zakhariaSmith, dgastinFinFletchli);

        System.out.println();


        Kogtevran chgoyChang = new Kogtevran(12, 43, "Чой Чанк", 43, 42, 12, 23);
        Kogtevran padmaPatil = new Kogtevran(32, 12, "Падма", 67, 21, 32, 32);
        Kogtevran markusBelbi = new Kogtevran(12, 43, "Маркус", 22, 42, 34, 12);


        chgoyChang.descriptionStudent();
        padmaPatil.descriptionStudent();
        markusBelbi.descriptionStudent();

        chgoyChang.compareCharacteristic(chgoyChang, padmaPatil);
        chgoyChang.compareCharacteristic(padmaPatil, markusBelbi);
        chgoyChang.compareCharacteristic(chgoyChang, markusBelbi);

        System.out.println();

        hogwards.comparePowerConjureAndTransgress(harreyPotter, chgoyChang);



    }
}
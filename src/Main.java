public class Main {
        public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter",
                45,
                56,
                36,
                56,
                78);
        Gryffindor hermionaGrander = new Gryffindor("Hermiona Grander",
                56,
                67,
                34,
                45,
                89);
        Gryffindor ronMontague = new Gryffindor("Ron Montague",
                56,
                34,
                11,
                45,
                76);
            System.out.println(hermionaGrander);
            System.out.println(harryPotter);
            System.out.println(ronMontague);
            hermionaGrander.compare(harryPotter);
            System.out.println();
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy",
                56,
                67,
                78,
                32,
                56,
                90,
                11);
        Slytherin grahamMontague = new Slytherin("Graham Montague",
                45,
                90,
                10,
                35,
                55,
                88,
                100);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle",
                66,
                88,
                44,
                99,
                34,
                67,
                77);
            System.out.println(dracoMalfoy);
            System.out.println(grahamMontague);
            System.out.println(gregoryGoyle);
            gregoryGoyle.compare(grahamMontague);
            System.out.println();
        Kogtevran zhouChang = new Kogtevran("Zhou Chang",
                67,
                83,
                91,
                56,
                7,
                56);
        Kogtevran padmaPatil = new Kogtevran(" Padma Patil",
                89,
                34,
                11,
                61,
                93,
                55);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby",
                74,
                35,
                1,
                96,
                37,
                12);
            System.out.println(zhouChang);
            System.out.println(padmaPatil);
            System.out.println(marcusBelby);
            marcusBelby.compare(padmaPatil);
            System.out.println();
        Hufflepuff zahariahSmith = new Hufflepuff("Zaharih Smith",
                67,
                43,
                15,
                64,
                6);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",
                99,
                12,
                86,
                34,
                87);
        Hufflepuff justinFihchFletchley = new Hufflepuff("Justin Fihch - Fletchley",
                54,
                82,
                4,
                2,
                67);
            System.out.println(cedricDiggory);
            System.out.println(zahariahSmith);
            System.out.println(justinFihchFletchley);
            cedricDiggory.compare(zahariahSmith);
            System.out.println();
            zhouChang.compareStudents(harryPotter);













        }
}
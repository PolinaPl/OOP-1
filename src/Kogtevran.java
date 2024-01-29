public class Kogtevran extends HogwardtsStudent {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String name, int magicPower, int trancgresDistance, int mind, int wisdom, int wit, int creation) {
        super(name, magicPower, trancgresDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    public void compare (Kogtevran second) {
        int firstSum = this.getMind() + this.getWisdom() + this.getWit() + this.getCreation();
        int secondSum = second.getMind() + second.getWisdom() + second.getWit() + second.getCreation();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Когтевранин, чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Когтевранин, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равны по силе.");
        }
    }
    @Override
    public String toString() {
        return "Kogtevran{" +
                getName() +", " +
                "сила магии " + getMagicPower() +", " +
                "трансгрессия " + getTrancgresDistance() +", " +
                "mind=" + mind +", " +
                "wisdom=" + wisdom +", " +
                "wit=" + wit +", " +
                "creation=" + creation +
                '}';
    }
}

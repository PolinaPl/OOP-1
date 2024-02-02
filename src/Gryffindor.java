import java.sql.SQLOutput;

public class Gryffindor extends HogwardtsStudent{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int trancgresDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, trancgresDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
public void compare (Gryffindor second) {
        int firstSum = this.getNobility() + this.getHonor() + this.getBravery();
        int secondSum = second.getNobility() + second.getHonor() + second.getBravery();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равны по силе.");
        }

}
    @Override
    public String toString() {
        return "Gryffindor{" +
                getName() +", " +
                "сила магии " + getMagicPower() +", " +
                "трансгрессия " + getTrancgresDistance() +", " +
                "nobility=" + nobility +", " +
                "honor=" + honor +", " +
                "bravery=" + bravery +
                '}';
    }
}

public class Hufflepuff extends HogwardtsStudent {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int trancgresDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, trancgresDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void compare (Hufflepuff second) {
        int firstSum = this.getHardWork() + this.getLoyalty() + this.getHonesty();
        int secondSum = second.getHardWork() + second.getLoyalty() + second.getHonesty();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равны по силе.");
        }

    }
    @Override
    public String toString() {
        return "Hufflepuff{" +
                getName() +", " +
                "сила магии " + getMagicPower() +", " +
                "трансгрессия " + getTrancgresDistance() +", " +
                "hardWork=" + hardWork +", " +
                "loyalty=" + loyalty +", " +
                "honesty=" + honesty  +
                '}';
    }
}

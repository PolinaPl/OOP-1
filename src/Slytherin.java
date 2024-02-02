public class Slytherin extends HogwardtsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int powerLust;

    public Slytherin(String name, int magicPower, int trancgresDistance, int cunning, int determination, int ambition, int resource, int powerLust) {
        super(name, magicPower, trancgresDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getPowerLust() {
        return powerLust;
    }

    public void setPowerLust(int powerLust) {
        this.powerLust = powerLust;
    }

    public void compare(Slytherin second) {
        int firstSum = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResource() + this.getPowerLust();
        int secondSum = second.getCunning() + second.getDetermination() + second.getAmbition() + second.getResource() + second.getPowerLust();
        if (firstSum > secondSum) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + second.getName() + " равны по силе.");
        }

    }

    @Override
    public String toString() {
        return "Slytherin{" +getName() +", " +
                "сила магии " + getMagicPower() +", " +
                "трансгрессия " + getTrancgresDistance() +", " +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resource=" + resource +
                ", powerLust=" + powerLust +
                '}';
    }
}


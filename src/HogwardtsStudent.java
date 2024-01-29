public class HogwardtsStudent {
    private String name;
    private int magicPower;
    private int trancgresDistance;

    public HogwardtsStudent(String name, int magicPower, int trancgresDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.trancgresDistance = trancgresDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrancgresDistance() {
        return trancgresDistance;
    }

    public void setTrancgresDistance(int trancgresDistance) {
        this.trancgresDistance = trancgresDistance;
    }
    public void compareStudents (HogwardtsStudent second) {
        if (this.getMagicPower() > second.getMagicPower()) {
            System.out.println(this.getName() + " обладает большей силой магии, чем " + second.getName());
        } else if (second.getMagicPower() > this.getMagicPower()) {
            System.out.println(second.getName() + " обладает большей силой магии, чем " + this.getName());
        } else {
            System.out.println("Студенты равны по силе магии.");
        }
        if (this.getTrancgresDistance() > second.getTrancgresDistance()) {
            System.out.println(this.getName() + " обладает большим расстоянием трансгрессии, чем " + second.getName());
        } else if (second.getTrancgresDistance() > this.getTrancgresDistance()) {
            System.out.println(second.getName() + " обладает большим расстоянием трансгрессии, чем " + this.getName());
        } else {
            System.out.println("Студенты равны по расстоянию трансгрессии.");
        }
    }


    @Override
    public String toString() {
        return "HogwardtsStudent{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", trancgresDistance=" + trancgresDistance +
                '}';
    }
}

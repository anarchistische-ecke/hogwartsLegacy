public class Slytherin extends Hogwarts {
    private int cunning;
    private int ambitious;
    private int decisive;

    public Slytherin(String name, int magicForce, int transgression, int cunning, int ambitious, int decisive) {
        super(name, magicForce, transgression);
        this.cunning = cunning;
        this.ambitious = ambitious;
        this.decisive = decisive;
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {
        var studentQualitiesOne = student1.cunning + student1.ambitious + student1.decisive;
        var studentQualitiesTwo = student2.cunning + student2.ambitious + student2.decisive;
        if (studentQualitiesOne > studentQualitiesTwo) {
            System.out.println(student1.getName() + " is a better Slytherin student, than " + student2.getName());
        } else if (studentQualitiesTwo > studentQualitiesOne) {
            System.out.println(student2.getName() + " is a better Slytherin student, than " + student1.getName());
        } else {
            System.out.println("Both students are equally good Gryffindors!");
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getDecisive() {
        return decisive;
    }

    public void setDecisive(int decisive) {
        this.decisive = decisive;
    }


    @Override
    public String toString() {
        return getName() + " has these qualities: magic force at " + getMagicForce() + ", transgression at "  + getTransgression() + ", cunning at " + cunning + ", ambition at " + ambitious + ", decisiveness at " + decisive;
    }
}


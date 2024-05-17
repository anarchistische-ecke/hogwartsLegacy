public class Gryffindor extends Hogwarts {
    private int brave;
    private int paragon;
    private int noble;

    public Gryffindor(String name, int magicForce, int transgression, int brave, int paragon, int noble) {
        super(name, magicForce, transgression);
        this.brave = brave;
        this.paragon = paragon;
        this.noble = noble;
    }

    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        var studentQualitiesOne = student1.brave + student1.paragon + student1.noble;
        var studentQualitiesTwo = student2.brave + student2.paragon + student2.noble;
        if (studentQualitiesOne > studentQualitiesTwo) {
            System.out.println(student1.getName() + " is a better Gryffindor student, than " + student2.getName());
        } else if (studentQualitiesTwo > studentQualitiesOne) {
            System.out.println(student2.getName() + " is a better Gryffindor student, than " + student1.getName());
        } else {
            System.out.println("Both students are equally good Gryffindors!");
        }
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public int getParagon() {
        return paragon;
    }

    public void setParagon(int paragon){
        this.paragon = paragon;
    }

    public int getNoble() {
        return noble;
    }

    public void setNoble(int noble) {
        this.noble = noble;
    }

    @Override
    public String toString() {
        return getName() + " has these qualities: magic force at " + getMagicForce() + ", transgression at "  + getTransgression() + ", bravery at " + brave + ", nobility at " + paragon + ", nobility at " + noble;
    }
}


public class HufflePuff extends Hogwarts {
    private int hardWorking;
    private int loyal;
    private int honest;


    public HufflePuff(String name, int magicForce, int transgression, int hardWorking, int loyal, int honest) {
        super(name, magicForce, transgression);
        this.loyal = loyal;
        this.honest = honest;
        this.hardWorking = hardWorking;
    }

    public static void compareStudents(HufflePuff student1, HufflePuff student2) {
        var studentQualitiesOne = student1.hardWorking + student1.loyal + student1.honest;
        var studentQualitiesTwo = student2.hardWorking + student2.loyal + student2.honest;
        if (studentQualitiesOne > studentQualitiesTwo) {
            System.out.println(student1.getName() + " is a better Hufflepuff student, than " + student2.getName());
        } else if (studentQualitiesTwo > studentQualitiesOne) {
            System.out.println(student2.getName() + " is a better Hufflepuff student, than " + student1.getName());
        } else {
            System.out.println("Both students are equally good Hufflepuffs!");
        }
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    @Override
    public String toString() {
        return getName() + " has these qualities: magic force at " + getMagicForce() + ", transgression at "  + getTransgression() + ", dedication to work at " + hardWorking + ", loyalty at " + loyal + ", honesty at " + honest;
    }
}

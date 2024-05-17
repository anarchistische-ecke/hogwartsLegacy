public class RavenClaw extends Hogwarts {
    private int smart;
    private int wise;
    private int creative;

    public RavenClaw(String name, int magicForce, int transgression, int smart, int wise, int creative) {
        super(name, magicForce, transgression);
        this.smart = smart;
        this.wise = wise;
        this.creative = creative;
    }

    public static void compareStudents(RavenClaw student1, RavenClaw student2) {
        var studentQualitiesOne = student1.smart + student1.wise + student1.creative;
        var studentQualitiesTwo = student2.smart + student2.wise + student2.creative;
        if (studentQualitiesOne > studentQualitiesTwo) {
            System.out.println(student1.getName() + " is a better Ravenclaw student, than " + student2.getName());
        } else if (studentQualitiesTwo > studentQualitiesOne) {
            System.out.println(student2.getName() + " is a better Ravenclaw student, than " + student1.getName());
        } else {
            System.out.println("Both students are equally good Ravenclaws!");
        }
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }


    @Override
    public String toString() {
        return getName() + " has these qualities: magic force at " + getMagicForce() + ", transgression at " + getTransgression() + ", smartness at " + smart + ", wisdom at " + wise + ", creativity at " + creative;
    }
}


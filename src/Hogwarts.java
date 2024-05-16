public class Hogwarts {
    private String name;
    private int magicForce;
    private int transgression;

    public Hogwarts(String name, int magicForce, int transgression) {
        this.name = name;
        this.magicForce = magicForce;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicForce() {
        return magicForce;
    }

    public void setMagicForce(int magicForce) {
        this.magicForce = magicForce;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public static void compareStudentsOfDifferentFaculties(Hogwarts student1, Hogwarts student2) {
        var magicalSuperiority1 = student1.magicForce + student1.transgression;
        var magicalSuperiority2 = student1.magicForce + student2.transgression;
        if (magicalSuperiority1 > magicalSuperiority2) {
            System.out.println(student1.getName() + " is a stronger wizard than " + student2.getName());
        } else if (magicalSuperiority2 > magicalSuperiority1) {
            System.out.println(student2.getName() + "is a stronger wizard than " + student2.getName());
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " are equally strong wizards!");
        }
    }
}
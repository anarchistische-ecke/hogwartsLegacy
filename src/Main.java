public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 99, 99, 10, 9, 7);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 85, 80, 9, 10, 10);
        Gryffindor ronWisley = new Gryffindor("Ron Wisley", 72, 81, 5, 6, 4);

        HufflePuff zaxhariasSmith = new HufflePuff("Zacharias Smith", 55, 60, 7, 8, 7);
        HufflePuff cedricDiggory = new HufflePuff("Cedric Diggory", 89, 88, 10, 8, 10);
        HufflePuff justinFinchFlentchley = new HufflePuff("Justin Ficnh-Fletchley", 54, 60, 10, 10, 8);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 89, 90, 10, 10, 10);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 65, 71, 1, 1, 2);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 45, 53, 2, 1, 1);

        RavenClaw choChang = new RavenClaw("Cho Chang", 89, 94, 10, 4, 8);
        RavenClaw padmaPatil = new RavenClaw("Padma Patil", 78, 75, 5, 6, 3);
        RavenClaw marcusBelby = new RavenClaw("Marcus Belby", 88, 45, 7, 8, 9);

        Gryffindor.compareStudents(ronWisley, hermioneGranger);

        Hogwarts.compareStudentsOfDifferentFaculties(choChang, cedricDiggory);

        System.out.println(dracoMalfoy.toString());

        System.out.println(padmaPatil.getName());
    }
}

public class SchoolTest {
    public static void main(String[] args) {

        //Objekte anlegen
        Student s1 = new Student("Max Mustermann", "15.03.2009", 2.0f, "4C");
        Student s2 = new Student("Tom Hofer", "2.08.2010", 3.2f, "3B");

        Teacher t1 = new Teacher("Prof. Schmidt", "12.05.1980", "Mathe, Geografie", 12);
        Teacher t2 = new Teacher("Prof. Mayer", "01.04.1990", "Deutsch", 8);

        //Ausgabe Vorher
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(t1);
        System.out.println(t2);

        //Methoden
        t2.supplierung("Englisch");
        s1.improveGrade(0.5f);
        t1.setWorkYears(t1.getWorkYears() + 1);
        s2.improveGrade(0.2f);


        //Erfahren/Bestanden
        System.out.println("Ist " + t1.getName() + " erfahren: " + t1.isExpierienced());
        System.out.println("Ist " + t2.getName() + " erfahren: " + t2.isExpierienced());

        System.out.println("Hat " + s1.getName() + " bestanden: " + s1.hasPassed());
        System.out.println("Hat " + s2.getName() + " bestanden: " + s2.hasPassed());
        System.out.println();

        //Ausgabe Nachher
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(t1);
        System.out.println(t2);
    }
}

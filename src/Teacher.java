public class Teacher {

    //------------Attribute
    private String name;
    private String birthday;
    private String subject;
    private int workYears;

    //--------------Konstruktoren

    public Teacher(){

        this("Name", "00.00.0000", "Fach", 0);
    }

    public Teacher(String name, String birthday){

        this(name, birthday, "Fach", 0);
    }

    public Teacher(String name, String birthday, String subject, int workYears){

        setName(name);
        setBirthday(birthday);
        setSubject(subject);
        setWorkYears(workYears);
    }

    //Getter/Setter

    //Name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    //Birthday
    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    //Subject
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    //workyears
    public int getWorkYears() { return workYears; }
    public void setWorkYears(int workYears) { this.workYears = workYears; }


    //------------Methoden
    public boolean isExpierienced(){ return workYears >= 10; }

    public void supplierung(String supplierFach){

        subject += ", " + supplierFach;
    }



    //ToString
    @Override
    public String toString(){
        String str;

        str = "Lehrer\n";
        str += "\t Name: " + name + "\n";
        str += "\t Geburtsdatum: " + birthday + "\n";
        str += "\t Fach: " + subject + "\n";
        str += "\t Arbeits Jahre: " + workYears + "\n";

        return str;
    }

}

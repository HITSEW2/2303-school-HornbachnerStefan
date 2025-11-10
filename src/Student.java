
public class Student {

    //--------------Attribute
    private String name;
    private String birthday;
    private float grade;
    private String schoolClass;


    //--------------Konstruktoren

    public Student(){

        this("Name", "00.00.0000", 0.0f, "Klasse");
    }

    public Student(String name, String birthday){

        this(name, birthday, 0.0f, "Klasse");
    }

    public Student(String name, String birthday, float grade, String schoolClass){

        setName(name);
        setBirthday(birthday);
        setGrade(grade);
        setSchoolClass(schoolClass);
    }

    //Getter/Setter

    //Name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    //Birthday
    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    //Grade
    public float getGrade() { return grade; }
    public void setGrade(float grade) {

        this.grade = grade;
        if (grade < 1.0){grade = 1.0f; }
        if (grade > 5.0){grade = 5.0f; }
    }

    //Class
    public String getSchoolClass() { return schoolClass; }
    public void setSchoolClass(String schoolClass) { this.schoolClass = schoolClass; }


    //------------Methoden
    public boolean hasPassed(){
        return grade <= 4.0;
    }

    public void improveGrade(float improve){
        this.grade -= improve;

        if (grade < 1.0){grade = 1.0f; }
    }


    //ToString
    @Override
    public String toString(){
        String str;

        str = "Schüler\n";
        str += "\t Name: " + name + "\n";
        str += "\t Geburtsdatum: " + birthday + "\n";
        str += "\t Note: " + grade + "\n";
        str += "\t Klasse: " + schoolClass + "\n";

        return str;
    }

}

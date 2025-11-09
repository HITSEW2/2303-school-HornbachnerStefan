import java.util.Date;

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
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public float getGrade() { return grade; }
    public void setGrade(float grade) { this.grade = grade; }

    public String getSchoolClass() { return schoolClass; }
    public void setSchoolClass(String schoolClass) { this.schoolClass = schoolClass; }


    //Methoden
    public boolean hasPassed(){
        return grade <= 4.0;
    }




    //ToString
    @Override
    public String toString(){
        String str;

        str = "Rectangle\n";
        str += "\t Name: " + name + "\n";
        str += "\t Geburtsdatum: " + birthday + "\n";
        str += "\t Note: " + grade + "\n";
        str += "\t Klasse: " + schoolClass + "\n";

        return str;
    }

}

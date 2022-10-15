public class main extends Teacher{
    protected main() {
        super("A","B","C");
    }
    public static void main(String[] args) {
        Teacher obj = new Teacher("Teacher","CET","Programming");
        valorant codybuilding = new valorant();
        //accessing the fields of parent class
        System.out.println(obj.collegeName); // Retrieve as non private
        System.out.println(obj.getDesignation()); // Retrieve as private using getter
        System.out.println(obj.getSubjectName());

        obj.setDesignation("Lecturer"); // Change value as private
        System.out.println(obj.getDesignation());
        codybuilding.agent();
        codybuilding.nationality();

        System.out.println(obj.getSubjectName()); // from sub class

        //accessing the method of parent class
        obj.does();

        // This will show an error due to private method
        // obj.does("Private");
    }
}

class Subject {
    String subject;

    public Subject() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

class Teacher extends Subject {
    //fields of parent class
    private String designation;
    String collegeName;
    String subjectName;
    String strAction;
    Subject subObj = new Subject();

    public Teacher(String designation, String collegeName, String subjectName) {
        super();

        this.designation = designation;
        this.collegeName = collegeName;
        subObj.setSubject(subjectName);
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
    public String getSubjectName() {
        return subObj.subject;
    }

    //method of parent class
    void does(){
        System.out.println("Teaching");
    }
    //overloading
    private void does(String strAction){
        this.strAction = strAction;
        System.out.println("Teaching - " + strAction);
    }
}
class valorant{
    public void agent(){
        System.out.println("Chamber");
    }
    public void nationality(){
        System.out.println("French");
    }
}
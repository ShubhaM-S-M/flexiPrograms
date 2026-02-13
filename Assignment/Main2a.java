class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void displayPerson()
    {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

class Student extends Person
{
    int studentId;

    Student(String name, int age, int studentId)
    {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudent()
    {
        displayPerson();
        System.out.println("Student Id = " + studentId);
    }
}

class GraduateStudent extends Student
{
    String researchTopic;

    GraduateStudent(String name, int age, int studentId, String researchTopic)
    {
        super(name, age, studentId);
        this.researchTopic = researchTopic;
    }

    void displayResearchDetails()
    {
        displayStudent();
        System.out.println("Research Topic = " + researchTopic);
    }
}

class Main2a
{
    public static void main(String args[])
    {
        GraduateStudent g = new GraduateStudent("Amit", 24, 501, "AI");
        g.displayResearchDetails();
    }
}
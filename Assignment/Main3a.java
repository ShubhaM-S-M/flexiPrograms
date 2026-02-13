class Staff
{
    int staffId;
    String name;

    Staff(int staffId, String name)
    {
        this.staffId = staffId;
        this.name = name;
    }

    void displayStaffDetails()
    {
        System.out.println("Staff Id = " + staffId);
        System.out.println("Name = " + name);
    }
}

class TeachingStaff extends Staff
{
    String subject;

    TeachingStaff(int staffId, String name, String subject)
    {
        super(staffId, name);
        this.subject = subject;
    }

    void displayTeachingInfo()
    {
        displayStaffDetails();
        System.out.println("Subject = " + subject);
    }
}

class NonTeachingStaff extends Staff
{
    String department;

    NonTeachingStaff(int staffId, String name, String department)
    {
        super(staffId, name);
        this.department = department;
    }

    void displayDepartmentInfo()
    {
        displayStaffDetails();
        System.out.println("Department = " + department);
    }
}

class Main3a
{
    public static void main(String args[])
    {
        TeachingStaff t = new TeachingStaff(1, "Malesha", "Java");
        t.displayTeachingInfo();

        NonTeachingStaff n = new NonTeachingStaff(2, "Shubham", "Admin");
        n.displayDepartmentInfo();
    }
}
public class UniversityInfo
{
    private String name;
    private String year;
    private int student_amount;
    private int faculty_member_amount ;
    private int faculties_amount;
    private int department_amount;

    private String facility_1;
    private String facility_2;
    private String facility_3;

    //Default Constructors

    UniversityInfo()
    {
        this.name = "";
        this.year = "";
        this.student_amount = 0;
        this.faculty_member_amount = 0;
        this.faculties_amount = 0;
        this.department_amount = 0;
        this.facility_1 = "" ;
        this.facility_2 = "" ;
        this.facility_3 = "" ;
    }

    //Custom constructor
    UniversityInfo(String name, String year, int student_amount, int faculty_member_amount, int faculties_amount, int department_amount, String facility_1, String facility_2,String facility_3)
    {
        this.name = name;
        this.year = year;
        this.student_amount = student_amount;
        this.faculty_member_amount = faculty_member_amount;
        this.faculties_amount = faculties_amount;
        this.department_amount = department_amount;
        this.facility_1 = facility_1;
        this.facility_2 = facility_2;
        this.facility_3 = facility_3;
    }

    // Setters -> sets the property value

    public void setName(String name)
    {
        this.name = name;
    }
    public void setYear(String year)
    {
        this.year = year;
    }
    public void setStudent_amount(int student_amount)
    {
        this.student_amount = student_amount;
    }
    public void setFaculty_member_amount(int faculty_member_amount)
    {
        this.faculty_member_amount = faculty_member_amount;
    }
    public void setFaculties_amount(int faculties_amount)
    {
        this.faculties_amount = faculties_amount;
    }
    public void setDepartment_amount(int department_amount)
    {
        this.department_amount = department_amount;
    }
    public void setFacility_1 (String facility_1)
    {
        this.facility_1 = facility_1;
    }
    public void setFacility_2 (String facility_2)
    {
        this.facility_2 = facility_2;
    }
    public void setFacility_3 (String facility_3)
    {
        this.facility_3 = facility_3;
    }

    // Getters -> Returns the property value

    public String getName()
    {
        return this.name;
    }
    public String getYear()
    {
        return this.year;
    }
    public int getStudent_amount()
    {
        return this.student_amount;
    }
    public int getFaculty_member_amount()
    {
        return this.faculty_member_amount;
    }
    public int getFaculties_amount()
    {
       return this.faculties_amount;
    }
    public int getDepartment_amount()
    {
        return this.department_amount;
    }
    public String getFacility_1 ()
    {
       return this.facility_1;
    }
    public String  getFacility_2 ()
    {
       return this.facility_2;
    }
    public String getFacility_3 ()
    {
        return this.facility_3;
    }



}

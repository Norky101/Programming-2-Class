public class Main {
    public static void main(String[] args)
    {
        UniversityInfo uniInfo = new UniversityInfo();

        System.out.println("Default Constructor:\n \nName: "+ uniInfo.getName() + "\nYear: "+  uniInfo.getYear() + "\nNumber of students: " + uniInfo.getStudent_amount() + "\nNumber of faculty members: "+ uniInfo.getFaculty_member_amount() + "\nNumber of faculties: "+ uniInfo.getFaculties_amount() + "\nNumber of departments: "+ uniInfo.getDepartment_amount() + "\nFacility 1: "+ uniInfo.getFacility_1() +"\nFacility 2: "+ uniInfo.getFacility_2() +"\nFacility 3: "+ uniInfo.getFacility_3() + "\n\n" );

        UniversityInfo uniinfo_custom = new UniversityInfo("Bill", "Junior", 1000, 100, 5,3, "Math", "Science", "English" );

        System.out.println("Custom Constructor:\n \nName: "+ uniinfo_custom.getName() + "\nYear: "+  uniinfo_custom.getYear() + "\nNumber of students: " + uniinfo_custom.getStudent_amount() + "\nNumber of faculty members: "+ uniinfo_custom.getFaculty_member_amount() + "\nNumber of faculties: "+ uniinfo_custom.getFaculties_amount() + "\nNumber of departments: "+ uniinfo_custom.getDepartment_amount() + "\nFacility 1: "+ uniinfo_custom.getFacility_1() +"\nFacility 2: "+ uniinfo_custom.getFacility_2() +"\nFacility 3: "+ uniinfo_custom.getFacility_3()+ "\n\n" );

        // setters
        uniinfo_custom.setName("Grover");
        uniinfo_custom.setYear("Freshman");
        uniinfo_custom.setStudent_amount(2000);
        uniinfo_custom.setFaculty_member_amount(17);
        uniinfo_custom.setFaculties_amount(22);
        uniinfo_custom.setDepartment_amount(13);
        uniinfo_custom.setFacility_1("Gym");
        uniinfo_custom.setFacility_2("Languages");
        uniinfo_custom.setFacility_3("Computing");

        //getters
        System.out.println("Getters: \n");

        System.out.println(uniinfo_custom.getName());
        System.out.println(uniinfo_custom.getYear());
        System.out.println(uniinfo_custom.getStudent_amount());
        System.out.println(uniinfo_custom.getFaculty_member_amount());
        System.out.println(uniinfo_custom.getFaculties_amount());
        System.out.println(uniinfo_custom.getDepartment_amount());
        System.out.println(uniinfo_custom.getFacility_1());
        System.out.println(uniinfo_custom.getFacility_2());
        System.out.println(uniinfo_custom.getFacility_3());



    }
}
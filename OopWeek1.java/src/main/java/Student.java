public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String n)
    {
        id = n;
    }
    public String getGroup()
    {
        return group;
    }
    public void setGroup(String n)
    {
        group = n;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String n)
    {
        email = n;
    }
    public String getInfo()
    {
        return ( name +" - "+id+" - "+group+" - "+email );
    }
    Student()
    {
        name = "Student"; id="000";
        email="uet@vnu.edu.vn"; group="K62CB";
    }
    Student(String name, String id, String email)
    {
        this.name=name;
        this.email=email;
        this.id=id;
        this.group = "K62CB";
    }
    Student (Student s)
    {
        name = s.getName();
        id = s.getId();
        group = s.getGroup();
        email = s.getEmail();
    }
    Student(String name, String id, String group, String email)
    {
        this.name=name;
        this.email=email;
        this.id=id;
        this.group = group;
    }

}

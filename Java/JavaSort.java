package Java;

import java.util.*;

class Student
{
    private Integer id;
    private String firstName;
    private Float cgpa;

    public Student(Integer id, String firstName, Float cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getCgpa() {
        return cgpa;
    }

    public void setCgpa(Float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

public class JavaSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Student> list = new ArrayList<>(num);
        for(int i=0;i<num;i++)
        {

            list.add(new Student(sc.nextInt(), sc.next(), sc.nextFloat()));
        }

        Collections.sort(list, (o1,o2) -> {
                if(Float.compare(o2.getCgpa(), o1.getCgpa())!=0)
                {
                    return o2.getCgpa().compareTo(o1.getCgpa());
                }
                else if(!o1.getFirstName().equals(o2.getFirstName()))
                {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                else {
                    return Integer.compare(o1.getId(), o2.getId());
                }
        });
        for(Student stud : list)
        {
            System.out.print(stud.getFirstName() + " ");
        }
    }
}

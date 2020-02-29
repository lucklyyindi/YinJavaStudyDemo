import java.util.HashSet;
import java.util.Set;

public class Student {
    public String id;
    public String name;
    public Set <Course> Course;
    public Student (String id,String name){
        this.id=id;
        this.name=name;
        this.Course=new HashSet<Course>();
    }
}

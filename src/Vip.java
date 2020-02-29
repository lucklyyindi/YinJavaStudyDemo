import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Vip {
    public Map<String, Student> students;

    public Vip() {
        this.students = new HashMap<String, Student>();
    }

    public void testPut() {
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID:");
            String ID = console.next();
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("打印输出学生姓名：");
                String name = console.next();
                Student newStudent = new Student(ID, name);
                students.put(ID, newStudent);
                System.out.println("成功添加学生" + students.get(ID).name);
                i++;

            } else {
                System.out.println("该学生ID已被用");
                continue;
            }
        }

    }

    public void testkeySet() {
        Set<String> keySet = students.keySet();
        System.out.println("总共有：" + students.size() + "个学生！");
        for (String stuID : keySet) {
            Student st = students.get(stuID);
            if (st != null)
                System.out.println("学生：" + st.name);

        }
    }

    public void testRemove() {

        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要删除学生ID");
            String ID = console.next();
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("该ID不纯在");
                continue;

            }
            students.remove(ID);
            System.out.println("成功删除该学生"+st.name);
            break;

        }
    }
    public void testENtrySet(){
        Set<Map.Entry<String,Student>>entrySet=students.entrySet();
        for(Map.Entry<String,Student>entry:entrySet){
            System.out.println("取得见："+entry.getKey());
            System.out.println("对应的值："+entry.getValue().name);
        }
    }
    public void testMOdfly(){
        System.out.println("请输入要修改的ID：");
        Scanner console=new Scanner(System.in);
        while(true){
            String stuID=console.next();
            Student student=students.get(stuID);
            if(student==null){
                System.out.println("该ID不纯在");
                continue;
            }
            System.out.println("当前该学生id"+student.name);
            System.out.println("请输入新的学生姓名");
            String name=console.next();
            Student newStudent=new Student(stuID,name);
            students.put(stuID,newStudent);
            System.out.println("修改成功");
            break;
        }

    }
    public void testoooe(){
        Scanner console=new Scanner(System.in);
        String id=console.next();
        System.out.println("打印输出学生的id"+id+"在学生映射表中是否正确："+students.containsKey(id));
        if(students.containsKey(id))
            System.out.println("对应的学生id"+students.get(id).name);
        System.out.println("请输入要查找的学生");
        String name=console.next();
        if(students.containsKey(new Student(null,name)))
            System.out.println("在学生映射表中，确保含学生"+name);
        else
            System.out.println("在学生映射表中不存在该学生1");
        }
    }




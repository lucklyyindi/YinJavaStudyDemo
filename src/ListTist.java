import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTist {
    public List lopi;
    public ListTist(){
        this.lopi=new ArrayList();

    }
    public void testAdd(){
        Course cr1=new Course("1","数据结构");
        lopi.add(cr1);
        Course temp=(Course)lopi.get(0);
        Course cr2=new Course("2","c语言");
        System.out.println("添加了课程"+temp.id+":"+temp.name);
        lopi.add(0,cr2);
        Course temp2=(Course)lopi.get(0);
        System.out.println("添加了课程"+temp2.id+":"+temp2.name);
        lopi.add(cr1);
        Course temp0=(Course)lopi.get(2);
        System.out.println("添加了课程"+temp0.id+":"+temp0.name);



        //越界
        //Course cr3=new Course("3","集合");
        //lopi.add(4,cr3);
        Course[] courses={new Course("3","离散数学"),new Course("4","java")};
        lopi.addAll(Arrays.asList(courses));
        Course temo3=(Course)lopi.get(4);
        Course temo4=(Course)lopi.get(3);
        lopi.addAll(Arrays.asList(courses));
        System.out.println("添加了两门课程："+temo3.id+":"+temo3.name+":"+temo4.id+":"+temo4.name);



        Course[] course2={new Course("5","汇编语言"),new Course("6","数学")};
        lopi.addAll(2,Arrays.asList(course2));
        Course temo5=(Course)lopi.get(2);
        Course temo6=(Course)lopi.get(3);
        System.out.println("添加了两门课程："+temo5.id+":"+temo5.name+":"+temo6.id+":"+temo6.name);

    }
    public void testGet(){
        int size=lopi.size();
        System.out.println("有如下课程待选：");
        for(int i=0;i<size;i++){
            Course cr=(Course)lopi.get(i);
            System.out.println("课程"+cr.id+":"+cr.name);

        }
    }
    public void testInter(){
        Iterator it=lopi.iterator();
        while (it.hasNext()){

        }
    }
    public void testModify(){
        lopi.set(4,new Course("7","毛概"));
    }

}

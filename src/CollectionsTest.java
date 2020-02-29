import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest<list> {
    public void testSort1() {
        List<Integer> integerlist = (List) new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for (int i = 0; i < 10; i++) {
            do {
                k = random.nextInt(100);
            } while (integerlist.contains(k));
            integerlist.add(k);
            System.out.println("成功加入k" + k);


        }
        System.out.println("————————排序前————————————");
        for (Integer integer : integerlist) {
            System.out.println("元素：" + integer);

        }
        Collections.sort(integerlist);
        System.out.println("————————排序后——————————");
        for (Integer integer : integerlist) {
            System.out.println("元素：" + integer);
        }

    }

    public void testSort2() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("microsoft");
        stringList.add("google");
        stringList.add("lenovo");
        System.out.println("——————排序前————————————");
        for (String string : stringList) {
            System.out.println("元素" + string);


        }
        Collections.sort(stringList);
        System.out.println("————————排序后——————————");

        for (String string : stringList) {
            System.out.println("元素" + string);
        }
    }
    public void testSort3(){
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student(1+"","小米"));
        studentList.add(new Student(2+"","小名"));
        studentList.add(new Student(3+"","小来"));
        System.out.println("——————排序前————————————");
        for(Student student:studentList){
            System.out.println("元素" + student);

        }
    }
}


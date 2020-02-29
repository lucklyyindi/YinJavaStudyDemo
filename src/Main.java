import javaheima.FaceToObject;
import javaheima.MyStudyDemo;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.Scanner;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 尹迪
 * 2019年6月25日
 * 学习注释
 */
public class Main {
    public static void main(String[] args) {
        Cards cd=new Cards();

        cd.createCards();

        cd.shuffle();

        player pl=new player();

        pl.GreatPlayer();

        cd.deal(pl.players[0], pl.players[1]);

        Fzhumol pg=new Fzhumol();

        pg.playingGame(pl.players[0], pl.players[1]);
        pl.players[0].showckCards();

        pl.players[1].showckCards();

        //Vip ji=new Vip();
        //ji.testPut();
        //ji.testkeySet();
        //ji.testoooe();
        //CollectionsTest ct=new CollectionsTest();
        //ct.testSort1();
        //ct.testSort2();
        //ji.testENtrySet();
        //ji.testMOdfly();
        //ji.testRemove();
        //ji.testkeySet();
        //ListTist LT=new ListTist();
        //LT.testAdd();
        //LT.testGet();
        //LT.testModify();
        
       /* China ct=new China();
        try {
             ct.test2();
        }catch (Exception e){
            e.printStackTrace();
        }*/
        /*Main tst=new Main();
        int result=tst.test();
      //  System.out.println("test()方法执行完毕，返回值为："+result);
        System.out.println("执行了,返回值："+result);*/

       // Power l=new Power();
        //l.Car();
       /* Aper l=new Power();
        Aper l1=new American();
        l.say();
        l1.say();*///抽象类的方法
        /*American l=new American();
        Power l1=new Power();
        l.say();
        l1.say();*///继承的方法
       //China l=new Power();//多态的方法
       // China l1=new American();//多态的方法
       //l.say();
        //l1.say();

        /*Finish finish=new Hil();
        finish.call();
        finish.message();
        Finish finish1=new Car();
        finish1.call();
        finish1.message();

        IPlayGame ipl=new Car();
        ipl.PlayGame();
        IPlayGame lll=new Psp();
        lll.PlayGame();

        IPlayGame KKK=new IPlayGame() {
            @Override
            public void PlayGame() {
                System.out.println("使用匿名类的方式实现接口");
            }
        };
        KKK.PlayGame();*/

        /*Cat cat=new Cat();
        Animal animal=cat;//自动类型提升  向上类型的转换
        if (animal instanceof  Cat){
            Cat cat1 = (Cat) animal;//向下类型转换  强制类型转换
        }else{
            System.out.println("无法进行类型转换 转换成dog类型");
        }
        if(animal instanceof Finish) {
        Finish finish=(Finish)animal;
            }else{
                System.out.println("无法进行类型转换");
            }
        Animal Obj1=new Animal();
        Cat Obj2=new Cat();
        Animal Obj3=new Finish();
         Obj1.steamShip();
        Obj2.aircraft();
            //Animal animal=new Animal();
            //System.out.println("animal age:"+animal.age);*/
        /*Cat dog=new Cat();
        Cat dog2=new Cat();
        if(dog.equals(dog2)) {
            System.out.println("两个对象是相同的");
        }else{
            System.out.println("两个对象是不同的");
        }*/

        //dog.age=10;
        //dog.name="xiaoli";
        //dog.eat();

     //Fruit age =new Fruit();
     //age.age=18;
     //age.setColor();
     // age.gweAlisa();

    }
    public static void chockDemo() {
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();
        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);

        Dog dog = new Dog("小迪");
        FaceToObject faceToObject = new FaceToObject();
        faceToObject.speak();
        MyStudyDemo myStudyDemo = new MyStudyDemo();
        myStudyDemo.StringToDouble();

    }

    private static void switchDemo(int month) {
        int[] arrMonth = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int i = 11;  //Array  Index  Out  Of  Bounds  Exception
        switch (arrMonth[i]) {
            case 1:
                System.out.println("春天Spring");
                break;
            case 2:
                System.out.println("春天Spring");
                break;
            case 3:
                System.out.println("春天Spring");
                break;
            case 4:
                System.out.println("夏天Summer");
                break;
            case 5:
                System.out.println("夏天Summer");
                break;
            case 6:
                System.out.println("夏天Summer");
                break;
            case 7:
                System.out.println("秋天Autumn");
                break;
            case 8:
                System.out.println("秋天Autumn");
                break;
            case 9:
                System.out.println("秋天Autumn");
                break;
            case 10:
                System.out.println("冬天Winter");
                break;
            case 11:
                System.out.println("冬天Winter");
                break;
            case 12:
                System.out.println("冬天Winter");
                break;
        }
    }

    private static void doWhileDemo() {
        int i = 1;
        do {
            System.out.println("do（做）...while（当）i小于9" + i);
            ++i;
        } while (i < 9);
    }

    private static void whileDemo() {
        int i = 1;
        while (i <= 9) {
            System.out.println("i=" + i + "小于等于9");
            i++;
        }
    }

    private static void showDec() {
        int d = 5;
        int e, f;
        e = d--; //d=4   e=5
        f = --d; //d=3   f=3
        System.out.println("d=" + d);
        System.out.println("e=" + e);
        System.out.println("f=" + f);
    }

    private static void showAdd() {
        int a = 1;
        int b, c;
        b = a++;  //a=2   b=1
        c = ++a;  //a=3   c=3
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    private static void showNine() {
        for (int i = 1; i <= 9; i++) { //1,2,3,4,5,6,7,8,9
            //内层循环，变量j控制输出1-9列
            for (int j = 1; j <= i; j++) {  //1,2,3
                //使用字符串拼接的形式，打印每个内层循环的执行语句
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println("");
        }
    }

    private static void countLength() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = input.nextInt();
        int count = 0;
        if (num >= 0 && num <= 999999999) {
            while (num != 0) {
                count++;
                num /= 10;
            }
            System.out.println("它是个" + count + "位的数！");
        } else {
            System.out.println("输入有误！");
        }
    }

    private static void addScore() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入考试成绩:");
        int score = input.nextInt();

        // 变量保存加分次数
        int count = 0;


        //打印输出加分前成绩
        System.out.println("加分前成绩" + score);
        for (; score < 60; ) {
            count++;
            score++;
        }

        // 只要成绩小于60，就循环执行加分操作，并统计加分次数

        System.out.println("加分后的成绩：" + score);
        System.out.println("共加了" + count + "次！");
    }

    private static void showScore() {
        int classnum = 3;
        int stunum = 4;
        double sum = 0;
        double avg = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= classnum; i++){
            sum=0;
            System.out.println("**请输入第" + i + "的班级数量**");
            for (int j = 1; j <= stunum; j++) {
                System.out.println("**请输入学员" + j + "的分数:");
                int SDF = input.nextInt();
                sum = sum + SDF;

            }
            avg = sum / stunum;
            System.out.println("第"+i+"个班级的平均分"+avg);
        }
    }
    private static void myDemo(){
        int age=9;
System.out.println("age"+age);
}
    public int test() {
        int divder=10;//异常处理try...catch...fianlly
        int result=100;
        try{
            while(divder>-1) {
                divder--;
                result = result + 100 / divder;
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("循环抛出异常类！！！");

        }finally {
            System.out.println("这是finally类！。哈哈；；；");
            System.out.println("我是result:"+result);

    }
        System.out.println("我是test3，我运行成功了");
        return 1111;
    }

}


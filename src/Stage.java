public class Stage extends Thread{
    public void run(){
        System.out.println("欢迎观看隋唐演义！");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("缓缓拉开序幕");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("话说隋朝末年，隋军与农民起义军杀的昏天黑地....");
        ArmyRunnable armyTaskOfSuiDynasty=new ArmyRunnable();
        ArmyRunnable armyTaskOfRevolt=new ArmyRunnable();
        Thread armyOfSuiDynasty=new Thread(armyTaskOfSuiDynasty,"隋军");
        Thread armyOfRevolt=new Thread(armyTaskOfRevolt,"农民起义军");
        armyOfSuiDynasty.start();
        armyOfRevolt.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        armyTaskOfSuiDynasty.keepRunning=false;
        armyTaskOfRevolt.keepRunning=false;
        try{
            armyOfRevolt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正当双方激战，半路杀出个程咬金");
        Thread mrcheng=new KeyPersonTread();
        mrcheng.setName("程咬金");
        System.out.println("程咬金的理想就是结束战争，使百姓安居乐业！");
       armyTaskOfSuiDynasty.keepRunning=false;
       armyTaskOfRevolt.keepRunning=false;
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mrcheng.start();
        try{
            mrcheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("战争结束，百姓安居乐业，程先生为人民做出了巨大的贡献，实现了梦想");
        System.out.println("谢谢观看隋唐演义，再见！");
    }
}

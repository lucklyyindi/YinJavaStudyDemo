import java.util.Arrays;
public class Repeat {

    public void forDemo(){
        int[] intArr = {11,12,13,14,16};

        for (int i = 0; i < intArr.length; i++) {
            System.out.println("数组中元素index:"+i); //0,1,2,3,4
            System.out.println("数组中元素："+intArr[i]); //11,12,13,14,16
        }
    }

    public void whileDemo(){
        int i=1;
        int sum=0;
        while(i<100){
            if(i%3==0){
                sum +=i;
            }
            i++;
        }
        System.out.println("100以内能被3整除的和:"+sum+"的数");

    }

    public void foreachDemo(){
        int[] scores = { 89, 72, 64, 58, 93 };
        Arrays.sort(scores);
        for (int score:scores) {
            System.out.println(score);
        }

    }

    public void forinDemo(){
        String arr[] = { "abc", "def", "opq" };
        for (int i = 0; i < arr.length; i++) {//通过下标遍历数组
            System.out.println(arr[i]);
        }

    }

    public void forofDemo(){


    }
}

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class player {
    private int id;
    private String name;
    public Set<Cards> ckCards = new HashSet<Cards>();
    public player[] players = new player[2];
    private int ID;

    public void GreatPlayer() {
        System.out.println("——————————创建玩家——————————————");
        for (int i = 0; i < players.length; i++) {
            players[i] = new player();

        }
        System.out.println("请输入第1为玩家的id和姓名：");
        System.out.println("请输入id");
        int ID;
        while (true){
            try{
                Scanner console=new Scanner(System.in);
                ID=console.nextInt();
                players[0].setId(ID);
                break;
            }catch(InputMismatchException e) {

                System.out.println("请输入整数类型的ID！");

            }
        }
        System.out.println("请输入姓名：");
        Scanner console2=new Scanner(System.in);
        String name=console2.nextLine();
        players[0].setName(name);
        System.out.println("请输入第2为玩家的id和姓名：");
        System.out.println("请输入id");
        int ID2;
        while (true){
            try{
                Scanner console=new Scanner(System.in);
                ID2=console2.nextInt();
                players[1].setId(ID2);
                break;
            }catch (InputMismatchException e) {

                System.out.println("请输入整数类型的ID！");

            }
        }
        System.out.println("请输入姓名：");
        Scanner console3=new Scanner(System.in);
        String name2=console3.nextLine();
        players[1].setName(name2);
        System.out.println("欢迎玩家："+players[0].getName());
        System.out.println("欢迎玩家："+players[1].getName());
    }

    String getName() {
        return name;
    }


    public void showckCards(){
        System.out.println("玩家的各自手牌：");
        System.out.print(this.getName()+":[");
        for(Cards cards:ckCards) {

            System.out.print(cards.getCardType()+cards.getCardNumber()+" ");

        }
        System.out.println("]");
    }


    private void setName(String name) {
        this.name=name;
    }

    private void setId(int id) {
   this.ID =id;
    }
}

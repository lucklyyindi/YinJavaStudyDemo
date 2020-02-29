import java.util.Arrays;
import java.util.List;

public class Fzhumol {
    public Cards compareTwoCards(Cards c1,Cards c2) {

        final String[] Types= {"黑桃","红桃","梅花","方片"};

        final String[] Numbers= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        List<String> arrayTypes= Arrays.asList(Types);

        List<String> arrayNumbers=Arrays.asList(Numbers);

        if(arrayNumbers.indexOf(c1.getCardNumber()) < arrayNumbers.indexOf(c2.getCardNumber())) {

            return c2;

        }else if(arrayNumbers.indexOf(c1.getCardNumber()) > arrayNumbers.indexOf(c2.getCardNumber())) {

            return c1;

        }else {

            if(arrayTypes.indexOf(c1.getCardType()) < arrayTypes.indexOf(c2.getCardType()))

                return c2;

            else

                return c1;

        }

    }

    public void playingGame(player p1,player p2) {

        System.out.println("----------------开始游戏---------------");

        Cards p1MaxCard=compareTwoCards((Cards)p1.ckCards.toArray()[0],(Cards)p1.ckCards.toArray()[1]);

        System.out.println("玩家："+p1.getName()+"最大的手牌为："+p1MaxCard.getCardType()+p1MaxCard.getCardNumber());

        Cards p2MaxCard=compareTwoCards((Cards)p2.ckCards.toArray()[0],(Cards)p2.ckCards.toArray()[1]);

        System.out.println("玩家："+p2.getName()+"最大的手牌为："+p2MaxCard.getCardType()+p2MaxCard.getCardNumber());

        Cards winnerCards=compareTwoCards(p1MaxCard,p2MaxCard);

        if(winnerCards.equals(p1MaxCard))

            System.out.println("--------------玩家："+p1.getName()+"获胜！---------------");

        else

            System.out.println("--------------玩家："+p2.getName()+"获胜！---------------");

    }







}


import java.util.ArrayList;

import java.util.List;

import java.util.Random;



public class Cards {
    final String[] Types = {"黑桃", "红桃", "梅花", "方片"};

    final String[] Numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    private String cardType;

    private String cardNumber;

    Cards[] cards = new Cards[Types.length * Numbers.length];  //注意！！！这里只是声明自定义类数组，对于每个元素需要分别初始化

    List<Cards> shuffleCards = new ArrayList<Cards>();

    public void createCards() {

        System.out.println("----------------创建扑克牌---------------");

        for (int i = 0; i < cards.length; i++) {

            cards[i] = new Cards();

        }

        int k = 0;

        for (int i = 0; i < Types.length; i++) {

            for (int j = 0; j < Numbers.length; j++) {

                cards[k].setCardType(Types[i]);

                cards[k].setCardNumber(Numbers[j]);

                k++;

            }

        }

        System.out.println("------------------扑克牌创建成功！-------------------");

        System.out.print("为：[");

        for (Cards c : cards) {

            System.out.print(c.cardType + c.cardNumber + ", ");

        }

        System.out.print("]");

        System.out.println();

    }

    private void setCardNumber(String number) {
        this.cardNumber=number;

    }

    private void setCardType(String type) {
        this.cardType=type;
    }

    public void shuffle() {

        System.out.println("-------------------开始洗牌------------------");

        Random random = new Random();

        int cardIndex;

        for (int i = 0; i < cards.length; i++) {

            do {

                cardIndex = random.nextInt(cards.length);

            } while (shuffleCards.contains(cards[cardIndex]));

            shuffleCards.add(cards[cardIndex]);

        }

        System.out.println("-------------------洗牌结束！-------------------");
        for (Cards c : shuffleCards) {

        }
    }

    public void deal(player p1,player p2){
        System.out.println("——————————开始发牌————————");
        System.out.println("----玩家1"+p1.getName()+"--拿牌");
        Cards ckCards1=shuffleCards.get(0);
        p1.ckCards.add(ckCards1);
        p2.ckCards.add(ckCards1);
        System.out.println("----玩家2"+p2.getName()+"--拿牌");
        Cards ckCards2=shuffleCards.get(1);
        p2.ckCards.add(ckCards2);
        p1.ckCards.add(ckCards2);
        System.out.println("----玩家1"+p1.getName()+"--拿牌");
        Cards ckCards3=shuffleCards.get(2);
        p1.ckCards.add(ckCards3);
        p2.ckCards.add(ckCards3);
        System.out.println("----玩家2"+p2.getName()+"--拿牌");
        Cards ckCards4=shuffleCards.get(3);
        p2.ckCards.add(ckCards4);
        System.out.println("————————发牌结束——————");
    }
    public String getCardType() {

        return cardType;

    }

    public String getCardNumber() {

        return cardNumber;

    }

    @Override

    public int hashCode() {

        final int prime = 31;

        int result = 1;

        result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());

        result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());

        return result;

    }
    @Override

    public boolean equals(Object obj) {

        if (this == obj)

            return true;

        if (!(obj instanceof Cards))

            return false;

        Cards other = (Cards) obj;

        if (cardNumber == null) {

            if (other.cardNumber != null)

                return false;

        } else if (!cardNumber.equals(other.cardNumber))

            return false;

        if (cardType == null) {

            if (other.cardType != null)

                return false;

        } else if (!cardType.equals(other.cardType))

            return false;

        return true;

    }

}



   



  
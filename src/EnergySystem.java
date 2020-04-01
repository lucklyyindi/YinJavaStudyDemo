public class EnergySystem {
    private final double[] energrboxes;

    public EnergySystem(double[] energrboxes) {
        this.energrboxes = energrboxes;
        for(int i=0;i<energrboxes.length;i++){
            double initialEnergy = 0;
            energrboxes[i]=initialEnergy;
        }
    }
    public void transfer(int from,int to,double amount){
        if(energrboxes[from]<amount){
            return;
//            System.out.print(Thread.currentThread().getName());
//            energrboxes[from]-=amount;
//            System.out.printf("从%d转移%10.2f能量到%d",from,amount,to);
//            energrboxes[to]+=amount;
//            System.out.println("能量总和：%10.2f%n",getTotalEnergies());
        }
    }
}

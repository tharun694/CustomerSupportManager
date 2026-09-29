package practicecode;

import java.util.Arrays;

public class MinDiscount {
    public static void main(String[] args) {
        int[] p={10,30,21};
        int[] d={50,60};
        System.out.println(minPrice(p,d));
    }
  static   public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int  i=prices.length-1;
        int j=discounts.length-1;
        double finalprice=0;
        double remain=0;
        while(i>=0&&j>=0){
            double price=0.0;
            price=(prices[i]*(100-discounts[j]));
            price=price/100;
           finalprice= finalprice+price;
                i--;
                j--;
        }
        for(int id=0;id<=i;id++){
            remain+=prices[id];
        }
        return remain+finalprice;
    }
}

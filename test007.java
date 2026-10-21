//双色球系统
package Basic_learning;
import java.util.Random;
import java.util.Scanner;

public class test007 {
    static void main(String[] args) {
        int[] arr = GetNumbers();
        int[] Userarr=UserNumbers();
        int redsum=0;
        int bluesum=0;
        for(int i=0;i<6;i++){
            int redNumber=Userarr[i];
            for(int j=0;j<6;j++){
                if(redNumber==arr[j]){ redsum++;}
            }
        }
        if(arr[6]==Userarr[6]){bluesum++;}
        int prize=GetPrize(redsum,bluesum);
        System.out.println(prize);
    }

    public static int[] GetNumbers() {
        int[] arr = new int[7];
        Random rand = new Random();
        for (int i = 0; i < 6; ) {
            int c = rand.nextInt(33) + 1;
            if (contains(arr, c)) {
                arr[i] = c;
                i++;
            }
        }
        arr[6] = rand.nextInt(16) + 1;
        return arr;
    }

    public static boolean contains(int[] arr, int value) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == value) {
                return false;
            }
        }
        return true;
    }

    public static int[] UserNumbers() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红球号：");
        for (int i = 0; i < 6; ) {
            int c = sc.nextInt();
            if (c >= 1 && c <= 33 && contains(arr, c)) {
                arr[i] = c;
                i++;
            } else {
                System.out.println("当前红球号超出范围,请重新输入");
            }
        }
        System.out.println("请输入蓝球号：");
        arr[6] = sc.nextInt();
        return arr;
    }
    public static int GetPrize(int redsum, int bluesum) {
        if(redsum==6 && bluesum==1){return 100000000;}
        else if(redsum==6 && bluesum==0){return 50000000;}
        else if(redsum==5 && bluesum==1){return 3000;}
        else if((redsum==5 && bluesum==0) ||(redsum==4 && bluesum==1)){return 200;}
        else if((redsum==4 && bluesum==0)||(redsum==3 && bluesum==1)){return 5000;}
        else if((redsum==2 && bluesum==1)||(redsum==1 && bluesum==1)){return 5;}
        else return 0;
    }
}

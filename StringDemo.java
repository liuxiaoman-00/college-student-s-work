package Basic_learning_01;

import java.util.Scanner;

public class StringDemo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while(true) {
            System.out.println("请输入金额：");
            money = sc.nextInt();
            if(money>0&&money<=9999999) {break;}
            else {System.out.println("请重新输入：");}
        }
        String str="";
        while(money>0) {
            int number=money%10;
            str=GetCaptialNumber(number)+str;
            money=money/10;
        }
       int count=7-str.length();
        for(int i=0;i<count;i++) {
            str='零'+str;
        }
        String Money=ChallegNumber(str);
    System.out.println(Money);
    }
    public static char GetCaptialNumber(int number) {
        char[] arr={'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        return arr[number];
    }
    public static String ChallegNumber(String str){
        String MoneyStr="";
        char[] arr={'佰','拾','万','仟','佰','拾','元'};
        for(int i=0;i<7;i++) {
            MoneyStr=MoneyStr+str.charAt(i)+arr[i];
        }
        return MoneyStr;
    }
}

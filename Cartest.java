package Basic_learning;

import java.util.Scanner;

public class Cartest {
    static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            Car car = new Car();
            System.out.println("输入汽车品牌：");
            String name = sc.next();
            car.setName(name);
            System.out.println("输入汽车颜色：");
            String color = sc.next();
            car.setColor(color);
            System.out.println("输入汽车价格：");
            int price = sc.nextInt();
            car.setPrice(price);
            arr[i] = car;
        }
        for(int i=0;i<3;i++){
            System.out.println(arr[i].getName()+" "+arr[i].getColor()+" "+arr[i].getPrice());
        }
    }
}

package Basic_learning;

public class ProductTest {
    static void main(String[] args) {
        Product product1=new Product("#111111","01",200 ,3);
        Product product2=new Product("#222222","02",300 ,3);
        Product product3=new Product("#333333","03",400 ,3);
        Product[] products=new Product[3];
        products[0]=product1;
        products[1]=product2;
        products[2]=product3;
        for(int i=0;i<3;i++)
            {
            System.out.println(products[i].getCount());
            }

    }
}

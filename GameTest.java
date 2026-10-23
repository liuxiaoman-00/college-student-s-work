package Basic_learning;

public class GameTest{
    static void main(String[] args) {
        Role role1 = new Role("乔峰",100,'男' );
        role1.setface();
        Role role2=new Role("鸠摩智",100,'男');
        role2.setface();
        while(true){
            role1.attack(role2);
            if(role2.getBlood()==0){
                System.out.println(role1.getface()+role1.getName()+"KO了"+role2.getName());
                break;
            }
            role2.attack(role1);
            if(role2.getBlood()==0){
                System.out.println(role2.getface()+role1.getName()+"KO了"+role1.getName());
                break;
            }
        }

    }
}

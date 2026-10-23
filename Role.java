package Basic_learning;
import java.util.Random;
public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces={"风流俊雅","气宇轩昂","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces={"美奂绝伦","沉鱼落雁","玉立亭亭","身材娇好","相貌平平","相貌丑陋","惨不忍睹"};
    String[] attacks_desc={"%s使出一招【背心钉】,转到对方身后，一掌向%s背心的灵台穴拍去。",
            "%s使出一招【游空探爪】,非起身形自半空中变掌为抓锁向%s。"
    };
    public Role(){}
    public Role(String name, int blood,char gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
    }
    public String getface(){
        return face;
    }
    public void setface(){
        if(this.gender=='男'){
            int i = new Random().nextInt(5 );
            this.face = boyfaces[i];
        }
        else{
            int i = new Random().nextInt(7 );
            this.face = girlfaces[i];
        }

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public void attack(Role role){
        Random rand = new Random();
        int hurt=rand.nextInt(20)+1;
        int remainBoold=role.getBlood()-hurt;
        int idex=rand.nextInt(2);
        String KongFu=attacks_desc[idex];
        System.out.printf(KongFu,this.getName(),role.getName());
        remainBoold=remainBoold<0?0:remainBoold;
        role.setBlood(remainBoold);
        System.out.println(this.getName()+"乔峰举起拳头,打了"+role.getName()+"一下"+"造成了"+hurt+"点伤害，鸠摩智还剩了"+
                remainBoold+"点血");
    }

}

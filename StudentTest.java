package Basic_learning;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1,"zhangsan",23);
        students[1] = new Student(2,"lisi",24);
        students[2] = new Student(3,"wangwu",25);
        Student student1=new Student(4,"zhaoliu",25);
        boolean flag=contains(students,student1.getId());
        if(flag==true){
            System.out.println("当前ID已重复");
        }else{
            int count=GetCount(students);
            if(count==students.length){
                Student[] Newarry=creatNewArray(students);
                Newarry[count]=student1;
                ListArray(Newarry);
            }else{
                students[count]=student1;
                ListArray(students);
            }
        }

    }
    public static Student[] creatNewArray(Student[] students){
        Student[] NewArr=new Student[students.length+1];
        for(int i=0;i<students.length;i++){
            NewArr[i]=students[i];
        }
        return NewArr;
    }
    public static boolean contains(Student[] arr,int id ){
        for(int i=0;i<arr.length;i++){
            if(arr[i].getId()==id){return true;}
        }
        return false;
    }
    public static int GetCount(Student[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){count++;}
        }
        return count;
    }
    public static void ListArray(Student[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null) {
                System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
            }
        }
    }
}

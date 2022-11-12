import java.util.Scanner;
public class Zuoye {
    public static int sum1;
    public static void zuozuoye(){
        Student child1 = new Student();
        Student child2 = new Student();
        Student child3 = new Student();
        child1.dohomework();
        child2.dohomework();
        child3.dohomework();//三个同学都在做作业
        int n=1;
        sum1=0;
        System.out.println("交作业");
        do {
            System.out.println("是否可以上交");
            Scanner sc=new Scanner(System.in);
            String a=sc.next();
            if (n==1&&a.equals("是")){
                child1.handin();
                sum1++;
            }else if (n==2&&a.equals("是")) {
                child2.handin();
                sum1++;
            }else if (n==3&&a.equals("是")){
                child3.handin();
                sum1++;
            }
            n++;
        }while (n<=3);//让每个学生交作业
        Xuewei lihua=new Xuewei();
        lihua.reciveWork();
    }
    public static void main(String[] args) {
        Zuoye.zuozuoye();
    }
}
class Student implements Dohomework,HandinWork {
    String level;
    int mark;
    @Override
    public void dohomework() {
        System.out.println("正在完成作业");
    }

    @Override
    public void handin() {

    }
}



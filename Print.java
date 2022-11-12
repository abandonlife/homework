import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        AllHomework work1;
        boolean end=true;
        do {
            System.out.println("打印哪一门学科的作业（高数/英语/线代/退出）");
            Scanner scanner =new Scanner(System.in);
            String str=scanner.next();
            switch (str){
                case "高数":
                    work1=new Highermath();
                    System.out.println("高数作业："+work1.homework());
                    break;
                case "英语":
                    work1=new English();
                    System.out.println("英语作业："+work1.homework());
                    break;
                case "线代":
                    work1=new Xiandai();
                    System.out.println("线代作业："+work1.homework());
                    break;
                case "退出":
                    end=false;
                    break;
                default:
                    System.out.println("无查询结果，可能是该科无作业发布或者输入错误");
                    break;
            }
        }while (end);
        System.out.println("是否现在开始做作业");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        if (a.contains("是")){
            Zuoye.zuozuoye();
        }else {
            System.out.println("快去做作业");
            Zuoye.zuozuoye();
        }
    }
}

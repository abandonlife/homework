public class Assist implements ReciveWork,HandinWork{
    public static int n=1,m=1;
    @Override
    public void reciveWork() {
        int sum1= Zuoye.sum1;
        if (n==1) {
            n++;
            Assist assist = new Assist();
            Assitant assistant = new Assitant();
            assist.huitiao(assistant);//实现回调一次
        }
        if (sum1==3&&m==1){
            m++;
            System.out.println("做的不错");
            handin();
        }else {
            Xuewei lihua=new Xuewei();
            lihua.reciveWork();
        }
    }


    @Override
    public void handin() {
        int sum1=Zuoye.sum1;
        if (sum1==3){
            System.out.println("已收齐。给老师");
            Teacher hao=new Teacher();
            hao.reciveWork();//创建老师的对象，让他收作业
        }else {
            Xuewei lihua=new Xuewei();
            lihua.reciveWork();
        }
        Teacher.corrct();

    }
    public static void assist(){
        Assist wangchao=new Assist();
        wangchao.reciveWork();//创建一个对象，让她收学委的作业
    }
    public void huitiao(Huitiao assistant){
        assistant.huitiao(this);//重写huitiao
    }
    public  void stop(){

    }
}
class Assitant implements Huitiao{

    @Override
    public void huitiao(Assist assist) {
        System.out.println("重新整理");
        System.out.println("已整理完毕");
        Xuewei lihua =new Xuewei();
        lihua.handin();
        assist.stop();
    }
}

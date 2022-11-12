public class Xuewei implements ReciveWork,HandinWork{
    static int n=1;
    @Override
    public void reciveWork() {
        int sum= (int) (Math.random()*4);//有概率数错
        if (sum==3){
            n++;
            handin();
        }
    }

    @Override
    public void handin() {
        if(n==2){
            System.out.println("已收齐，交给助教");
        }else if (n==3){
            System.out.println("重收作业");
            System.out.println("已收齐，交给助教");
        }//只输出两遍
        Assist.assist();
    }

    public static void main(String[] args) {
        Xuewei lihua=new Xuewei();
        lihua.reciveWork();//创建对象调用收作业方法
    }
}

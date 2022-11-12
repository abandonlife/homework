public class Teacher implements ReciveWork,Correct {
    static int linimt=60;
    static int a=1;
    @Override
    public void reciveWork() {
        System.out.println("好的");
    }

    @Override
    public void mark90() {
        if (a==1){
            System.out.println("表现不错，继续努力");
        }else if (a==2){
            System.out.println("买彩票吧");
        }else if (a==3){
            System.out.println("我要买一张船票连夜逃跑");
        }
    }

    @Override
    public void mark80() {
        if (a!=2){
            System.out.println("加油！你还可以考的更好");
        }else {
            System.out.println("撞大运了");
        }
    }

    @Override
    public void mark70() {
        System.out.println("成绩很一般，平时多努力");
    }

    @Override
    public void mark60() {
        System.out.println("你很危险呀，要加倍努力的");
    }

    @Override
    public void markUnderline() {
        System.out.println("额外上补习班，并且写检讨");
    }

    public static void corrct(){
        Student studentA=new Student();
        Student studentB=new Student();
        Student studentC=new Student();
        //设置基础
        studentA.level="A";
        studentB.level="B";
        studentC.level="C";
        //随机生成学生的成绩
        studentA.mark=55+(int)(Math.random()*45);
        studentB.mark=45+(int)(Math.random()*55);
        studentC.mark=30+(int)(Math.random()*70);
        //打印成绩单
        System.out.println("成绩单:");
        System.out.println("学生A的成绩"+studentA.mark+"\t学生B的成绩"+studentB.mark+"\t学生C的成绩"+studentC.mark);
        Teacher hao=new Teacher();
        //A的评语
        switch (studentA.mark/10){
            case 10:
                System.out.println("不能骄傲");
                hao.mark90();
                break;
            case 9:
                hao.mark90();
                break;
            case 8:
                System.out.println("一般");
                hao.mark80();
                break;
            case 7:
                System.out.println("要当心一点");
                hao.mark70();
                break;
            case 6:
                System.out.println("老师相信你是意外，发挥不好");
                hao.mark60();
                break;
            default:
                System.out.println("A，到办公室喝茶");
                System.out.println("你是用脑过度了吗，没有脑子了？");
                hao.markUnderline();
                break;
        }
        System.out.println();
        //B的评语
        switch (studentB.mark/10){
            case 10:
                System.out.println("发挥非常好");
                hao.mark90();
                break;
            case 9:
                System.out.println("这次考的很好啊");
                hao.mark90();
                break;
            case 8:
                System.out.println("一般");
                hao.mark80();
                break;
            case 7:
                System.out.println("松懈了");
                hao.mark70();
                break;
            case 6:
                System.out.println("要当心呀");
                hao.mark60();
                break;
            default:
                System.out.println("B，到办公室喝茶");
                System.out.println("怎么考成这个样子，你是没带脑子考试吗");
                hao.markUnderline();
                break;
        }
        System.out.println();
        //C的评语
        a=2;
        switch (studentC.mark/10){
            case 10:
                a++;
                System.out.println("你.....世界爆炸了吗？");
                hao.mark90();
                break;
            case 9:
                System.out.println("你.....发挥很不错");
                hao.mark90();
                break;
            case 8:
                System.out.println("挺不错了");
                hao.mark80();
                break;
            case 7:
                System.out.println("一般般吧");
                hao.mark70();
                break;
            case 6:
                System.out.println("不要老是游走在及格线上");
                hao.mark60();
                break;
            default:
                System.out.println("C，到办公室喝茶");
                System.out.println("用脚写都比你考的好吧");
                hao.markUnderline();
                break;
        }
    }

    public static void main(String[] args) {
        Teacher.corrct();
    }
}

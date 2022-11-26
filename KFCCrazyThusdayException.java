
public class KFCCrazyThusdayException extends Exception{

    public static void main(String[] args){
        try {
            a();
        }catch (KFCCrazyThusdayException e){
            System.out.println("为什么不v我50");
        }
        System.out.println("小气鬼!!!");
    }

    private static String a() throws KFCCrazyThusdayException {
        System.out.println("速速v我50");
        if (250+250==250){
            return "怪呀";
        }
        throw new KFCCrazyThusdayException();
    }
}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileSteamDemo {
    public static void main(String[] args) {
        String str,str1;
        System.out.println("输入想要创建的文本位置");
        Scanner scanner1=new Scanner(System.in);
        str=scanner1.next();
        System.out.println("输入想要创建的文本内容");
        Scanner scanner2=new Scanner(System.in);
        str1=scanner2.next();
        FileSteamDemo rool1=new FileSteamDemo();
        rool1.tool(str1,str);
    }
    private void tool(String str1,String str){
        File file=new File(str);
        try {
            FileOutputStream out=new FileOutputStream(file);
            byte buy[]=str1.getBytes();
            out.write(buy);
            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in=new FileInputStream(file);
            byte byt[]=new byte[1024];
            int len=in.read(byt);
            System.out.println("文件内容是："+new String(byt,0,len));
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

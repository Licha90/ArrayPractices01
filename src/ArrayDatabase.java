
import java.util.Scanner;

public class ArrayDatabase {
    public static void main(String[] args) {
        //登录是存储账号密码的数据库
        //1.需要用于存储真真实账号密码的数据库（数组代替）
        //2.需要用户输入用户名和密码
        //3.比对
        //4.先对比账号，因为账号是唯一存在的（主键primary key约束）
        //5.登录成功（密码正确）
        //6.密码错误
        //7.用户名不存在

        int[] PasswordBox = {123,321,1234567};//Array to store password

        Scanner input = new Scanner(System.in);//input from user

        System.out.print("Please input Username: ");

        String user = input.nextLine();//get the inputted username from the user


        boolean b = false;//标记,for循环执行完毕后 发现用户名不存在

        //Array to store username
        String[] UserNameBox = {"XiaoMing", "XiaoHong", "DaGe"};

        for (int i = 0; i < UserNameBox.length; i++){

            if (UserNameBox[i].equals(user)){//如果输入的账号等于数组里面的账号，则账号存在

                System.out.print("Please input Password: ");

                int password = input.nextInt();//get the inputted password from the user

                if (PasswordBox[i] == password){//如果输入的密码等于数组里面的密码，则密码存在

                    System.out.println("SuccessfullyLogin");

                }else{

                    System.out.println("FailToLogin");
                }

                b = true;//循环后发现用户名存在则为true

                break;
            }
        }


        if (!b) {

            System.out.println("Incorrect Username");

        }
    }
}

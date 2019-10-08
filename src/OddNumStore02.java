public class OddNumStore02 {

    public static void main(String[] args) {

        //创建一个新的数组 直接赋值 省略循环去寻找count的过程

        int primeNumberArray[] = new int[50];

        int index = 0;//创建一个新的变量,用来记录质数索引的变化

        for (int num = 2; num <= 100; num++){

            boolean b = false;

            for (int i = 2; i <= num/2; i++) {//寻找也没有可以被整除的数字

                if (num % i == 0) {


                    b = true;

                    break;

                }
            }

            if (!b){

                primeNumberArray[index++] = num;
            }
        }

        int[] newArray = new int[index];

        for (int i = 0; i < newArray.length; i++){

            newArray[i] = primeNumberArray[i];

        }

        primeNumberArray = null;

        for (int v : newArray){

            System.out.println(v);
        }
    }
}

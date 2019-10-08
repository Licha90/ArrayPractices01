public class OddNumStore {

    public static void main(String[] args) {

        int count = 0;

        for (int num = 2; num <= 100; num++){

            boolean b = false;

            for (int i = 2; i <= num/2; i++) {//寻找有没有可以被整除的数字

                if (num % i == 0) {

                    //System.out.println(num + " 不是质数");

                    b = true;

                    break;

                }
            }

                if (!b){

                    //System.out.println(num + " 是质数");

                    count++;
                }
            }

        System.out.println("经过寻找后， 2-100之间的质数个数为: " + count);

        //创建一个数组
        int[] PrimeNum = new int[count];

        int index = 0;//创建一个新的变量,用来记录质数索引的变化

        for (int num = 2; num <= 100; num++){

            boolean b = false;

            for (int i = 2; i <= num/2; i++) {//寻找也没有可以被整除的数子

                if (num % i == 0) {


                    b = true;

                    break;

                }
            }

            if (!b){

                PrimeNum[index++] = num;
            }
        }

        for (int v : PrimeNum){

            System.out.println(v);
        }
    }
}
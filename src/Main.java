import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        int [] array ={0,1,2,3,4,5,6,7,8,9};


        int userIndexNum = input.nextInt();
        try {
            int deger =array[userIndexNum];
            System.out.println("İndeksteki eleman: " + deger);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("9 dan buyuk rakam giremezsiniz");
        }


    }
}

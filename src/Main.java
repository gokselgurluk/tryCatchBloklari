import java.util.Scanner;
public class Main {

    public  static void checkArray(int deger,int arrays[])throws ArrayIndexOutOfBoundsException{

        int array = arrays[deger];
        System.out.println("İndeksteki eleman: " + array);
    }



    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        int [] array ={0,1,2,3,4,5,6,7,8,9};

        System.out.println("indeks no girin");
        int userIndexNum = input.nextInt();
        try {
          checkArray(userIndexNum,array);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("9 dan buyuk rakam giremezsiniz\n"+e.toString());
        }


    }
}

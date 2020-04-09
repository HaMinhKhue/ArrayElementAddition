import java.util.Scanner;
public class ArrayElementAddition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []array={10,4,6,7,8,0,0,0,0,0};
        System.out.print("Enter an integer to insert: ");
        int X=scanner.nextInt();
        System.out.print("Enter an index: ");
        int insert_index=scanner.nextInt();
        boolean notProperIndex= insert_index<0||insert_index>array.length-1==true;
        while (notProperIndex){
            System.out.print("Index not regular, try again: ");
            insert_index=scanner.nextInt();
        }
            array[insert_index]=X;
            for(int i=array.length-1;i>insert_index+1;i--){
                array[i]=array[i-1];
            }
            System.out.println("The new array is: ");
            System.out.print('{');
            for (int i=0;i<array.length-1;i++){
                System.out.print(array[i]+",");
            }
            System.out.printf("%d%s",array[array.length-1],"}");
        }

    }

import java.io.*;
import java.lang.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello again! Tasks are: 1)MergeSort; 2)Quick Sort 3)HashTable");
        System.out.println("Choose the task from 1 to 3:");
        int choose;
        while(true) {
            choose = scan.nextInt();
            switch(choose) {
                case 1:
                    System.out.println(MS());
                    break;
                case 2:
                    System.out.println(QS());
                    break;
                case 3:
                    System.out.println("Oops! Didn't finished it (");
                default:
                    System.out.println("Exiting from program....");
                    return;
            }
        }

    }

    static String MS(){
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        String[] sarray=new String[n];
        for(int i=0;i<n;i++){
            sarray[i]=scan.next();
        }
        MergeSort<String> stringSorter   = new MergeSort<>();
        stringSorter.mSort(sarray, 0, sarray.length - 1);
        System.out.println(java.util.Arrays.toString(sarray));
        return "Here we go again! Choose the next task 1 or 3:";

    }

    static String QS() {

        String[] arrayOfStrings = {"Eminem", "Jay-Z", "Rihanna", "Britney", "JustinTimberlake", "TaylorSwift", "SlimShady", "BananaGuy", "Moriarti", "Jlo", "BonneyM", "Putin", "Oxxy", "PapaRimskiy", "Rasputin"};

        QuickSort<String> stringSorter   = new QuickSort<>();
        stringSorter.qSort(arrayOfStrings, 0, arrayOfStrings.length - 1);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));


        return "Here we go again! Choose the next task 1 or 3:";
    }
}




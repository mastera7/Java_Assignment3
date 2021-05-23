import java.io.*;
import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello again! Tasks are: 1)MergeSort; 2)Quick Sort 3)BST 4)HashTable");
        System.out.println("Choose the task from 1 to 4:");
        int choose;
        while (true) {
            choose = scan.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(MS());
                    break;
                case 2:
                    System.out.println(QS());
                    break;
                case 3:
                    System.out.println(new BST());
                    break;
                case 4:
                    System.out.println("Oops! Didn't finished it (");
                default:
                    System.out.println("Exiting from program....");
                    return;
            }
        }

    }

    static String MS() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] sarray = new String[n];
        for (int i = 0; i < n; i++) {
            sarray[i] = scan.next();
        }
        MergeSort<String> stringSorter = new MergeSort<>();
        stringSorter.mSort(sarray, 0, sarray.length - 1);
        System.out.println(java.util.Arrays.toString(sarray));
        return "Here we go again! Choose the next task 1 or 3:";

    }

    static String QS() {

        String[] arrayOfStrings = {"Eminem", "Jay-Z", "Rihanna", "Britney", "JustinTimberlake", "TaylorSwift", "SlimShady", "BananaGuy", "Moriarti", "Jlo", "BonneyM", "Putin", "Oxxy", "PapaRimskiy", "Rasputin"};

        QuickSort<String> stringSorter = new QuickSort<>();
        stringSorter.qSort(arrayOfStrings, 0, arrayOfStrings.length - 1);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));


        return "Here we go again! Choose the next task 1 or 3:";
    }

    public static class BST< T extends Comparable<T>> {
        Node root;
        class Node {
            final ThreadLocal<T> data = new ThreadLocal<T>();
            Node left;
            Node right;

            public Node(T data) {
                this.data.set(data);
            }
        }

        public boolean isempty() {
            return root == null;
        }

        public void insert(T val) {
            if(isempty())
                root = new Node(val);
            insert(root, val);
        }

        private void insert(Node node, T val) {

            if(val.compareTo((T) node.data) < 0) {
                if (node.left != null) {
                } else {
                    node.left = new Node(val);
                }
                insert(node.left, val);
            }
            if(node.right == null)
                node.right = new Node(val);
            insert(node.right, val);
        }
    }


}


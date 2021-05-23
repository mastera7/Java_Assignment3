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
                    System.out.println(BST());
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
        System.out.println("Choose number of words:");
        int n = scan.nextInt();
        String[] sarray = new String[n];
        System.out.println("Write your words:");
        for (int i = 0; i < n; i++) {
            sarray[i] = scan.next();
        }
        MergeSort<String> stringSorter = new MergeSort<>();
        stringSorter.mSort(sarray, 0, sarray.length - 1);
        System.out.println(java.util.Arrays.toString(sarray));
        return "Here we go again! Choose the next task 1 or 4:";

    }

    static String QS() {

        String[] arrayOfStrings = {"Eminem", "Jay-Z", "Rihanna", "Britney", "JustinTimberlake", "TaylorSwift", "SlimShady", "BananaGuy", "Moriarti", "Jlo", "BonneyM", "Putin", "Oxxy", "PapaRimskiy", "Rasputin"};

        QuickSort<String> stringSorter = new QuickSort<>();
        stringSorter.qSort(arrayOfStrings, 0, arrayOfStrings.length - 1);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));


        return "Here we go again! Choose the next task 1 or 4:";
    }

    public static class BinarySearchTree{
        class Node {
            int key;
            Node left, right;

            public Node(int item) {
                key = item;
                left = right = null;
            }
        }

        Node root;

        BinarySearchTree() {
            root = null;
        }

        void insert(int key) {
            root = insertRec(root, key);
        }

        Node insertRec(Node root, int key) {
            Node result;

            if (root == null) {
                root = new Node(key);
                result = root;
            } else {
                if (key < root.key)
                    root.left = insertRec(root.left, key);
                else if (key > root.key)
                    root.right = insertRec(root.right, key);
                result = root;
            }

            return result;
        }

        void inorder() {
            inorderRec(root);
        }

        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.println(root.key);
                inorderRec(root.right);
            }
        }


    }
    static String BST(){
        {
            BinarySearchTree tree = new BinarySearchTree();

            for (int i : new int[]{50, 30, 20, 40, 70, 60, 80}) {
                tree.insert(i);
            }

            tree.inorder();
        }
        return "Here we go again! Choose the next task 1 or 4:";
    }
}


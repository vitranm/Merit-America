import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        DLL list1 = new DLL();
        DLL list2 = new DLL();
        DLL list3 = new DLL();


        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String file3 = "file3.txt";


        readData(list1, file1);
        readData(list2, file2);
        readData(list3, file3);


        displayData(list1);
        displayData(list2);
        displayData(list3);


        dispIntersect(list1, list2, list3);
    }


    public static void dispIntersect(DLL list1, DLL list2, DLL list3){
        DLL intersectList = new DLL();
        intersectList = intersectList.intersection(list3,intersectList.intersection(list1, list2));
        if(intersectList.head!=null){
            System.out.print("Intersecting numbers: ");
            intersectList.printList();
        }else{
            System.out.println("No Intersecting Numbers Found");
        }
    }


    public static void readData(DLL dll,String f){
        File path = new File(f);
        try {
            Scanner sc = new Scanner(path);
            while(sc.hasNextInt()){
                DLLNode p = new DLLNode(sc.nextInt());
                dll.addToTail(p);
            }
            sc.close();
        } catch(IOException e) {
            System.out.println("Can not find file: "+e.getMessage());
        }
        return;
    }


    public static void displayData(DLL dll){

        if(dll.head != null ){

            System.out.println("List Size: "+dll.listSize);


            DLLNode midTemp = dll.findMiddle();
            if(dll.listSize%2==0){
                System.out.println("First Middle Number: "+ midTemp.prev.num);
                System.out.println("Second Middle Number: "+ midTemp.num);
            }else{
                System.out.println("Middle Number: "+ midTemp.num);
            }

            dll.displayPrimes();

            dll.printReverse();
        }else{
            System.out.println("List is empty");
        }
        System.out.print("\n");
    }

}
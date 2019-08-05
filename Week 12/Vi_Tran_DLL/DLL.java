public class DLL {
    public DLLNode head;
    public DLLNode tail;
    public int listSize;

    DLL(){
        head = null;
        tail = null;
        listSize = 0;
    }


    public void addToTail(DLLNode p){
        if (head == null){
            head = p;
            tail = p;
        } else {
            p.prev = tail;
            tail.next = p;
            tail = p;
        }
        listSize++;
    }


    public DLLNode findMiddle(){
        DLLNode temp = head;
        for(int i = 0; i<(listSize/2);i++){
            temp=temp.next;
        }
        return(temp);
    }


    public void displayPrimes(){
        int count = 0;
        boolean hasPrimes = false;
        DLLNode temp = head;
        System.out.print("Prime Numbers:");
        while(temp!=null){
            if(temp.num!= 1){
                if(isPrime(temp.num)){
                    if(count == 5){
                        System.out.print("\nPrime Numbers:");
                        count = 0;
                    }
                    System.out.print(" "+temp.num);
                    hasPrimes = true;
                    count++;
                }
            }
            temp = temp.next;
        }
        if(hasPrimes == false){
            System.out.print("No prime numbers found.");
        }
        System.out.print("\n");
    }


    public static boolean isPrime(int n)
    {
        boolean res = true;
        for (int i = 2; i <= Math.sqrt(n);i++){
            if(n%i==0){
                res = false;
                break;
            }
        }
        return(res);
    }


    public void printReverse(){
        DLLNode temp = tail;
        System.out.print("Numbers in list(Reverse Order): ");
        while (temp != null){
            System.out.print(temp.num + " ");
            temp = temp.prev;
        }
        System.out.print("\n");
    }


    public void printList(){
        DLLNode temp = head;
        while (temp != null){
            System.out.print(temp.num + " ");
            temp = temp.next;
        }
        System.out.print("\n");
    }


    public DLL intersection(DLL d1,DLL d2){
        DLLNode temp1 = d1.head;
        DLL tempList = new DLL();
        while(temp1!=null){
            DLLNode temp2 = d2.head;
            while(temp2!=null){
                if(temp1.num==temp2.num){
                    DLLNode duplicateCheck = tempList.head;
                    boolean alreadyAdded = false;
                    while(duplicateCheck!=null){
                        if(temp1.num==duplicateCheck.num){
                            alreadyAdded = true;
                            break;
                        }
                        duplicateCheck = duplicateCheck.next;
                    }
                    if(alreadyAdded==false){
                        tempList.addToTail(new DLLNode(temp1.num));
                    }
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return(tempList);
    }
}
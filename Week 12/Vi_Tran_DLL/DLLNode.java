pupublic class DLLNode {
    public int num;
    public DLLNode next;
    public DLLNode prev;

    DLLNode(int n){
        next = null;
        prev = null;
        num = n;
    }
}

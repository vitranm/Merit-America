public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head != null) {
          if (head.next == null) {
            head = null;
          } else {
            Node runner = head;
            while(runner.next != null) {
              if (runner.next.next == null) {
                runner.next = null;
              } else {
                runner = runner.next;
              }
            }

          }
        }
    }

    public void printValues() {
      if (head == null) {
        System.out.println("List is empty");
      } else {
        Node runner = head;
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
      }
    }
}

public class PhoneTester {

    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 56, "Verizon", "Incoming Call! Incoming Call!");
        IPhone iPhoneX = new IPhone("X", 88, "T-Mobile", "Ding Ding Ding!");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iPhoneX.displayInfo();
        System.out.println(iPhoneX.ring());
        System.out.println(iPhoneX.unlock());
    }

}

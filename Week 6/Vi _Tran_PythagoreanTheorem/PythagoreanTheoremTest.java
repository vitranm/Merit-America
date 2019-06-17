public class PythagoreanTheoremTest {
    public static void main (String[] args) {
        Pythagorean pythagorean = new Pythagorean();
        double answer = pythagorean.calculateHypotenuse(12, 12);
        System.out.println(answer);
    }
}
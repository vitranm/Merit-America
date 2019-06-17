public class PythagoreanTheorem{  
    
   public double calculateHypotenuse(int legA, int legB) {
        int sideA = legA * legA;
        int sideB = legB * legB;
        double hypotenuse = Math.sqrt(sideA + sideB);
        return hypotenuse;
    }
}

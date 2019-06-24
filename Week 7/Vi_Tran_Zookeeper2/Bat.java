public class Bat extends Mammal {
    public Bat(){
        super();
        this.energyLevel = 300;
    }
    
    public Bat fly(){
        System.out.println("Bat flying away...");
        this.energyLevel -= 50;
        return this;
    }
    
    public Bat eatHumans(){
        System.out.println("Little kids taken by the Bat");
        this.energyLevel +=25;
        return this;
    }

    public Bat attackTown(){
        System.out.println("A storm of Bats heading for town...");
        this.energyLevel -= 100;
        return this;
    }
}

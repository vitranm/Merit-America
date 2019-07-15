import java.util.ArrayList;

public class Calculator implements java.io.Serializable {

    private ArrayList<Double> operands = new ArrayList<>();
    private boolean operandsSet = false;
    private int operandsSize = 0;
    private ArrayList<String> operations = new ArrayList<>();
    private boolean operationsSet = false;
    private int operationsSize = 0;

    private double total;
    private boolean totalSet = false;

    public Calculator() {
    }

    public void performOperation(double operand) {

        if(!operandsSet) {
            operands.add(operand);
            operandsSet = true;
            operandsSize++;

        } else if(operationsSet) {

            if(operandsSize == operationsSize) {

                if(operations.get(operandsSize-1) == "*") {
                    operands.set(operandsSize-1, (operands.get(operandsSize-1)*operand));
                    operations.remove(operationsSize-1);
                    operationsSize--;

                } else if(operations.get(operationsSize-1) == "/") {
                    operands.set(operandsSize-1, (operands.get(operandsSize-1)/operand));
                    operations.remove(operationsSize-1);
                    operationsSize--;

                } else {
                    operands.add(operand);
                    operandsSize++;
                }
            }

        } else {
            throw new IllegalThreadStateException();
        }
    }
    public void performOperation(String operation) {

        if(operation != "=" && operation != "+" && operation != "-" && operation != "*" && operation != "/") {
            throw new UnsupportedOperationException();

        } else if(operation == "=") {

            if(!operandsSet) {
                throw new IllegalThreadStateException();

            } else {
                this.total = operands.get(0);
                for(int i=1; i<operandsSize; i++) {
                    if(operations.get(i-1) == "+") {
                        this.total += operands.get(i);
                    } else {
                        this.total -= operands.get(i);
                    }
                }

                this.totalSet = true;
            }

        } else if(operationsSize == operandsSize-1) {
            operations.add(operation);
            operationsSet = true;
            operationsSize++;

        } else {
            throw new IllegalThreadStateException();
        }
    }
    public void getResults() {
        if(totalSet == true) {
            System.out.println(this.total);
        } else {
            throw new IllegalThreadStateException();
        }
    }
}

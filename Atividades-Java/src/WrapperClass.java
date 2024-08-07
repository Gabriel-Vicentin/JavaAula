public class WrapperClass {
    public static void main(String[] args) {
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("Numero convertido: " + number);
        int num1 = 10;
        int num2 = 20;
        int comparisonResult = Integer.compare(num1, num2);

        if (comparisonResult < 0){
            System.out.println(num1 + " é menor que " + num2);
        } else if (comparisonResult > 0) {
            System.out.println(num1 + "é maior que " + num2);
        } else {
            System.out.println(num1 + "é igual a " + num2);
        }
    }
}

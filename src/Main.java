public class Main {

    public static void main(String[] args) {

        String newString = "Termen" ;
        System.out.println(newString);

        for (int i = 1; i <= 5; i++) {
            if (i%2==0){
                System.out.println("Numar par:");
            }
            else {
                System.out.println("Numar impar:");
            };
            System.out.println("i = " + i);
        }
    }
}
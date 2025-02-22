public class TriangularPatterns {
    public static void main(String[] args) {
        System.out.println("Pattern A");
    for(int i=1;i<7;i++){
        for(int j=1;j<i+1;j++) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
        System.out.println(" ");

        System.out.println(" ");

        System.out.println("Pattern B");
        for(int i=6; i>0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println(" ");


        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--) {
                if (j <= i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(" ");


        System.out.println("Pattern D");
        for(int i=6; i>=1; i--){
            for(int s = 6; s >= 1+i; s--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

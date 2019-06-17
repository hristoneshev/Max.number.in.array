public class Main {

    public static void main(String[] args) {

        int [] array = {3,-1,4,12,-10,34,-23,100};
        int MAX = array [0];

        for (int i=1; i<array.length; i++) {
            if (MAX<array[i]) {
                MAX = array[i];
            }
        }
        System.out.println("MAX element is " + MAX);
    }
}

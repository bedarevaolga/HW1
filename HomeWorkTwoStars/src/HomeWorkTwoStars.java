public class HomeWorkTwoStars {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int[] b = new int[a.length];

        int sum = 0;
        int st = 1;


        if (a[0] < a[1]) {
            b[0]= 1;
        }
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                st += 1;
                b[i]= st;
               
            } else {}
            System.out.print(b[i]);


        System.out.print(b[i]);}
    }
}




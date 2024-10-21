public class array {
    public static void main(String args[]) {
        // int num[] = { 1, 2, 3, 4 };
        // for (int i = 0; i < num.length; i++) {
        //     System.out.println(num[i]);
        // }
        // // Another declaration of an array
        // int num2[] = new int[4];
        // // default values when using above declaration
        // /*
        //  * int -> 0
        //  * double -> 0.0
        //  * boolean -> false
        //  * char -> null character
        //  * String -> null
        //  */

        // // multi-dimensional array
        // int multi[][] = new int[4][3]; // 4 rows and 3 columns
        // int n = multi.length; //number of rows
        // int m = multi[0].length; //number of columns
        // System.out.println(n);
        // System.out.println(m);

        //jagged array
        int jagg_arr[][] = new int[3][]; //when we are not sure that how many columns we have
        //we can have different sized internal arrays.
        jagg_arr[0] = new int[3];
        jagg_arr[1] = new int[4];
        jagg_arr[2] = new int[2];
        for(int i=0;i<3;i++){
            for(int j=0;j<jagg_arr[i].length;j++){
                jagg_arr[i][j] = 2;
            }
        }
    }
}

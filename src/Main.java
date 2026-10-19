import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //41
        Scanner scanner = new Scanner(System.in);
        System.out.print("eded daxil edin:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("cut eded");
        } else {
            System.out.println("tek eded:");
        }


        //42

        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();
        int cem = 0;

        for (int i = 1; i <= n; i++) {
            cem += i;
        }

        System.out.println(cem);



        //43
        int[] arr = {1, 3, 4, 6, 7, 9, 10, 12};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max:" + max);
        System.out.println(("min:" + min));

//46
        String orig = "hello";
        String revers = new StringBuilder(orig).reverse().toString();
        System.out.println(revers);

//47
        Scanner sc = new Scanner(System.in);

        System.out.print("soz daxil edin:");
        String input = sc.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom deyl");
        }


//48
        int[]arr2={3,6,2,8,9,4};
        int sum=0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }

        int edediorta = (int) sum / arr2.length;
        System.out.println("sum: " + sum);
        System.out.println("ededi orta: " + edediorta);



        //50
        int[] arr3 = {9, 5, 4, 8, 1, 7, 3};
        for (int i = 0; i < arr3.length - 1; i++) {
            for (int j = 0; j < arr3.length - 1 - i; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);

        }

    }
}
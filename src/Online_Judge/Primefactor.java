package Online_Judge;


    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

public class Primefactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String aa=s.nextLine();
            if(aa.equals("0")){
                System.exit(0);
            }
            else {
                String strNew = aa.replace("-", "");
                String[] bb = aa.split("");
//                String t=deleteCharAt(0,bb);
                if (bb[0].equals("-")) {
                    System.out.print("-1 x ");
                    int i = 0;

                    for (Integer integer : primeFactors(Integer.parseInt(strNew))) {
                        List<Integer> ans = primeFactors(Integer.parseInt(strNew));
                        if (i == ans.size() - 1) {
                            System.out.print(integer);
                            break;
                        }
                        System.out.print(integer + " x ");
                        i++;
                    }
                    System.out.println();
                } else {
                    List<Integer> ans = primeFactors(Integer.parseInt(aa));
                    int i = 0;
                    for (Integer integer : primeFactors(Integer.parseInt(aa))) {

                        if (i == ans.size() - 1)
                            System.out.print(integer);
                        else
                            System.out.print(integer + " x ");
                        i++;
                    }
                    System.out.println();
                }
            }
        }
    }


    public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
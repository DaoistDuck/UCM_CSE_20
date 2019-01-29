import java.util.Scanner;

public class DataAnalyze {
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        int n,t;
        int trial0avg = 0, trial1avg = 0, trial2avg = 0, trial3avg = 0;
        System.out.println("Please enter the sample size");
        int samplesize = kybd.nextInt();

        int trial0 [] = new int[samplesize];
        int trial1 [] = new int[samplesize];
        int trial2 [] = new int[samplesize];
        int trial3 [] = new int[samplesize];

        for( n =0; n < 4; ++n) {
            System.out.println("Enter numbers for Trial " + n);

            for(t = 0; t < samplesize; ++t) {
                System.out.println("Enter sample #" + t + ":");
                if (n == 0) {
                    trial0[t] = kybd.nextInt();
                    trial0avg += trial0[t];
                } else if (n == 1) {
                    trial1[t] = kybd.nextInt();
                    trial1avg += trial1[t];
                } else if (n == 2) {
                    trial2[t] = kybd.nextInt();
                    trial2avg += trial2[t];
                } else if (n == 3) {
                    trial3[t] = kybd.nextInt();
                    trial3avg += trial3[t];
                }
            }
        }

        trial0avg = trial0avg/samplesize;
        trial1avg = trial1avg/samplesize;
        trial2avg = trial2avg/samplesize;
        trial3avg = trial3avg/samplesize;
        int maxofAvgs = Math.max(trial0avg, Math.max(trial1avg, Math.max(trial2avg, trial3avg)));
        int minofAvgs = Math.min(trial0avg, Math.min(trial1avg, Math.min(trial2avg, trial3avg)));
        System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");

        for(t = 0; t < trial0.length; ++t) {
            System.out.println("\t" + t + "       \t" + trial0[t] + "    \t" + trial1[t] + "    \t" + trial2[t] + "    \t" + trial3[t]);
        }
        System.out.println("    -------------------------------------------");
        System.out.println("Average:     \t" + trial0avg + "    \t" + trial1avg + "    \t" + trial2avg + "    \t" + trial3avg);
        System.out.println("Min Average: " + minofAvgs);
        System.out.println("Max Average: " + maxofAvgs);
        if (maxofAvgs == minofAvgs) {
            System.out.println("The trials match EXACTLY");
        } else if (maxofAvgs < 2 * minofAvgs) {
            System.out.println("The trials concur with each other!");
        } else if (maxofAvgs > 2 * minofAvgs) {
            System.out.println("The trials do not concur!");
        }

    }
}

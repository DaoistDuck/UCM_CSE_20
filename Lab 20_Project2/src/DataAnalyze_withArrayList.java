import java.util.*;

public class DataAnalyze_withArrayList {
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        ArrayList<Integer> trial0 = new ArrayList<>();
        ArrayList<Integer> trial1 = new ArrayList<>();
        ArrayList<Integer> trial2 = new ArrayList<>();
        ArrayList<Integer> trial3 = new ArrayList<>();
        int t, n = 0;
        int samplesize, trial0avg = 0, trial1avg = 0, trial2avg = 0, trial3avg = 0;

        System.out.println("Please enter the sample size");
        samplesize = kybd.nextInt();

        while (n < 4) {
            System.out.println("Enter numbers for Trial " + n);
            for (t = 0; t < samplesize; t++) {

                System.out.println("Enter sample #" + t + ":");
                if (n == 0) {
                    trial0.add(kybd.nextInt());
                    trial0avg += trial0.get(t);
                } else if (n == 1) {
                    trial1.add(kybd.nextInt());
                    trial1avg += trial1.get(t);
                } else if (n == 2) {
                    trial2.add(kybd.nextInt());
                    trial2avg += trial2.get(t);
                } else if (n == 3) {
                    trial3.add(kybd.nextInt());
                    trial3avg += trial3.get(t);
                }
            }
            n++;
        }
        trial0avg = trial0avg/samplesize;
        trial1avg = trial1avg/samplesize;
        trial2avg = trial2avg/samplesize;
        trial3avg = trial3avg/samplesize;

        int maxofAvgs = Math.max(trial0avg, Math.max(trial1avg, Math.max(trial2avg, trial3avg)));
        int minofAvgs = Math.min(trial0avg, Math.min(trial1avg, Math.min(trial2avg, trial3avg)));

        System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4"); // Table header line

        for (t = 0; t < trial0.size(); t++) {
            System.out.println("\t" + t + "       \t" + trial0.get(t) + "    \t" + trial1.get(t) + "    \t" + trial2.get(t) + "    \t" + trial3.get(t));
        }

        System.out.println("    -------------------------------------------");
        System.out.println("Average: " + "    \t" + trial0avg + "    \t" + trial1avg + "    \t" + trial2avg + "    \t" + trial3avg);
        System.out.println("Min Average: " + minofAvgs);
        System.out.println("Max Average: " + maxofAvgs);

        if (maxofAvgs == minofAvgs) {
            System.out.println("The trials match EXACTLY");
        } else if (maxofAvgs < (2 * minofAvgs)) {
            System.out.println("The trials concur with each other!");
        } else if (maxofAvgs > (2 * minofAvgs)) {
            System.out.println("The trials do not concur!");
        }
    }
}

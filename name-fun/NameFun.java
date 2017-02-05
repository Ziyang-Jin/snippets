public class NameFun {
    private String name;
    private int count;

    public NameFun(String name) {
        this.name = name;
        this.count = 0;
    }

    public void allPermutations() {
        printPermutation("", name);
        validateNumResults();
    }

    private void printPermutation(String permutation, String remain) {
        if (remain.length() == 0 && !permutation.isEmpty()) {
            count++;
            System.out.println(count + ": " + permutation);
        } else {
            for (int i = 0; i < remain.length(); i++) {
                String newPermutation = permutation + remain.charAt(i);
                String newRemain = remain.substring(0, i) + remain.substring(i+1);
                printPermutation(newPermutation, newRemain);
            }
        }
    }

    private void validateNumResults() {
        int expected = factorial(name.length());
        printMsg(count == expected, expected);
    }

    private int factorial(int n) {
        int result = n != 0 ? 1 : 0;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }

    private void printMsg(boolean correct, int expected) {
        String head = "Correct";
        String verb = "are";
        String result = "results";
        if (expected < 2) {
            verb = "is";
            result = "result";
        }
        if (!correct) {
            head = "Wrong";
            verb = "should be";
        }
        System.out.println(head + "! There " + verb + " " +  expected + " " + result + ".");
    }
}

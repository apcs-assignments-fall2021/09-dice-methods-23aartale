public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int random = (int) (Math.random() *6 + 1);
        return random;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        double counter = 0;
        for (int i = 0; i < 10000; i++) {
            int x = 0;
            for (int j = 0; j < 6 && x < 1; j++) {
                int random = (int) (Math.random() * 6) + 1;
                if (random == 6) {
                    x += 1;
                }
                if (x == 1){
                    counter +=1;
                }}}
                double end = (counter/10000) * 100;
            return end;
    }
    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double counter = 0;
        for (int i = 0; i < 10000; i++){
            int x = 0;
            for (int j=0; j<12 && x<2; j++){
                int random = (int) (Math.random() *6) + 1;
                if (random ==6){
                    x += 1;
                }
                if (x == 2){
                    counter +=1;
                }
            }
        }
        double end = (counter/10000) * 100;
        return end;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double counter = 0;
        for (int i = 0; i < 10000; i++){
            int x = 0;
            for (int j=0; j<18 && x<3; j++){
                int random = (int) (Math.random() *6) + 1;
                if (random ==6){
                    x += 1;
                }
                if (x == 3){
                    counter +=1;
                }
            }
        }
        double end = (counter/10000) * 100;
        return end;
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}

public class Marathon {
    public static int fastest(int[] arrayTimes){
        int fast = arrayTimes[0];
        int j = 0;
        for(int i = 1; i <= arrayTimes.length - 1; i++){
            if(arrayTimes[i] < fast){
                fast = arrayTimes[i];
                j = i;
            }
        }
        return j;
    }

    public static int SecondFastest(int[] arrayTimes, int fastest){
        int second = arrayTimes[0];
        int j = 0;
        int fast = arrayTimes[fastest];

        for(int i = 0; i < arrayTimes.length; i++){
            if(second >= fast){
                second = arrayTimes[i];
                j = i;
            }
        }
        return j;
    }

    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        int fastestPlayer = fastest(times);
        int secondPlayer = SecondFastest(times, fastestPlayer);

        for (int i = 0; i < names.length; i++) {
            if(fastestPlayer == i) {
                System.out.println("Fastest Player: " + names[i] + ": " + times[i]);
            }
        }

        for (int i = 0; i < names.length; i++) {
            if(secondPlayer == i) {
                System.out.println("Second Player: " + names[i] + ": " + times[i]);
            }
        }
    }

}

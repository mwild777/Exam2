public class LogicKnowledge {
    public static void main(String[] args) {
        System.out.println(greenTicket(1, 2, 3));
        System.out.println(greenTicket(2, 2, 2));
        System.out.println(greenTicket(1, 1, 2));
        System.out.println();
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
        System.out.println(makeChocolate(4, 2, 7));
    }
    public static int greenTicket(int one, int two, int three) {
        int tracker = 0;
        if (one == two || two == three || three == one) {
            if (one == two && three == one) {
                return 20;
            }
            return 10;
        }
        return tracker;
    }
    public static int makeChocolate(int small, int large, int goal) {
        int largeNumber = goal / 5;
        if (largeNumber > large) {
            return -1;
        }
        if (small < (goal - (largeNumber * 5))) {
            return -1;
        }
        return (goal - (largeNumber * 5));
    }
}

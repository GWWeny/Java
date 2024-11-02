package homework.a23HanoiTower;

public class HanoiTower {
    public static void main(String[] args) {
        solveHanoi(3, 'A', 'B', 'C');
    }
    public static void solveHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Disk 1 moved from " + from + " to " + to);
            return;
        }
        solveHanoi(n - 1, from, aux, to);
        System.out.println("Disk " + n + " moved from " + from + " to " + to);
        solveHanoi(n - 1, aux, to, from);
    }
}

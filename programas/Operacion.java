public class Operacion {
    double x;
    double y;

    public Operacion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void printResultado() {
        System.out.println("X = " + x + '\n' + "y = " + y + '\n' + "suma:" + (x + y) + '\n' + "resta:" + (x - y) + '\n'
                + "miltiplicacion:" + (x + y) + '\n' + "divicion:" + (x / y) + '\n' + "modulo:" + (x % y));

    }

}

public class Ejercicio1 {
    public static void main(String[] args) {
        int diasEnUnAnio = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        int segundosEnUnAnio = calcularSegundosEnUnAnio(diasEnUnAnio, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);
        System.out.println("El número de segundos en un año es: " + segundosEnUnAnio);
    }

    public static int calcularSegundosEnUnAnio(int dias, int horas, int minutos, int segundos) {
        int segundosEnUnDia = horas * minutos * segundos;
        int segundosEnUnAnio = dias * segundosEnUnDia;
        return segundosEnUnAnio;
    }
}

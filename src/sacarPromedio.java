import javax.swing.*;

public class sacarPromedio {
    public static void main(String[] args) {
        int nota1;
        int nota2;
        int nota3;
        double notaSuma;
        double promedio;

        System.out.println("Vamos a tomar sus notas de los parciales, son 3");
        nota1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese  su primer nota: "));
        nota2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segunda nota: "));
        nota3= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su tercer nota: "));
        notaSuma=nota1 + nota2 + nota3;
        promedio = notaSuma/3;
        System.out.println("su promedio fue de: "+promedio);

    }
}

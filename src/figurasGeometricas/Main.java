package figurasGeometricas;

import javax.swing.*;
import java.awt.Graphics;

public class Main {
    public static void main(String[] args) {
        CirculoDibujable circulo = new CirculoDibujable(100, 50, 100);
        CuadradoDibujable cuadrado = new CuadradoDibujable(100, 200, 100);

        System.out.println("Perimetro del circulo es: " + circulo.getPerimetro());
        System.out.println("Area del circulo es: " + circulo.getArea());
        System.out.println("Perimetro del cuadrado es: " + cuadrado.getPerimetro());
        System.out.println("Area del cuadrado es: " + cuadrado.getArea());

        JFrame frame = new JFrame("Dibujar figuras");
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                circulo.dibujar2D(g);
                cuadrado.dibujar2D(g);
            }
        };

        panel.setPreferredSize(new java.awt.Dimension(400, 300));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
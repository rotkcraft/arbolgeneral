package paquete;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 * Creado por hadexexplade el 01 de febrero del 2016
 */
public class Escena extends JPanel
{
    private ArbolGeneral<Character> arbolGeneral;
    private PanelArbol<Character> vista;
    public Escena()
    {
        this.arbolGeneral=new ArbolGeneral<Character>();
        Elemento<Character> elemento=arbolGeneral.insertarRaiz('B');
        arbolGeneral.insertarHijo(elemento,'A');
        elemento=arbolGeneral.insertarHijo(elemento,'D');
        arbolGeneral.insertarHijo(elemento,'C');
        arbolGeneral.insertarHijo(elemento,'E');
        elemento=arbolGeneral.insertarHijo(elemento,'G');
        arbolGeneral.insertarHijo(elemento,'F');
        elemento=arbolGeneral.insertarHijo(arbolGeneral.getRaiz(),'I');
        arbolGeneral.insertarHijo(elemento,'H');
        arbolGeneral.insertarHijo(elemento,'L');
        elemento=arbolGeneral.insertarHijo(arbolGeneral.getRaiz(),'O');
        arbolGeneral.insertarHijo(elemento,'M');
        this.vista=new PanelArbol<Character>(arbolGeneral);
        this.setLayout(new BorderLayout());
        add(vista,BorderLayout.CENTER);


    }
}

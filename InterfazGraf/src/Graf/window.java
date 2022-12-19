/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graf;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Yuyots
 */
public class window extends JFrame{
    final private Font font = new Font("Segoe print", Font.BOLD,18);//fuente que queremos en nuestro Frame
    JTextField tfFirstName, tfLastName;//creando el textField donde ingresara datos
    
     //create the constructor
    public window() throws HeadlessException {
        //-------------FORM PANEL----------------------------
        
        //creando etiqueta para que ingrese su primer nombre
        JLabel lbFirstName = new JLabel("First Name ");//primer nombre del usuario
        lbFirstName.setFont(font);
        
        //utilizando al objeto tfFirstName para el ingreso de datos del primer nombre
        tfFirstName = new JTextField();
        tfFirstName.setFont(font);
        
        //creando obejto de apellido con la clase JLabel
        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(font);
        
        //utilizando al objeto tfLastName para el ingreso de datos del apellido
        tfLastName = new JTextField();
        tfLastName.setFont(font);
        
        //creando panel para contener todos nuestros componentes
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        //agregando componentes a nuestro Frame
        formPanel.add(lbFirstName);//etiqueta para el nombre
        formPanel.add(tfFirstName);//campo de texto para el nombre
        formPanel.add(lbLastName);//etiqueta para el apellido
        formPanel.add(tfLastName);//campo de texto para el apellido
        
        //-------------Finish of FORM PANEL----------------------------------------------
                
        //Frame principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());//localizaciones en el frame (centro, arriba, abajo, izquierda, derecha)
        mainPanel.setBackground(Color.darkGray);
        //agregar a formPanel en mainPanel
        mainPanel.add(formPanel,BorderLayout.NORTH);//ira en la parte de arriba del Frame
        
        setTitle("Welcome to my first Frame");//titulo de la interfaz
        setSize(500, 600);//dimensiones de la interfaz grafica
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);//haciendo visible al Frame
    }
    
}

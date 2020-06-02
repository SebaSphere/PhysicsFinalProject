/*
Note: Hopefully I've added enough comments to help the average person understand better what this code does. Code should be easier to understand if you
have some knowledge of object orientated programming concepts.
 */

package me.sebastian;

import me.sebastian.projectilemotion.ProjectileMotion;

import javax.swing.*;

//Main class to initialize GUI
//This class asks you messages for different variables and sends it to the ProjectileMotion class
public class PhysicsVideoProject {

    static JFrame jFrame = new JFrame();

    public static void main(String[] args) {
        double angle = Double.parseDouble(JOptionPane.showInputDialog("What's the angle. ONLY ENTER INTEGERS"));
        double vInitial = Double.parseDouble(JOptionPane.showInputDialog("What's the vInitial"));
        double gravity = Double.parseDouble(JOptionPane.showInputDialog("What's the gravity. Hint: Earth Gravity is 9.8m/s"));

        //this calls the constructor in ProjectileMotion and sends it those variables.
        ProjectileMotion projectileMotion = new ProjectileMotion(angle,vInitial,gravity);







    }
}

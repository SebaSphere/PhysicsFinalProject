package me.sebastian.projectilemotion;

import javax.swing.*;

public class ProjectileMotion {
    static JFrame jFrame = new JFrame();

    private double angle;
    private double vInitial;
    private double gravity;


    //grabs values from methods of those names to store for later use in method printOutput().
    private double calcHeight;
    private double calcDistance;
    private double calcTime;

    //the constructor. Grabs input from main class
    public ProjectileMotion(double angle, double vInitial, double gravity) {
        this.angle = angle;
        this.vInitial = vInitial;
        this.gravity = gravity;

        calcProjectileHeight(angle,vInitial);
        calcProjectileDistance(angle,vInitial);
        calcTime(calcDistance, gravity);
        printOutput(angle,vInitial,gravity,calcHeight,calcDistance,calcTime);
    }

    //method to calc Y
    protected void calcProjectileHeight(double angle, double vInitial) {
        double calcHeight = vInitial*(Math.sin(Math.toRadians(angle)));
        this.calcHeight = calcHeight;
    }

    //method to calc X
    protected void calcProjectileDistance(double angle, double vInitial) {
        double calcDistance = vInitial*(Math.cos(Math.toRadians(angle)));
        this.calcDistance = calcDistance;
    }

    //method to calc time
    protected void calcTime(double calcHeight, double gravity) {
        double calcTime = calcHeight / (0.5 * gravity);
        this.calcTime = calcTime;
    }

    //grabs input from constructor and inputs em here
    //this also prints the answers
    protected void printOutput(double angle, double vInitial, double gravity, double calcHeight, double calcDistance, double calcTime) {
        JOptionPane.showMessageDialog(jFrame, "Gravity given: " + gravity + "m/s^2" +
                "\nvInitial given: " + vInitial + "m/s" +
                "\nAngle given: " + angle + "°\n\n" +

                "The height/y is " + calcHeight + "m tall." +
                "\nvInitial * (sin(angle))\n\n" +

                "The distance/x is " + calcDistance + "m tall." +
                "\nvInitial * (cos(angle))\n\n" +

                "The time is " + calcTime + "s\nt = Delta Y / (0.5 * g)"
        );
    }
}

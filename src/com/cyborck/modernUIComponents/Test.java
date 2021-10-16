package com.cyborck.modernUIComponents;

import javax.swing.*;
import java.awt.*;

public class Test {

    public static void main ( String[] args ) {
        test( new Button( "Hallo" ) );
    }

    private static void test ( Component component ) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        JPanel panel = new JPanel();
        panel.setLayout( new FlowLayout() );
        panel.add( component );
        frame.add( panel );

        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }
}

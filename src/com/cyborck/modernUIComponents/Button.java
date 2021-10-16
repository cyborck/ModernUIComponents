package com.cyborck.modernUIComponents;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Button extends JLabel {
    private static final int BORDER_OFFSET = 10;

    private static final Color DEFAULT_BACKGROUND = new Color( 180, 92, 23 );
    private static final Color DEFAULT_FOREGROUND = Color.WHITE;
    private static final Font DEFAULT_FONT = new Font( "Arial", Font.BOLD, 20 );

    public Button ( String text ) {
        setOpaque( true );
        setHorizontalAlignment( SwingConstants.CENTER );

        setBackground( DEFAULT_BACKGROUND );
        setForeground( DEFAULT_FOREGROUND );
        setFont( DEFAULT_FONT );
        setText( text );
    }

    @Override
    public void setBackground ( Color bg ) {
        super.setBackground( bg );

        //also update border
        setBorder( createBorder() );
    }

    private Border createBorder () {
        Border outerBorder = BorderFactory.createLineBorder( DEFAULT_FOREGROUND, 20, true );
        Border innerBorder = BorderFactory.createEmptyBorder( BORDER_OFFSET, BORDER_OFFSET, BORDER_OFFSET, BORDER_OFFSET );
        return BorderFactory.createCompoundBorder( outerBorder, innerBorder );
    }
}

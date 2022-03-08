package sistemagestionnotas;
/**
 *
 * @author1 Daniel Arbeláez Álvarez
 * @author2 Sebastián Mejía Serna
 */

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.jvnet.substance.SubstanceLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal 
{
    
    public static void main(String[] args) 
    {
        try
        {
            UIManager.setLookAndFeel(new SubstanceLookAndFeel());
            
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");//Skin
            //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaBrickWallSkin");//Skin2
            //SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MangoSkin");//Skin3
            SubstanceLookAndFeel.setCurrentTheme("org.jvnet.Substance.theme.SubstanceLightAquaTheme");//Theme
            SubstanceLookAndFeel.setCurrentBorderPainter("org.jvnet.Substance.border.GlassBorderPainter");
	    
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        }
        catch(UnsupportedLookAndFeelException e)
        {
            JOptionPane.showMessageDialog(null, "ERROR"+e.getMessage());
        }
        framePresentación objF = new framePresentación();
        objF.setVisible(true);
    }
    
}

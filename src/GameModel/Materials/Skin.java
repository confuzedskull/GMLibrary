package GameModel.Materials;

import java.awt.Color;
/**
 * Skin is a type of material worn by animals
 * 
 * @author James Nakano
 * @version (a version number or a date)
 */
public class Skin extends Material 
{
    
    public Color tone;

    /**
     * Constructor for objects of class Skin
     */
    public Skin()
    {
        flamability=5;
        hardness=3;
        conductivity=5;
    }

    
}

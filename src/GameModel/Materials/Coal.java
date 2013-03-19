package GameModel.Materials;

import java.awt.Color;

/**
 * A black,brittle material used for making fire
 * @author James
 */
public class Coal extends Material
{

    public Coal()
    {
        durability=4;
        flamability=9;
        hardness=5;
        density=4;
        conductivity=4;
        color=Color.BLACK;
    }
    
}

package Core.C08Packet.libraries.slick.command;

/**
 * A control indicating that a mouse button must be pressed or released to cause an command
 * 
 * @author joverton
 */
public class MouseButtonControl implements Control {
	/** The button to be pressed */
    private int button;
    
    /**
     * Create a new control that indicates a mouse button to be pressed or released
     * 
     * @param button The button that should be pressed to cause the command
     */
    public MouseButtonControl(int button) {
        this.button = button;
    }

    /**
     * @see Object#equals(Object)
     */
    public boolean equals(Object o) {
        if (o instanceof MouseButtonControl) 
        {
        	return ((MouseButtonControl)o).button == button;
        }
        
        return false;
    }
    
    /**
     * @see Object#hashCode()
     */
    public int hashCode() {
        return button;
    }
}
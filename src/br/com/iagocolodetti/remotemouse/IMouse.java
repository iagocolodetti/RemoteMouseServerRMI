package br.com.iagocolodetti.remotemouse;

/**
 *
 * @author iagov
 */
public interface IMouse {
    
    public void click(int button);
    
    public void cursor(int move, int direction);
    
    public void scroll(int direction);
    
}

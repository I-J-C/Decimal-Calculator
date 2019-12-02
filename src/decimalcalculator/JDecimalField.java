/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalcalculator;

/**
 *
 * @author 01624142
 */
public class JDecimalField extends JRegExpField {
    public JDecimalField() {
        super();
        setExp("-?[0-9]*\\.?[0-9]*");
    }
    
    public double getValue() throws NumberFormatException {
        return Double.parseDouble(getText());
    }
    
}

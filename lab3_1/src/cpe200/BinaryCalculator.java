package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Created by pruet on 5/9/2559.
 */
    /* your code here */
public class BinaryCalculator {
    private BigDecimal st;
    private BigDecimal nd;
    public BinaryCalculator() {this.st = new BigDecimal(-1); this.nd = new BigDecimal(-1);} //default constructor
    public void setFirstOperand(Operand operand) {st = new BigDecimal(operand.operand);} // Object:class operand . Object:string operand
    public void setSecondOperand(Operand operand)
    {
        nd = new BigDecimal(operand.operand);
    }
    public String add() {return st.add(nd).stripTrailingZeros().toString();} // stripTrailingZeros : removing zero decimals
    public String subtract()
    {
        return st.subtract(nd).stripTrailingZeros().toString();
    }
    public String multiply()
    {
        return st.multiply(nd).stripTrailingZeros().toString();
    }
    /* This method should throw an exception when divide by zero */
    public String division() {
        if(nd.equals(0)) throw new RuntimeException(); // error
        return st.divide(nd, 5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    } // RoundingMode.HALF_UP) : Round up , 5 : int scale
}

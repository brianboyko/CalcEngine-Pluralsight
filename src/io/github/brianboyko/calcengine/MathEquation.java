package io.github.brianboyko.calcengine;

/**
 * Created by brianboyko on 7/10/16.
 */
public class MathEquation {

  public double leftVal;
  public double rightVal;
  public char opCode;
  public double result;

  public void execute(){
    switch (opCode) {
      case 'a':
        result = leftVal + rightVal;
        break;
      case 's':
        result = leftVal - rightVal;
        break;
      case 'd':
        result = (rightVal == 0.0) ? 0.0 : leftVal / rightVal;
        break;
      case 'm':
        result = leftVal * rightVal;
        break;
      default:
        System.out.println("Error - Invalid opcode");
        result = 0.0d;
        break;

    }
  }

}

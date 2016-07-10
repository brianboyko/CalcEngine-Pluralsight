package io.github.brianboyko.calcengine;

public class Main {

  public static void main(String[] args) {
    MathEquation[] equations = new MathEquation[6];
    equations[0] = new MathEquation(100.0d, 50.0d, 'd');
    equations[1] = new MathEquation(25.0d, 92.0d, 'a');
    equations[2] = new MathEquation(225.0d, 17.0d, 's');
    equations[3] = new MathEquation(11.0d, 3.0d, 'm');
    equations[4] = new MathEquation(99.0d, 33.0d);
    equations[5] = new MathEquation(666.6d);
    for (MathEquation equation : equations){
      equation.execute();
      System.out.print("result = ");
      System.out.println(equation.getResult());
    }
  }
}

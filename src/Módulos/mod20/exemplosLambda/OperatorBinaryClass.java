package Módulos.mod20.exemplosLambda;

import java.util.function.IntBinaryOperator;

public class OperatorBinaryClass implements IntBinaryOperator {


    @Override
    public int applyAsInt(int left, int right) {
        return left + right;
    }
}

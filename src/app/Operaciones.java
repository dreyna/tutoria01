package app;

public class Operaciones {
    double suma(double a, double b){
        return a+b;
    }
    double resta(double a, double b){
        return a-b;
    }
    double multiplicacion(double a, double b){
        return a*b;
    }
    double division(double a, double b){
        if(b==0){
            return 0;
        }
        return a/b;
    }
}
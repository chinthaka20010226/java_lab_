package pkgB;

import pkgA*;
import java.util.*;

class AccessDemo{
    public static void main(String args[]){
        Calculator c1=new Calculator();

        c1.getUserInputs();
        c1.displayValues();
    }
}
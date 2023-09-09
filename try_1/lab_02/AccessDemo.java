package pkgB;

import pkgA.*;

public class AccessDemo extends Calculator{
    public static void main(String args[]){
         Calculator c1=new Calculator();
     //     AccessDemo c1=new AccessDemo();

         // Invoke the getUserInputs method on the object
         c1.getUserInputs();

         // Invoke the displayValues method on the object
         c1.displayValues();

    }

}



// =================================================================================================

// ----> compile and run in terminal,
          /* 
          javac -d D:\UOM\L2_S1\OOP\try_1\lab_02 Calculator.java
          javac -d D:\UOM\L2_S1\OOP\try_1\lab_02 AccessDemo.java
          javac AccessDemo
          java pkgB.AccessDemo
          */

// ----> nature error,
          /* 
          .\AccessDemo.java:10: error: getUserInputs() is not public in Calculator; cannot be accessed from outside package      
               c1.getUserInputs();
                 ^
          .\AccessDemo.java:13: error: displayValues() is not public in Calculator; cannot be accessed from outside package      
               c1.displayValues();
                 ^
          2 errors
          */

          /* 
          because, Access modifire of methods in Calculator calss 'default',
          therefore we can't access that. 'default' modifire can access only
               wuthin class & within package
          */


// ----> Access modifire ---> 'public'
          /*
          can be access any where.
           */


// ----> Access modifire ---> 'protected'
          /*
          .\AccessDemo.java:10: error: getUserInputs() has protected access in Calculator
               c1.getUserInputs();
                 ^
          .\AccessDemo.java:13: error: displayValues() has protected access in Calculator
               c1.displayValues();
                 ^ 
          2 errors
          */

          /*
          because, Access modifire 'protected' can be Access,
               within class, within package & outside package but subclass only
           */

          /*
          we can try above code this way,
          AccessDemo calss is a sub class of Calculator class, then we can try by making object of AccessDemo class
               AccessDemo c1=new AccessDemo();
               c1.getUserInput();
               c1.displayValues();

          but we can't creating an object of Calculator for access 'getUserInput()' and 'displayValues()',
          therefore AccessDemo is sub class of Calculator, Inherite Calculator to AccessDemo.
           */

          /*
          we have one problem of above code, we can use Access modifire 'protected' in another package but for sub class,
          but we can create object of Calculator,
          it has only one solution is using 'static'......
          propertice & method are 'static', then we can make object of Calculator and access method in 'static' main method.
          */


// Access modifire ---> 'private'
          /*
          .\AccessDemo.java:10: error: getUserInputs() has private access in Calculator
               c1.getUserInputs();
                 ^
          .\AccessDemo.java:13: error: displayValues() has private access in Calculator
               c1.displayValues();
                 ^
          2 errors
          */

          /*
          because, 'private' access modifire can be access only the class,
           */







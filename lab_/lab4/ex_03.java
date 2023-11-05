interface AnonymousInnerClass{
    void anonymousPrint();
}

class OuterClass{
    private int x=1000;

    class InnerClass{
        void nestedNum(){
            System.out.println(x+" value from Nested Inner class");
        }
    }
}

class MethodLocalClass{
    void outerMethod(){
        System.out.println("Inside the outerMethod in the MethodLocalClass");

        class InnerMethodLocalClass{
            void innerMethod(){
                System.out.println("Inside the innerMethod in the InnerMethodLocalClass");
            }
        }

        InnerMethodLocalClass localObject=new InnerMethodLocalClass();
        localObject.innerMethod();
    }
}

class MyInnerClass{
    public static void main(String args[]){
        OuterClass outerObject=new OuterClass();
        OuterClass.InnerClass innerObject=outerObject.new InnerClass();
        innerObject.nestedNum(); 

        AnonymousInnerClass anonymousObject=new AnonymousInnerClass() {
            public void anonymousPrint(){
                System.out.println("Inside the anonymousPrint in the AnonymousInnerClass");
            }
        };

        anonymousObject.anonymousPrint();
    }
}
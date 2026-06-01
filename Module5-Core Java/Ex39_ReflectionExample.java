import java.lang.reflect.Method;

class SampleClass {

    public void showMessage() {

        System.out.println("Reflection Works");
    }
}

class ReflectionExample {

    public static void main(String[] args)
            throws Exception {

        Class classInfo =
                Class.forName("SampleClass");

        Object objRef =
                classInfo.getDeclaredConstructor()
                        .newInstance();

        Method[] allMethods =
                classInfo.getDeclaredMethods();

        for(Method eachMethod : allMethods) {

            System.out.println(
                    eachMethod.getName());
        }

        Method targetMethod =
                classInfo.getDeclaredMethod(
                        "showMessage");

        targetMethod.invoke(objRef);
    }
}

/*
Output:
showMessage
Reflection Works
*/
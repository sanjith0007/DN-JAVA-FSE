class JavaModules {

    public static void main(String[] args) {

        System.out.println(
                "Create module-info.java in both modules");

        System.out.println(
                "Export utility package from com.utils");

        System.out.println(
                "Use requires com.utils in com.greetings");
    }
}

/*
Output:
Create module-info.java in both modules
Export utility package from com.utils
Use requires com.utils in com.greetings
*/
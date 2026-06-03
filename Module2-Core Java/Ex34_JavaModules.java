//module.java
 module com.utils {
    exports com.utils;
}
// Message
package com.utils;

public class MessageUtil {

    public static String getMessage() {
        return "Welcome to Java Modules";
    }
}


module com.greetings {
    requires com.utils;
}
//main.java
package com.greetings;

import com.utils.MessageUtil;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                MessageUtil.getMessage());
    }
}

/*
Output:
Welcome to Java Modules
*/
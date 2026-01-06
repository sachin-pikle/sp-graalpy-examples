package com.example;

import org.graalvm.polyglot.Context;
import org.graalvm.python.embedding.GraalPyResources;

public class HelloGraalPy {

    static void main() {

        try(Context context = GraalPyResources.contextBuilder()
                .build()) {
            context.eval("python",
                    // python
                    """
                            print('Hello GraalPy!')
                            """);
        }
    }
}
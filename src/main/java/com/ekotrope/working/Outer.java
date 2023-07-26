package com.ekotrope.working;

public class Outer {
    private String somePrivateString = "Hello";
    
    class Inner {
        private void methodThatAccessesOuterClassPrivateField() {
            somePrivateString = somePrivateString + ", world!";
        }
    }
}

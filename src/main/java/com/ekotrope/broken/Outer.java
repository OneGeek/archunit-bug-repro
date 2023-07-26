package com.ekotrope.broken;

public class Outer {
    private String somePrivateString = "Hello";
    
    class Inner {
        private void methodThatAccessesOuterClassPrivateField() {
            somePrivateString += ", world!";
        }
    }
}

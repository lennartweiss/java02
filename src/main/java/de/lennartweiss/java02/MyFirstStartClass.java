package de.lennartweiss.java02;

class MyFirstStartClass {

    public static void main(String[] args) {
        Variable variable = new Variable();
        System.out.println("Das ist die Variable: " + variable.getAenderMich());
        variable.setAenderMich("Bin jetzt anders");
        System.out.println("Das ist die Variable jetzt: " + variable.getAenderMich());
    }

}
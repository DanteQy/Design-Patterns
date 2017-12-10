/*
-Wrap a complicated subsystem with a simpler interface.

Problem:
A segment of the client community needs a simplified interface to the overall functionality of a complex subsystem.

Client */

class Facade {
    public static void main(String[] args) {
        CurstomerService customer = new CurstomerService();
        customer.help();
    }
}
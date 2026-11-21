
package org.example;

public class WaitStrategiesComparisonTest {

    public static void main(String[] args) {

        System.out.println("===== SELENIUM WAIT STRATEGIES =====");

        // IMPLICIT WAIT
        System.out.println("\n1. IMPLICIT WAIT");
        System.out.println("Applies globally to element searches.");
        System.out.println("Example: driver.manage().timeouts()");
        System.out.println("Useful for general element availability.");

        // EXPLICIT WAIT
        System.out.println("\n2. EXPLICIT WAIT");
        System.out.println("Waits for a specific condition.");
        System.out.println("Example: WebDriverWait");
        System.out.println("Useful for visibility and clickability.");

        // FLUENT WAIT
        System.out.println("\n3. FLUENT WAIT");
        System.out.println("Allows custom polling intervals.");
        System.out.println("Can ignore specified exceptions.");
        System.out.println("Useful for more customised waiting.");

        System.out.println("\n===== COMPARISON COMPLETED =====");
    }
}

package com.noeteric.jpa.jpademo.jpaconnection2.singleton;

public class SingleTonPattern {


        private static SingleTonPattern orderInstance;

        private SingleTonPattern() {}

        // Constructor Injection
        public SingleTonPattern(SingleTonPattern injectedOrder) {
            orderInstance = injectedOrder;
        }

        public static SingleTonPattern getOrder() {
            return orderInstance;
        }

        public void processOrder() {
            System.out.println("Order is being processed.");
        }

        public static void main(String[] args) {

            SingleTonPattern injectedOrder = new SingleTonPattern(new SingleTonPattern());
            SingleTonPattern order = SingleTonPattern.getOrder();
            order.processOrder();
        }
    }

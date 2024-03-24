package controller;

import dataStructures.stacks.StackInt;

public class ConverteController {
    public ConverteController() {}

    public String decToBin(int n) {
        StackInt remaindersStack = new StackInt();

        if(n == 0) remaindersStack.push(0);
        while(n != 0) {
            remaindersStack.push(n % 2);
            n /= 2;
        }

        StringBuilder sb = new StringBuilder();

        while(!remaindersStack.isEmpty()) {
            try {
                sb.append(remaindersStack.pop());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return sb.toString();
    }
}

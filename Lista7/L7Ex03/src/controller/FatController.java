package controller;

import dataStructures.stacks.StackInt;

public class FatController {
    public int fatorial(int n) {
        StackInt s = generatePilha(n);
        while(s.size() > 1) {
            multiplyTop(s);
        }
        try {
            return s.top();
        } catch (Exception e) {
            return 1;
        }
    }

    private void multiplyTop(StackInt s) {
        int aux;
        try{
            aux = s.pop();
        } catch (Exception e) {
            return;
        }

        try {
            if(!s.isEmpty())
                aux = aux * s.pop();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.push(aux);
        }

    }

    private StackInt generatePilha(int n) {
        StackInt s = new StackInt();
        for(int i = 1; i <= n; i++) {
            s.push(i);
        }
        return s;
    }
}

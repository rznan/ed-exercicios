package controller;

import datastrucures.genericList.List;

public class EvenOddHashtable {

    @SuppressWarnings("rawtypes")
    final List[] BUCKETS;

    public EvenOddHashtable() {
        BUCKETS = new List[2];
        BUCKETS[0] = new List<Integer>();
        BUCKETS[1] = new List<Integer>();
    }

    public static int hash(int value) {
        return value % 2;
    }

    public void put(int value) throws Exception {
        int bucketIndex = hash(value);
        @SuppressWarnings("unchecked")
        List<Integer> bucket = BUCKETS[bucketIndex];
        bucket.addLast(value);
    }

    private void listBucket(int index) throws Exception {
        if (index > BUCKETS.length || index < 0) {
            throw new Exception("Index Inválido");
        }
        @SuppressWarnings("unchecked")
        List<Integer> pares = BUCKETS[index];
        int bucketSize = pares.size();
        System.out.print("VALORES: ");
        for (int i = 0; i < bucketSize; i++) {
            System.out.printf("%03d, ", pares.get(i));
        }
        System.out.println("FIM");
    }

    public void listEven() throws Exception {
        System.out.print("PARES, ");
        listBucket(0);
    }

    public void listOdd() throws Exception {
        System.out.print("IMPARES, ");
        listBucket(1);
    }
}

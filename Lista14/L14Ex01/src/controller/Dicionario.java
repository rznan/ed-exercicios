package controller;

import datastrucures.genericList.List;

public class Dicionario {

    @SuppressWarnings("rawtypes")
    private final List[] DICT;

    public final int SIZE = 50;

    public Dicionario() {
        DICT = new List[SIZE];
        for(int i=0; i<SIZE; i++) {
            DICT[i] = new List<Integer>();
        }
    }

    public int hash(int numero) {
        return numero % SIZE;
    }

    public void put(int n) throws Exception {
        int position = hash(n);
        List<Integer> bucket = DICT[position];
        bucket.addLast(n);
    }

    public void listBucket(int bucketIndex) throws Exception{
        if(bucketIndex < SIZE && bucketIndex >= 0) {
            List<Integer> bucket = DICT[bucketIndex];
            int bucketSize = bucket.size();
            StringBuilder sb = new StringBuilder();

            sb.append(String.format("|%03d|", bucketIndex));
            for(int i=0; i<bucketSize; i++) {
                Integer element = bucket.get(i);
                sb.append(String.format(" -> %04d", element));
            }
            sb.append(" -> NULL");

            System.out.println(sb.toString());
        }
        else {
            throw new Exception("Index Inválido");
        }
    }

    public String bucketToCsv(int bucketIndex) throws Exception{
        if(bucketIndex < SIZE && bucketIndex >= 0) {
            List<Integer> bucket = DICT[bucketIndex];
            int bucketSize = bucket.size();
            StringBuilder sb = new StringBuilder();

            sb.append(bucketIndex);
            for(int i=0; i<bucketSize; i++) {
                Integer element = bucket.get(i);
                sb.append(",");
                sb.append(element);
            }
            sb.append(",");
            sb.append("NULL");
            String csv = sb.toString();
            System.out.println(csv);
            return csv;
        }
        else {
            throw new Exception("Index Inválido");
        }
    }
}

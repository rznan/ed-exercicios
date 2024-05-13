package controller;

import datastrucures.genericList.List;
import model.Resident;

public class ResidentHashTable {
    public final int SIZE = 10;
    @SuppressWarnings("rawtypes")
    private final List[] DICT;

    public ResidentHashTable() {
        DICT = new List[SIZE];
        for(int i=0; i<SIZE; i++) {
            DICT[i] = new List<Resident>();
        }
    }

    public void put(Resident resident) throws Exception {
        int bucketPosition = resident.hashCode();
        List<Resident> bucket = DICT[bucketPosition];
        int bucketSize = bucket.size();

        for(int i=0; i<bucketSize; i++) {
            Resident element = bucket.get(i);
            if(element.getApartmentNumber() == resident.getApartmentNumber()) {
                if(!element.equals(resident)) {
                    bucket.remove(i);
                }
            }
        }
        bucket.addLast(resident);
    }

    public Resident get(int apartmentNumber) throws Exception {
        int bucketPosition = Resident.hash(apartmentNumber);
        List<Resident> bucket = DICT[bucketPosition];
        int bucketSize = bucket.size();

        Resident target = null;

        for(int i=0; i<bucketSize; i++) {
            Resident element = bucket.get(i);
            if(element.getApartmentNumber() == apartmentNumber) {
                target = element;
                break;
            }
        }

        return target;
    }


    public void delete(int apartmentNumber) throws Exception {
        int bucketPosition = Resident.hash(apartmentNumber);
        List<Resident> bucket = DICT[bucketPosition];
        int bucketSize = bucket.size();

        for(int i=0; i<bucketSize; i++) {
            Resident element = bucket.get(i);
            if(element.getApartmentNumber() == apartmentNumber) {
                bucket.remove(i);
                break;
            }
        }
    }

    public void listFloorResidents(int floorNumber) throws Exception {
        if(floorNumber < SIZE && floorNumber > 0) {
            List<Resident> bucket = DICT[floorNumber-1];
            int bucketSize = bucket.size();

            if(bucketSize == 0) {
                System.out.println("Nenhum Morador");
            } else {
                for(int i=0; i<bucketSize; i++) {
                    Resident element = bucket.get(i);
                    System.out.println();
                    System.out.println();
                    System.out.println(element);
                }
            }
        }
        else {
            throw new Exception("Andar Inválido");
        }
    }
}

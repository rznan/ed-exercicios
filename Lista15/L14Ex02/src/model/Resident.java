package model;

public class Resident {
    private int apartmentFloor;
    private int apartmentNumber;

    public String residentName;

    public String carModel;
    public String carColor;
    public String carPlate;

    public int getApartmentNumber() {
        return (this.apartmentFloor * 100) + this.apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber % 100;
        this.apartmentFloor = apartmentNumber / 100;
    }

    public int getApartmentFloor() {
        return this.apartmentFloor;
    }

    public static int hash(int n) {
        return (n / 100)-1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return hash(getApartmentNumber());
    }

    @Override
    public String toString() {
        return String.format("Número do Apartamento: %d\nMorador: %s\nCarro: %s, %s, placa: %s", getApartmentNumber(), residentName, carModel, carColor, carPlate);
    }
}

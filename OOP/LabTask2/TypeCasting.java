package OOP.LabTask2;
public class TypeCasting {
    public static void main(String[] args) {

        int number = 123;
        byte byteValue = (byte) number;
        System.out.println("int to byte: " + byteValue);

        byte byteData = 12;
        int intData = (int) byteData;
        System.out.println("byte to int: " + intData);
    }
}
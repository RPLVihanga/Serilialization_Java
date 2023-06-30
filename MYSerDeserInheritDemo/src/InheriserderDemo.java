public class InheriserderDemo {
    public static void main(String[] args) {
        Serialization ser= new Serialization();
        Deserialization deser = new Deserialization();
//        Cat c = new Cat(10.0, "White");
//        ser.serializeCat(c);
//        deser.deserializeCat();

        Car c = new Car("red",100.0);
        ser.serializeCar(c);
        deser.deserializeCar();
        




    }
}

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car extends vehicle implements Externalizable {


    private double speed;

    private static final long serialVersionUID = 59L;

    private transient int gear;

    public Car(){

    }
    public Car(String color, double speed) {
        super(color);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getColor());
        out.writeDouble(getSpeed());
        out.writeInt(getGear());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setColor((String)in.readObject());
        setSpeed(in.readDouble());
        setGear(in.readInt());

    }

    @Override
    public String toString() {
        return "Car{" +
                ", color=" +getColor() +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}

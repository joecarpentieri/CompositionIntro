package vehicles;

public class Motor implements IMotorised{

    private int fuel;
    private int hp;
    
    public Motor(int fuel, int hp){
        this.fuel = fuel;
        this.hp = hp;
    }


    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void startEngine() {
        System.out.println("engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

}

public interface TrafficLightState {
    TrafficLightState changeState();
    void displayState(int time) throws InterruptedException;
}
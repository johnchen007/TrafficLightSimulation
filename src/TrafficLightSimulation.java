public class TrafficLightSimulation {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            TrafficLightState state = new RedLight();
            state.displayState(8);
            
            state = state.changeState();
            state.displayState(8);
            
            state = state.changeState();
            state.displayState(3);
        }
    }
}
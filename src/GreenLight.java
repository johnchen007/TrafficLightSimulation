class GreenLight implements TrafficLightState {
    @Override
    public TrafficLightState changeState() {
        return new YellowLight();
    }

    @Override
    public void displayState(int time) throws InterruptedException {
        for (int i = time; i > 0; i--) {
            System.out.println("Green Light: " + i + " seconds remaining");
            Thread.sleep(1000);
        }
    }
}
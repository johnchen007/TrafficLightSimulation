class RedLight implements TrafficLightState {
    @Override
    public TrafficLightState changeState() {
        return new GreenLight();
    }

    @Override
    public void displayState(int time) throws InterruptedException {
        for (int i = time; i > 0; i--) {
            System.out.println("Red Light: " + i + " seconds remaining");
            Thread.sleep(1000);
        }
    }
}
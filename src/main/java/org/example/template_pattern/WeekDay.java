package org.example.template_pattern;

public abstract class WeekDay {

    public final void everyDayIsExactlyTheSame(TransportType typeOfTransport) {
        wakeUp();
        getReady();
        int time = goToWork(typeOfTransport);
        summary(time);
        work();
        goHome();
    }

    private void goHome() {
        System.out.println("back to home");
    }

    protected abstract void work();
    protected abstract int goToWork(TransportType transport);

    protected void summary(int time) {
        System.out.println("track took: " + time + " minutes");
    }

    private void getReady() {
        System.out.println("getting ready to go outside");
    }

    private void wakeUp() {
        System.out.println("waking up");
    }
}

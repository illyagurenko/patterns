package behaviolar.template_method;

public abstract class Training {
    public final void runTraining() {
        running();
        practiceSkills();
        gym();
    }

    // Общий шаг для всех
    private void running() {
        System.out.println("running");
    }

    protected abstract void practiceSkills();

    // Общий шаг для всех
    private void gym() {
        System.out.println("gym");
    }
}

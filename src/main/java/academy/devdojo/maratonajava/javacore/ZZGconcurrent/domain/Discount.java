package academy.devdojo.maratonajava.javacore.ZZGconcurrent.domain;


public class Discount {
    public enum Code {
        NONE(0), SUPER_HEROES(5), SUPER_SAYAJIN(10), SUPER_MONSTER(10);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}

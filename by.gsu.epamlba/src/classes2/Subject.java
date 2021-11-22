package classes2;

public class Subject {
        private String name;
        private String material;
        private int volume;

        public Subject(String name, int density) {
            this.name = name;
            this.material = material;
            this.volume = volume;
        }
        public Subject(){
        }

        public String getName() {
            return name;
        }
        public String getDensity() {
            return material;
        }
}

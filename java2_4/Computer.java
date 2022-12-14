package java2_4;

    public class Computer {
        public int id;
        private String CPU;
        private String GPU;
        private String MEM;

        public Computer(int id, String CPU, String GPU, String MEM) {
            this.id = id;
            this.CPU = CPU;
            this.GPU = GPU;
            this.MEM = MEM;
        }

        public String toString() {
            return "Computer{" +
                    "id=" + id +
                    ", CPU='" + CPU + '\'' +
                    ", GPU='" + GPU + '\'' +
                    ", MEM='" + MEM + '\'' +
                    '}';
        }
    }
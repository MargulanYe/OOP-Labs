class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("[*]");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

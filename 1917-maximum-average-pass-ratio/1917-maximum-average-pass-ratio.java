class Solution {
    static class Row implements Comparable<Row>{
        int p;
        int t;
        // double ratio;
        public Row(int p,int t){
            this.p=p;
            this.t=t;
            // ratio=p/t;
        }
        double gain() {
            return (double)(p + 1) / (t + 1) - (double)p / t;
        }
        @Override
        public int compareTo(Row other){
            return Double.compare(other.gain(), this.gain());
        }
        void addStudent() {
        this.p += 1;
        this.t += 1;
    }
    }
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int[] c : classes) pq.offer(new Row(c[0], c[1]));

        while (extraStudents-- > 0) {
            Row best = pq.poll();
            best.addStudent();
            pq.offer(best);
        }

        double sum = 0;
        for (Row r : pq) sum += (double) r.p / r.t;
        return sum / classes.length;
    }
}
class Student extends Person{
	private int[] testScores;
    /*String firstName;
    String lastName;
    int id;*/
    
    public Student(String _firstName, String _lastName, int _id, int[] _testScores) {
        super(_firstName, _lastName, _id);
        this.testScores = _testScores;
    }
    
    public String calculate() {
        int averageScores = 0;
        for (int i = 0; i < testScores.length; i++) {
            averageScores += testScores[i];
        }
        averageScores = averageScores / testScores.length;
        //return a char signed the average scores of tests
        if (averageScores < 40) return "T";
        else if (averageScores >= 40 && averageScores < 55) return "D";
        else if (averageScores >= 55 && averageScores < 70) return "P";
        else if (averageScores >= 70 && averageScores < 80) return "A";
        else if (averageScores >= 80 && averageScores < 90) return "E";
        return "O";
    }
}

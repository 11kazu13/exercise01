package exercise01;

public class Student {
	// クラス変数
    public static String schoolName = "東京IT高校";
    public static int studentCount = 0;

    // インスタンス変数（カプセル化）
	private String name;
    private int score;

    // 引数なしコンストラクタ
    public Student() {
        this.name = "未設定";
        this.score = 0;
        studentCount++;
    }

    // 引数ありコンストラクタ
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        studentCount++;
    }

    // オーバーロード：点数更新（上書き）
    public void updateScore(int score) {
        this.score = score;
    }

    // オーバーロード：点数更新（ボーナス加算）
    public void updateScore(int score, int bonus) {
        this.score = score + bonus;
    }

    // getter/setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
    	this.score = score;
    }

    // 情報表示メソッド
    public void showInfo() {
    	System.out.printf("名前：%s, 点数：%d\n", this.name, this.score);
    }
}

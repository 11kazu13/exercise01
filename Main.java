package exercise01;

public class Main {

	public static void main(String[] args) {
				
		//=== 生徒管理アプリ ===を表示
		System.out.println("=== 生徒管理アプリ ===");
		System.out.println();
		
		// 生徒インスタンス作成
		Student student1 = new Student("田中", 79);
		Student student2 = new Student("井納", 2);

		//学校名を表示
		System.out.printf("学校名：%s\n", Student.schoolName);
		System.out.printf("現在の生徒数：%d\n", Student.studentCount);
		System.out.println();
		
		//生徒情報を表示
		System.out.println("=== 生徒情報一覧 ===");
		student1.showInfo();
		student2.showInfo();
		System.out.println();
		
        // 点数更新
		System.out.println("=== 点数更新例 ===");
		student1.updateScore(99);
		System.out.println("田中の点数を99に更新しました。");
		student2.updateScore(50);
		System.out.println("井納の点数を50に更新しました。");
		System.out.println();
		
        // 更新後の表示
		System.out.println("=== 更新後の生徒情報一覧 ===");
		student1.showInfo();
		student2.showInfo();
    }
}

package about_lambda_expression1;

public class Main {

    // Eclipse上で「実行の構成」引数タブ「コマンド引数」に任意の値で出力される内容が変わる。
    public static void main(String[] args) {
        // ラムダ式に書き換える
        Runnable morningRunnable = () -> System.out.println("おはよう！");
        Runnable AfternoonRunnable = () -> System.out.println("こんにちは！");
        Runnable EveningRunnable = () -> System.out.println("こんばんわ！");
        Runnable OtherRunnable = () -> System.out.println("もう早く寝たほうがいいですよ");

        int myTime = Integer.parseInt(args[0]);
        if (5 <= myTime && myTime <= 10) {
            morningRunnable.run();
        } else if (11 < myTime && myTime <= 16) {
            AfternoonRunnable.run();
        } else if (17 < myTime && myTime <= 22) {
            EveningRunnable.run();
        } else if (17 < myTime && myTime <= 22) {
            OtherRunnable.run();
        }
    }
}
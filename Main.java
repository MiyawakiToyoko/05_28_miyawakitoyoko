package com.company;

import java.util.Scanner;

public class Camp05 {
    public Camp05() {
    }

    public static void main(String[] args) {
        //質問を配列に格納
        String[] question = new String[]{"休日は割と家に引きこもっている", "小説より漫画が好きだ", "宿題は後回しにするタイプだ", "レストランではいつも同じメニューを注文する", "ドラマやバラエティー番組を見ることが好きだ", "推しのアイドルや芸能人について熱く語ることができる", "旅行は遊びはノープランなことが多い", "早起きは苦手だ"};
        int[] ans = new int[8];//答
        int result = 0;

        String retry;
        do {
            System.out.println("◆あなたと私の相性check◆");

            try {
                for(int i = 0; i < question.length; ++i) {
                    System.out.println("Q" + (i + 1) + "." + question[i]);
                    System.out.println("1.あてはまらない　2.あまりあてはまらない　3.まあまああてはまる　4.あてはまる");

                    while(true) {
                        Scanner scanner = new Scanner(System.in);
                        int num = scanner.nextInt();
                        if (num >= 1 && num <= 4) {
                            ans[i] = num;
                            result += ans[i];
                            break;
                        }

                        System.out.println("※１から４の数値で入力してください");
                    }
                }
            } catch (Exception var8) {
                System.out.println("※文字列は入力できません。もう一度やり直してください。");
                System.exit(0);
            }

            System.out.println("◆診断結果◆");
            if (result <= 15) {
                System.out.println("あなたと私は真逆の人間のようです。何事もじっくり話し合って決めましょう。");
            } else if (result >= 16 && result <= 23) {
                System.out.println("あなたと私の相性は普通です。…普通がいちばん。平和にいきましょ。");
            } else if (result >= 24 && result <= 28) {
                System.out.println("あなたと私の相性はいい感じ！ぜひ語り合いましょう。");
            } else {
                System.out.println("あなたと私の相性はバッチリです！何をするにも息ぴったりですね！");
            }

            System.out.println();
            System.out.println("もう一度診断しますか？ Yesならば「1」を、Noならそれ以外の数字を入力してください。");
            Scanner scanner = new Scanner(System.in);
            retry = scanner.next();
            System.out.println();
        } while(retry.equals("1"));

    }
}

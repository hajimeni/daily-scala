# Word Count Day 02

## Today

1. @j5ik2o さんのワードカウントの問題
 1. https://gist.github.com/j5ik2o/7210762
2. 順番に一緒に実装
 1. REPL使って解説
3. コード解説
 1. コードを見てほしい場合は、forkしたリポジトリにpushしてください
 1. できれば発表してください（マサカリしませんが、マサカリを希望する場合は・・・）
4. Scalaの文法おさらい
 1. できるだけ簡潔で一貫性を保ってる！
 1. いろいろあるんですわ 
 1. _ これなんだ？

## Scalaの文法について

- すべてオブジェクト
 - Noプリミティブ！
 - 関数もオブジェクト
 - for/if/try は 文 ではなく 式！値を返す！
 - Rubyのアイドルが好きな関数はif（!?）
   - http://fb.dev-plus.jp/column5/profile/
 - Scala界にもアイドルが必要？<br> 
 【Scala超入門～副作用の無いモナドな女への道】～０monad<br> 
   - サイバーさんパネェっ！！！キラキラ女子！！！
 - importとwhileやclass定義等は例外（文とか）
 - Scalaは簡潔に記述できるように様々な省略記法が存在
 - 型推論、プレースホルダー、糖衣構文（シンタックスシュガー）

## すべてオブジェクト

```
val x = 1 + 2
// ==> val x: Int = 1.+(2)
// 1は Int の オブジェクト
// 1のメソッド 「+ 」を呼び出す
// 引数は2を渡す
// 型が自明な場合は省略できる
```

```
// 関数も変数にぶち込める
val f: (Int) => String = (arg: Int) => arg.toString
f.apply(10)  // -> String(“10”) 関数には applyメソッドがある
f(10)          //  -> String(“10”)  applyも省略できちゃうううう
// ↑は ↓と等価！！！つまりFunctionクラス のインスタンス！！！
val f: Function1[Int, String] = new Function1[Int, String] {
  def apply(arg: Int): String = arg.toString
}
```

## 覚えること！多すぎぃぃい

- https://gist.github.com/gakuzzzz/10104162<br>
これを読めばOK♪

## Next
- ScalaのコレクションAPIを学ぶ
 - 型階層
 - 高階関数を試す

- Scalaコレクションを使うときのコツ
 - 何をどうするのか？

----
[Daily Scala Summaryへ](../dayly_scala_summary.md)

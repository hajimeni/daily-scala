# Scala Collection API Day 02

## Today
- Scala Collection APIを使って遊ぶ
 - REPL再来！
- コーディング
 - FizzBuzz終わってない人はコーディング
 - 終わった人向けにScala Collection API on REPL
- 発表会
 - FizzBuzz発表会
- Nextコーディング
 - FizzBuzzルール変更
 - 2の倍数は除外する
- Next Nextコーディング
 - NNP を Collection APIを使って解いてみよう！

## Scala Collection API 概要

- 要素取得演算
 - head, last, headOption, lastOption, find
- 加算
 - ++ 2つのコレクションの連結
- 走査
 - foreach
- サブコレクション取得演算
 - filter,tail, init, slice,take,drop,takeWhile,dropWhile,withFilter
- map演算
 - map, flatMap, collect
- 変換演算
 - toArray,toXXX
- 要素条件演算
 - exists, forall, count
- サイズ演算
 - size, isEmpty, nonEmpty
- 分割演算
 - partition,groupBy
- fold演算
 - foldLeft,foldRight, reduceLeft, reduceRight
- 文字列演算
 - mkString

## FizzBuzzルール
1 から 100まで<br>
3の倍数: Fizz<br>
5の倍数: Buzz<br>
3の倍数かつ５の倍数: FizzBuzz<br>
それ以外 はその数字（1,2など）を出力する

```
出力例
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
```

## Hint1
- 1から100までのコレクションを作る
 - val list = 1 to 100
 - (1 to 100).foreach(println)
   - 弱いので ()囲まないとコレクションのメソッド呼べない
 - 剰余算
   - n % 2 == 0 // => res: Boolean
   - 4 % 2 == 0 // => true
   - 5 % 2 == 0 // => false
 - if/else if/else
   - if (condition) X else if(condition) Y else Z

## Hint2 Pattern Match構文
```
// 値のマッチング
val n = 2
n match {
  case 0 => 1
  case 1 => 2
  case _ => 0
}
```
```
// 値のマッチング ifによるガード文付き
val n = 2
n match {
  case x if x % 2 == 0=> “偶数”
  case x => “奇数”
}

val s = “Hello”
s match {
  case x if x.startsWith(“W”) => “Hello, “ + x
  case x if x.startsWith(“H”)  => x + “, World!”
  case x => x
}
```
```
// 構造へのマッチング
val list = List(1, 2, 3, 4, 5)
list match {
  case x :: Nil => “要素１つだけだよ”
  case x :: xs => “要素２つ以上あるよ”
  case _         => “空だよ”
}

// case class
case class Person(name: String, age: Int, nickname: String)
val persons = List(Person(“tanacasino”, 28, “カジノ”), …..)
persons filter { person =>
  person match {
    case Person(name, age, nickname) if age == 28 => true
    case _ => false
  }
}
```

## FizzBuzzルール変更
- その２
 - １行で書く
- その３
 - 2の倍数は除外する
- その４
 - １行ずつ表示をやめる
 - カンマ区切りで１行で出す
- その５
 - その1 バージョンのFizzBuzzの出力前のリストから、<br>
Fizz/Buzz/FizzBuzz になっていない数値の足し算をして合計値を出す
- その６
 - 1 to 100のリストを作らない、かつ<br>
while/forループ禁止、var禁止でどうぞ


## Next
- FizzBuzzルール変更コーディング
- FizzBuzzルール変更発表会
 - and 説明会

----
[Scala Collection API Day 03へ](collection_day_03.md)

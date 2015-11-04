# Scala Collection API Day 07

## Today
- 再帰・末尾再帰大会 Part 3
  - 8,9,10を再帰 + Listコレクションの組み合わせで
    - 解き方は自由！
  - 終わった人はラスボス 7番
- 10時10分までコーディングタイム
- 8,9,10番解説（10分）



## 主要な Pattern Match 
```
// 値に対するパターンマッチ
val age = 29
age match {
  case 0 => "赤ちゃん"
  case 4 => "児童ぐらい"
  case 10 | 20 | 30  => "10か20"
  case n if n % 12 == 0 => "ガードパターン"
  case n => "age の値を n に束縛(bind)する。n を使わない場合は _ で代用可能"
}

// case class pattern
case class Person(name: String, age: Int, male: Boolean)

val persons = List(Person("tanacasino", 29, true), .....)
val manNames = persons.collect {
  case Person(name, _, true) => name
}

// Listに対するパターンマッチ（構造に対してパターンマッチ）
persons match {
  case Nil             => "空のリスト"
  case x :: Nil        => "１つだけ要素を持つリスト"
  case x1 :: x2 :: Nil => "2つ要素を持つリスト"
  case x :: xs         => "その他なので３つ以上要素を持つリストに適合かつ、xにhead/xsにtail が入った状態"
}
```
## Next
- 再帰・末尾再帰大会 Part 4
  - ラスボス7番
- NNPを振り返り
  - Scala Collection API
  - Recursive Function
  - Tail Recursive

----
[Scala Collection API Day 08へ](collection_day_08.md)

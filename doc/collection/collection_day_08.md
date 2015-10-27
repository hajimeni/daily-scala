# Scala Collection API Day 08

## Today
- 再帰・末尾再帰大会 Part 3
  - ラスボス 7番
- 10時10分までコーディングタイム
- 7番解説（10分）
- これまでのおさらい(5分)

## これまでのまとめ
- mutable/immutable
- immutable使う
- 便利な高階関数いっぱいある
 - 関数を受け取る or 返すような関数
 - 使ったほうがわかりやすいことが多い
- なるべく効率がよいものを使う
 - ::, withFilter
- 再帰関数・パターンマッチと組み合わせやすい
- 再帰書くなら末尾再帰
 - @scala.annotation.tailrec

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

----
[Scala Collection API Day 09へ](collection_day_09.md)

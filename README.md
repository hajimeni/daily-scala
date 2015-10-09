# Daily Scala

## 目的

Scalaっぽいコードが書けるようになろう。
毎日ちょっとずつScalaっぽいコードを勉強しよう。

## 何をするか

毎日集まってScalaのコードを

1. 書く！
2. 発表する！
3. 読む！

### 注意事項

マサカリ投げない
みんなで学ぶ

## 進め方

毎日30分。本業優先（一応）
1回で終わらないネタは1週間かけてまったりやる。
できるだけ毎日コードを書く時間を取る
とにかく続けることが大事

## Daily Scala 7つの大罪

- var禁止 -> valを使う
- mutable禁止 -> immutableのものを使う
- while/forループ禁止 -> mapやforeachなどの高階関数を利用する。もしくは再帰で実装する
- null禁止 -> 値が無いケースがある場合はOptionを使う
- Option.get禁止 ->  Option.mapもしくはOption.getOfElseを使う
- return禁止 -> ブロックの最後の式の結果が、ブロックの結果として返却される
- if禁止(※値を返す三項演算的なものはOK。collection/optionのAPIで代用できる場合の無駄なチェックは禁止)

※現実問題を解く場合には妥協点があるので実際のプロジェクトでは例外があります。

----
[Daily Scala Summaryへ](doc/dayly_scala_summary.md)

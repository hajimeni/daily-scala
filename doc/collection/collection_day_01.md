# Scala Collection API Day 01

## Today
- Scala Collection APIを知る
 - 型階層を知る
 - 関数を知る
 - 情報源を知る
- Scala Collection APIを使って遊ぶ
 - REPL再来！
- コーディング
 - FizzBuzzを１行で解く！
 - NNP を Collection APIを使って解いてみよう！

## Scala Collection APIを知る
- 大事な情報源
 - 公式のCollection解説
   - http://docs.scala-lang.org/ja/overviews/collections/introduction.html
 - ひしだまさんメモ（コレクションのメソッド一覧見やすい）
   - http://www.ne.jp/asahi/hishidama/home/tech/scala/collection/method.html
 - Scala逆引きレシピ
   - P.178～P.233

## Scala Collection 概要
- 大きく2種類
 - immutableコレクション
 - mutableコレクション
- Traversableがボス

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

## Next
- FizzBuzzコーディング
- FizzBuzz発表会
 - and 説明会
- Scala Collectionを使って問題を解く！
 - NNP P01～P10

----
[Scala Collection API Day 02へ](collection_day_02.md)

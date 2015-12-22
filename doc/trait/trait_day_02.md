# Scala Trait Day 02

## Today
- 分数を表すクラスを作る
- 分数クラスを比較できるようにする
- 比較するをtraitにする

## 分数を表すクラスを作る
- 分子と分母を基本コンストラクタで受け取る
- 分子と分母はIntで
- class名は Rationalで
- とりあえず足し算できるようにしましょうか（頑張らない実装でｗ）
- Rational(1, 3)  // ３分の１
- Rational(1, 3) + Rational(1, 3)
  - == Rational(2, 3)
- denominator
- numerator

## 分数クラスを比較できるようにする
- <
- >
- <=
- >=
- Booleanを返す
- Rational(1, 3) < Rational(1, 2)
  - true

## 比較するをtraitにする
- まずはJava風にインタフェースだけ抜き出す
- その後はtraitでいい感じにする

## Next
- 次のネタ
  - traitの続き
  - traitのシンタックス的な概要
  - リッチインタフェース写経
  - Stackable Traitの写経

----
[Scala Trait Day 03へ](trait_day_03.md)

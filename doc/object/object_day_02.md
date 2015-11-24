# Scala Object Day 02

## Today
- case class

## case class
- JavaのBean的なやつを簡単に書ける
  - equals/hashCode/toString を実装してくれる
- 基本コンストラクタに書いた引数にvalが付く
- インスタンスの型が一致する場合はtrueを返すcanEqualメソッドを実装
- フィールドをコピーして新規インスタンスを生成するcopyメソッド
- コンパニオンオブジェクトが自動生成
  - apply,unapply が可能

## case class 用途
- パターンマッチで利用するためのクラス
- 値を保持するDTO
- Actor へ送信するメッセージの定義
- abstract class/trait を継承したcase classで再帰的なデータ構造を扱うのにも便利
  - コップ本いわく

## sealed で縛る
- 親クラス を sealedで縛ることでパターンマッチの漏れをチェックすることができる

## コップ本の例をちょっとだけ実装する
- https://github.com/hajimeni/daily-scala/blob/master/learning-scala/src/main/scala/com/github/study/sample/Expr.scala
- 算術式を操作するライブラリを作る
- Expr/Var/Number/UnOp/BinOp
- コップ本買ってます？ or 読みました？

## case class 例題
- 木構造の再帰データを扱うのに非常に役立つ by コップ本
- というわけで簡単な BTree を作ろう！
- https://gist.github.com/j5ik2o/7332812
- まずは 0 番を解こう！
- 次に1
- max
- min
- sum
- avg
- find
- 余裕がある人は ListからBTreeを作れるようにする

## まとめ
- コンパニオンオブジェクトはclassと同名のobjectのこと
- 同じソースファイルに書かないといけない
  - sealed + case class Patternも同じ
  - Scalaではよくあること
- unapply使って抽出子を実装するとPattern Match等のScala流なコードと相性がよい
- ただの bean っぽいクラスにこれ作るのは面倒
- 次回: そこで case class ですよ


## Next
- case classを使って簡易BTreeを作ろう
  - コーディングタイム
  - 説明会


----
[Scala Object Day 03へ](object_day_03.md)

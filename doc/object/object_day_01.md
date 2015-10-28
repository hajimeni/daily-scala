# Scala Object Day 01

## Today
- classとobjectの基本
  - class
  - object
  - コンパニオンオブジェクト
  - 抽出子(Extractor)

## class/object コンパニオンオブジェクト
- 簡単な説明とともにソースコードを見ながら解説
- https://github.com/tanacasino/learning-scala/commit/fb320f7728426a8d251e3f12027bd86211a8d58b

## class
- class は Javaのclassと基本同じ
- インスタンス化して使う
- コンストラクタがちょいきもい
- デフォルトコンストラクタ以外はthis
- static フィールド作れない

## object
- シングルトンオブジェクトになる
- static なメンバー（フィールド・メソッド）
- 定数
- XXXUtils.java 的な使い方
- 名前空間を作るのにも使う
  - パッケージ化モジュール化の役割
  - オブジェクトのimportできる

## コンパニオンオブジェクト
- classと同名のobjectを同じソースファイルに宣言
- 主にファクトリとして使う
- applyメソッドを使うことがおおい
- 省略記法ルールにより applyは呼び出しの省略ができるため
- 関数クラスのapply省略を思い出す https://gist.github.com/gakuzzzz/10104162
- private コンストラクタを使ってファクトリの使用を強制できる
- お互いのプライベートメンバーにアクセスできる

## 抽出子 Extractor
- classを分解してフィールドを抽出する
- タプルに分解する
- 変数に分解して突っ込める
- pattern matchで使える
- 便利
- コンパニオンオブジェクトのunapplyで実装する

## まとめ
- コンパニオンオブジェクトはclassと同名のobjectのこと
- 同じソースファイルに書かないといけない
  - sealed + case class Patternも同じ
  - Scalaではよくあること
- unapply使って抽出子を実装するとPattern Match等のScala流なコードと相性がよい
- ただの bean っぽいクラスにこれ作るのは面倒
- 次回: そこで case class ですよ


## Next
- case class 再入門

----
[Scala Object Day 02へ](object_day_02.md)





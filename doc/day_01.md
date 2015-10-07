# Day 01

## 目指すところ

とりあえず

1. case class
2. collection
3. pattern match

をまずは覚えるとScalaらしいコーディングが出来るようになってくる（らしい）

### お題のネタ

1. @j5ik2o さんのワードカウントの問題
 1. https://gist.github.com/j5ik2o/7210762
 1. ScalaのコレクションAPIをざっと見る。
 1. Scalaのコレクション操作を使うコツ
 1. FizzBuzz
1. 再帰・末尾再帰
 1. なぜ必要か？関数型言語と命令形言語
 1. 総和計算
 1. 階乗計算
 1. 最大値・最小値
 1. フィボナッチ数列

### 将来のネタ候補

1. jodataimeのScalaラッパーを作って学ぶ(車輪の再発明)
 1. implicit conversion
1. aws-sdk-java のラッパーを作って学ぶ
 1. implicit parameter
1. BTree + implicit によるアドホック多相・型クラスな感じのBTreeを作る。
1. Play の Json Reads/Writes のリーディング

## Day1 やること

- 開発環境を作る
 - jdk を入れる
 - IntelliJ を入れる
- Scala勉強用のプロジェクトを作る。
 - このリポジトリをfork, clone。
 - `cd daily-scala/learning-scala`
- IntelliJ(などで開く)
 - sbt実行する場合
```bash
# Mac/Linux
$ cd learning-scala
$ bin/sbt

# Win
$ cd learning-scala
$ bin\sbt.bat
``` 

 
### brew を使う場合

- brewのInstall
 - `ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"` 
- brew caskのInstall
 - `brew install caskroom/cask/brew-cask`

```
brew cask install java
brew cask install intellij-idea-ce
```

Ultimate版の場合
`brew cask install intellij-idea`

### おまけ

Scalaの文法
- 公式チートシート http://docs.scala-lang.org/cheatsheets/
- 日本語 http://xerial.org/scala-cookbook/recipes/2012/06/28/grammar/
- Scala省略ルール早覚え https://gist.github.com/gakuzzzz/10104162
- リファレンス代わりに http://www.ne.jp/asahi/hishidama/home/tech/scala/

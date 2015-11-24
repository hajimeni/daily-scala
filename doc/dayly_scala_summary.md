# Daily Scala Summary

## 目指すところ

とりあえず

1. case class
2. collection
3. pattern match

をまずは覚えるとScalaらしいコーディングが出来るようになってくる（らしい）

## やること

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

### お題

勉強した順に並べます、内容によっては前後に関連したお題が入ったものもあります

- Day1 [Word Count Day 01](wordcount/wordcount_day_01.md)
- Day2 [Word Count Day 02](wordcount/wordcount_day_02.md)
- Day3 [Scala Collection API Day 01](collection/collection_day_01.md)
- Day4 [Scala Collection API Day 02](collection/collection_day_02.md)
- Day5 [Scala Collection API Day 03](collection/collection_day_03.md)
- Day6 [Scala Collection API Day 04](collection/collection_day_04.md)
- Day7 [Scala Collection API Day 05](collection/collection_day_05.md)
- Day8 [Scala Collection API Day 06](collection/collection_day_06.md)
- Day9 [Scala Collection API Day 07](collection/collection_day_07.md)
- Day10 [Scala Collection API Day 08](collection/collection_day_08.md)
- Day11 [Scala Collection API Day 09](collection/collection_day_09.md)
- Day12 [Scala Object Day 01](object/object_day_01.md)
- Day13 [Scala Object Day 02](object/object_day_02.md)
- Day14 [Scala Object Day 03](object/object_day_03.md)
- Day15 [Scala Object Day 04](object/object_day_04.md)
- Day16 [Scala Object Day 04](object/object_day_05.md)
- Day17 [Scala Trait Day 01](trait/trait_day_01.md)

### おまけ
Scalaの文法
- 公式チートシート http://docs.scala-lang.org/cheatsheets/
- 日本語 http://xerial.org/scala-cookbook/recipes/2012/06/28/grammar/
- Scala省略ルール早覚え https://gist.github.com/gakuzzzz/10104162
- リファレンス代わりに http://www.ne.jp/asahi/hishidama/home/tech/scala/

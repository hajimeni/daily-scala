package com.github.study.wordcount

/**
 * Created by tamaki on 2015/02/08.
 */
class WordCount {

  //------------------------------------------------------
  // ワードカウント問題
  // https://gist.github.com/j5ik2o/7210762
  //------------------------------------------------------
  def countFruitsFromLines(lines: List[String]): Map[String, Int] = {
    // リストを要素ごとに単語単位に分割する
    // 分割した単語ごとにカウントする

    lines.mkString(" ").split(" ").groupBy(n => n).map(x => (x._1,x._2.length))
//    lines.mkString(" ").split(" ").groupBy(identity).map{
//      case(key,list) => (key, list.length)

//    }
  }


//  /**
//   * 勉強会をやる発端となったダメコード
//   * @param lines
//   * @return
//   */
//  def countFruitsFromLines(lines: List[String]): Map[String, Int] = {
//    lines.foldLeft(new scala.collection.mutable.HashMap[String, Int]) { (b, line) =>
//      line.split(" ").map( m => {
//        val cnt:Int = b.get(m).getOrElse(0) + 1
//        b.put(m, cnt)
//      })
//      b
//    }.toMap
//  }

}

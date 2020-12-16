package com.iflytek.scala

import org.apache.flink.api.common.functions.Partitioner

class MyPartitioner extends Partitioner[Long]{

  override def partition(key: Long, numPartitions: Int) = {
    println("分区总数："+numPartitions)
    if(key % 2 ==0){
      0
    }else{
      1
    }
  }
}
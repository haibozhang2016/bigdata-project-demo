package com.bigdata.mapreduce;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Partitioner;

public class FirstPartitoner extends Partitioner<PairWritable, IntWritable> {

	@Override
	public int getPartition(PairWritable key, IntWritable value, int numPartitions) {
		return (key.getFirst().hashCode() & Integer.MAX_VALUE) % numPartitions;
	}

}

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netease.arctic.server.dashboard.model;

import com.netease.arctic.server.optimizing.OptimizingType;
import com.netease.arctic.table.TableIdentifier;
import org.apache.iceberg.relocated.com.google.common.base.MoreObjects;

public class OptimizingHistory {
  private TableIdentifier tableIdentifier;
  // private OptimizeRangeType optimizeRange;
  private OptimizingType optimizeType;
  private long recordId;
  private long visibleTime;
  private long commitTime;
  private long planTime;
  private long duration;

  private FilesStatistics totalFilesStatBeforeOptimize;
  private FilesStatistics insertFilesStatBeforeOptimize;
  private FilesStatistics deleteFilesStatBeforeOptimize;
  private FilesStatistics baseFilesStatBeforeOptimize;
  private FilesStatistics posDeleteFilesStatBeforeOptimize;
  private FilesStatistics totalFilesStatAfterOptimize;
  private SnapshotInfo snapshotInfo;

  private int partitionCnt;
  private String partitions;
  private String baseTableMaxTransactionId = "";

  public OptimizingHistory() {
  }

  public TableIdentifier getTableIdentifier() {
    return tableIdentifier;
  }

  public void setTableIdentifier(TableIdentifier tableIdentifier) {
    this.tableIdentifier = tableIdentifier;
  }

  public long getRecordId() {
    return recordId;
  }

  public void setRecordId(long recordId) {
    this.recordId = recordId;
  }

  public long getVisibleTime() {
    return visibleTime;
  }

  public void setVisibleTime(long visibleTime) {
    this.visibleTime = visibleTime;
  }

  public long getCommitTime() {
    return commitTime;
  }

  public void setCommitTime(long commitTime) {
    this.commitTime = commitTime;
  }

  public long getPlanTime() {
    return planTime;
  }

  public void setPlanTime(long planTime) {
    this.planTime = planTime;
  }

  public long getDuration() {
    return duration;
  }

  public void setDuration(long duration) {
    this.duration = duration;
  }

  public FilesStatistics getTotalFilesStatBeforeOptimize() {
    return totalFilesStatBeforeOptimize;
  }

  public void setTotalFilesStatBeforeOptimize(
      FilesStatistics totalFilesStatBeforeOptimize) {
    this.totalFilesStatBeforeOptimize = totalFilesStatBeforeOptimize;
  }

  public FilesStatistics getInsertFilesStatBeforeOptimize() {
    return insertFilesStatBeforeOptimize;
  }

  public void setInsertFilesStatBeforeOptimize(
      FilesStatistics insertFilesStatBeforeOptimize) {
    this.insertFilesStatBeforeOptimize = insertFilesStatBeforeOptimize;
  }

  public FilesStatistics getDeleteFilesStatBeforeOptimize() {
    return deleteFilesStatBeforeOptimize;
  }

  public void setDeleteFilesStatBeforeOptimize(
      FilesStatistics deleteFilesStatBeforeOptimize) {
    this.deleteFilesStatBeforeOptimize = deleteFilesStatBeforeOptimize;
  }

  public FilesStatistics getBaseFilesStatBeforeOptimize() {
    return baseFilesStatBeforeOptimize;
  }

  public void setBaseFilesStatBeforeOptimize(
      FilesStatistics baseFilesStatBeforeOptimize) {
    this.baseFilesStatBeforeOptimize = baseFilesStatBeforeOptimize;
  }

  public FilesStatistics getTotalFilesStatAfterOptimize() {
    return totalFilesStatAfterOptimize;
  }

  public void setTotalFilesStatAfterOptimize(
      FilesStatistics totalFilesStatAfterOptimize) {
    this.totalFilesStatAfterOptimize = totalFilesStatAfterOptimize;
  }

  public SnapshotInfo getSnapshotInfo() {
    return snapshotInfo;
  }

  public void setSnapshotInfo(SnapshotInfo snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
  }

  public int getPartitionCnt() {
    return partitionCnt;
  }

  public void setPartitionCnt(int partitionCnt) {
    this.partitionCnt = partitionCnt;
  }

  public String getPartitions() {
    return partitions;
  }

  public void setPartitions(String partitions) {
    this.partitions = partitions;
  }

  public String getBaseTableMaxTransactionId() {
    return baseTableMaxTransactionId;
  }

  public void setBaseTableMaxTransactionId(String baseTableMaxTransactionId) {
    this.baseTableMaxTransactionId = baseTableMaxTransactionId;
  }

  // public OptimizeRangeType getOptimizeRange() {
  //   return optimizeRange;
  // }
  //
  // public void setOptimizeRange(OptimizeRangeType optimizeRange) {
  //   this.optimizeRange = optimizeRange;
  // }

  public OptimizingType getOptimizeType() {
    return optimizeType;
  }

  public void setOptimizeType(OptimizingType optimizeType) {
    this.optimizeType = optimizeType;
  }

  public FilesStatistics getPosDeleteFilesStatBeforeOptimize() {
    return posDeleteFilesStatBeforeOptimize;
  }

  public void setPosDeleteFilesStatBeforeOptimize(
      FilesStatistics posDeleteFilesStatBeforeOptimize) {
    this.posDeleteFilesStatBeforeOptimize = posDeleteFilesStatBeforeOptimize;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("tableIdentifier", tableIdentifier)
        .add("optimizeType", optimizeType)
        .add("recordId", recordId)
        .add("visibleTime", visibleTime)
        .add("commitTime", commitTime)
        .add("planTime", planTime)
        .add("duration", duration)
        .add("totalFilesStatBeforeOptimize", totalFilesStatBeforeOptimize)
        .add("insertFilesStatBeforeOptimize", insertFilesStatBeforeOptimize)
        .add("deleteFilesStatBeforeOptimize", deleteFilesStatBeforeOptimize)
        .add("baseFilesStatBeforeOptimize", baseFilesStatBeforeOptimize)
        .add("posDeleteFilesStatBeforeOptimize", posDeleteFilesStatBeforeOptimize)
        .add("totalFilesStatAfterOptimize", totalFilesStatAfterOptimize)
        .add("snapshotInfo", snapshotInfo)
        .add("partitionCnt", partitionCnt)
        .add("partitions", partitions)
        .add("baseTableMaxTransactionId", baseTableMaxTransactionId)
        .toString();
  }
}

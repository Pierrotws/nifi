/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.web.api.dto.status;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.wordnik.swagger.annotations.ApiModelProperty;

@XmlType(name = "portStatus")
public class PortStatusDTO {
    private String id;
    private String groupId;
    private String name;
    private Boolean transmitting;
    private String runStatus;

    private PortStatusSnapshotDTO aggregateStatus;
    private List<NodePortStatusSnapshotDTO> nodeStatuses;

    @ApiModelProperty("Whether the port has incoming or outgoing connections to a remote NiFi.")
    public Boolean isTransmitting() {
        return transmitting;
    }

    public void setTransmitting(Boolean transmitting) {
        this.transmitting = transmitting;
    }


    @ApiModelProperty("The id of the port.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @ApiModelProperty("The id of the parent process group of the port.")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    @ApiModelProperty("The name of the port.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @ApiModelProperty("The run status of the port.")
    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    @ApiModelProperty("A status snapshot that represents the aggregate stats of all nodes in the cluster. If the NiFi instance is "
        + "a standalone instance, rather than a cluster, this represents the stats of the single instance.")
    public PortStatusSnapshotDTO getAggregateStatus() {
        return aggregateStatus;
    }

    public void setAggregateStatus(PortStatusSnapshotDTO aggregateStatus) {
        this.aggregateStatus = aggregateStatus;
    }

    @ApiModelProperty("A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than "
        + "a cluster, this may be null.")
    public List<NodePortStatusSnapshotDTO> getNodeStatuses() {
        return nodeStatuses;
    }

    public void setNodeStatuses(List<NodePortStatusSnapshotDTO> nodeStatuses) {
        this.nodeStatuses = nodeStatuses;
    }
}

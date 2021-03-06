/*
 * Copyright (c) 2008-2020, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.jet.contrib.influxdb;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * A function which maps a single measurement row to a user object.
 *
 * @param <R> type of returned objects
 */
@FunctionalInterface
public interface MeasurementProjection<R> extends Serializable {

    /**
     * @param name        measurement name
     * @param tags        tag set for the measurement
     * @param columnNames list of column names
     * @param values      list of values
     * @return <R> return object type
     */
    R apply(String name, Map<String, String> tags, List<String> columnNames, List<Object> values);

}

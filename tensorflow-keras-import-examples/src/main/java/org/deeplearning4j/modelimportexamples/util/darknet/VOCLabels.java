/*
 *  ******************************************************************************
 *  *
 *  *
 *  * This program and the accompanying materials are made available under the
 *  * terms of the Apache License, Version 2.0 which is available at
 *  * https://www.apache.org/licenses/LICENSE-2.0.
 *  *
 *  *  See the NOTICE file distributed with this work for additional
 *  *  information regarding copyright ownership.
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  * License for the specific language governing permissions and limitations
 *  * under the License.
 *  *
 *  * SPDX-License-Identifier: Apache-2.0
 *  *****************************************************************************
 */

package org.deeplearning4j.modelimportexamples.util.darknet;

import org.deeplearning4j.common.resources.DL4JResources;
import org.deeplearning4j.zoo.util.BaseLabels;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class VOCLabels extends BaseLabels {

    public VOCLabels() throws IOException {
        super("voc.names");
    }

    @Override
    protected URL getURL() {
        try {
            return DL4JResources.getURL("resources/darknet/voc.names");
        } catch (MalformedURLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    protected String resourceName() {
        return "darknet";
    }

    @Override
    protected String resourceMD5() {
        return "bd70d6c917e90b6b67275b9ebda1b631";
    }
}
